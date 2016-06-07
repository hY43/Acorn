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
		// ��ü �ʱ�ȭ
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		}catch(ClassNotFoundException e){
			System.out.println("����̹� �ε� ����");
		}catch(SQLException e){
			System.out.println("�����ͺ��̽� ���� ����");
		}
	}
	
	/* Member Method */
	// VO: Value Object(�����͸� ��� ��ü)
	
	// selectAll Method Start.
	public ArrayList<DeptVO> selectAll(){ // � �����Ͱ� �ִ��� �𸣱� ������ ArrayList ���
		// ��ü ��ȸ �ϴ� �޼���.
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		sb.setLength(0); // ������ StringBuffer�� ���Ǿ��� ���� �ֱ� ������ ������ ������ �����ϱ� ���� setLength Method�� ���.
		sb.append("SELECT * FROM dept"); // Table�� ��ü ������ ��ȸ�� ���� Query �� �ۼ�.
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
		// �ѰǸ� ��ȸ
		DeptVO vo = null;
		sb.setLength(0);
		sb.append("SELECT deptno, dname, loc ");
		sb.append("FROM dept ");
		sb.append("WHERE deptno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no); // ù��° ����ǥ���� no ������ ���� ���� �ִ´�.(���ε� ����)	
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
		
		if(vo == null)System.out.println("�μ��� �������� ����");
		return vo;		
	}
	public void insertOne(DeptVO vo){
		// �Է�
		sb.setLength(0);
		sb.append("INSERT INTO dept ");
		sb.append("VALUES (dept_deptno.nextval,?,?)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			pstmt.executeUpdate(); // select ���� �����ϰ�� �׳� update ��Ű�� ������ ����.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteOne(int deptno){
		// �Էµ� �μ� ����.
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
		// �ڿ� �ݳ�.
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
