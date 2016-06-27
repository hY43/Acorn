package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;

public class DeptDAO {
	// 환경 변수를 private한 멤버 변수로 생성
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.72:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	StringBuffer sb = new StringBuffer();
	// 기본 생성자에 의해서 Connection 객체를 생성
	public DeptDAO(){
		try {
			/* 1. 드라이버 로딩 */
			Class.forName(driver);
			/* 2. Connection 객체 생성 */
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("conn: " + conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException se) {
			System.out.println("DB 연결 실패");
		}
	}
	
	public ArrayList<DeptVO> selectAll(){
		DeptVO vo;
		ArrayList<DeptVO> list = new ArrayList<DeptVO>();
		sb.setLength(0);
		sb.append("SELECT deptno, dname, loc FROM DEPT");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");
				vo = new DeptVO(deptno, dname, loc);
				list.add(vo);
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
