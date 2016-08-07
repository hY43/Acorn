package d20160607;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	// selectAll
	// selectOne(int no)
	// insertOne(EmpVO vo)
	// updateOne(EmpVO vo)
	// deleteOne(int no)
	// close()
	// 단 emp Table의 hiredate는 String Type으로 설정할 것.
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.50:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private StringBuffer sb = new StringBuffer();
	private ResultSet rs;
	
	public EmpDAO(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException se) {
			System.out.println("데이터베이스 연결 실패");
		}
	}
	
	public ArrayList<EmpVO> selectAll(){
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		sb.setLength(0);
		sb.append("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp");
	
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				 int empno = rs.getInt("empno");
				 String ename = rs.getString("ename");
				 String job = rs.getString("job");
				 int mgr = rs.getInt("mgr");
				 String hiredate = rs.getString("hiredate");
				 float sal = rs.getFloat("sal");
				 float comm = rs.getFloat("comm");
				 int deptno = rs.getInt("deptno");
				 EmpVO vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
				 list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public EmpVO selectOne(int no){
		EmpVO vo = null;
		sb.setLength(0);
		sb.append("SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno FROM emp WHERE empno = ?");
			
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			while(rs.next()){
				 int empno = rs.getInt("empno");
				 String ename = rs.getString("ename");
				 String job = rs.getString("job");
				 int mgr = rs.getInt("mgr");
				 String hiredate = rs.getString("hiredate");
				 float sal = rs.getFloat("sal");
				 float comm = rs.getFloat("comm");
				 int deptno = rs.getInt("deptno");
				 vo = new EmpVO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(vo == null) System.out.println("사원이 존재하지 않습니다.");
		return vo;
	}
	
	public void insertOne(EmpVO vo){
		
	}
	
}
