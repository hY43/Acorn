package d20160603;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx3 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl"; // �ڹٿ��� ����Ŭ����� �淮 ����̹� ���:ip:port��ȣ:db��ġ�̸�
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
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
				System.out.println("db ���� ����");
		}
		
		//sb.append("INSERT INTO dept ");
		//sb.append("VALUES (?,?,?) ");
		sb.append("DELETE dept ");
		sb.append("WHERE deptno = ?");
		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			// ? : binding
			pstmt.setInt(1, 42);
			/*pstmt.setString(2, "����");
			pstmt.setString(3, "����");*/
			
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
