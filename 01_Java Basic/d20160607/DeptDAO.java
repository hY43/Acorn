package d20160607;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

// DAO: Database Access Object
public class DeptDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.50:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private StringBuffer sb = new StringBuffer();
	private ResultSet rs;
	
	/* Constructor */
	public DeptDAO(){
		// 객체 초기화
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		}catch(ClassNotFoundException e){
			System.out.println("드라이버 로딩 실패");
		}catch(SQLException e){
			System.out.println("데이터베이스 연결 실패");
		}
	}
	
	/* Member Method */
	// VO: Value Object(데이터를 담는 객체)
	
	// selectAll Method Start.
	public ArrayList<DeptVO> selectAll(){ // 몇개 데이터가 있는지 모르기 때문에 ArrayList 사용
		// 전체 조회 하는 메서드.
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		sb.setLength(0); // 이전에 StringBuffer가 사용되었을 수도 있기 때문에 기존의 내용을 삭제하기 위해 setLength Method를 사용.
		sb.append("SELECT * FROM dept"); // Table의 전체 데이터 조회를 위한 Query 문 작성.
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				DeptVO vo = new DeptVO(deptno, dname, loc);
				list.add(vo);
			}
		}catch (SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;		
	} 
	// selectAll Method End
	
	public DeptVO selectOne(int no){
		// 한건만 조회
		DeptVO vo = null;
		sb.setLength(0);
		sb.append("SELECT deptno, dname, loc ");
		sb.append("FROM dept ");
		sb.append("WHERE deptno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no); // 첫번째 물음표에는 no 변수에 들은 값을 넣는다.(바인드 변수)	
			rs = pstmt.executeQuery();
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				vo = new DeptVO(deptno, dname, loc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(vo == null)System.out.println("부서가 존재하지 않음");
		return vo;		
	}
	public void insertOne(DeptVO vo){
		// 입력
		sb.setLength(0);
		sb.append("INSERT INTO dept ");
		sb.append("VALUES (dept_deptno.nextval,?,?)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			pstmt.executeUpdate(); // select 문을 제외하고는 그냥 update 시키는 것으로 실행.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteOne(int deptno){
		// 입력된 부서 삭제.
		sb.setLength(0);
		sb.append("DELETE FROM dept ");
		sb.append("WHERE deptno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, deptno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateOne(DeptVO vo){
		sb.setLength(0);
		sb.append("UPDATE dept ");
		sb.append("SET dname = ?, loc = ? ");
		sb.append("WHERE deptno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			pstmt.setInt(3, vo.getDeptno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(){
		// 자원 반납.
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
