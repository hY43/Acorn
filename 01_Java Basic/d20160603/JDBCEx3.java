package d20160603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx3 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl"; // 자바에서 오라클연결시 경량 드라이버 사용:ip:port번호:db설치이름
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
				System.out.println("db 연결 실패");
		}
		
		//sb.append("INSERT INTO dept ");
		//sb.append("VALUES (?,?,?) ");
		sb.append("DELETE dept ");
		sb.append("WHERE deptno = ?");
		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			// ? : binding
			pstmt.setInt(1, 42);
			/*pstmt.setString(2, "영업");
			pstmt.setString(3, "강남");*/
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
