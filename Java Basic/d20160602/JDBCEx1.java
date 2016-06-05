package d20160602;

// DB ���� Ŭ����, �������̽��� ������ Package: java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {
	public static void main(String[] args) {
		// DB ���ῡ �ʿ��� ���� ����.
		String driver = "oracle.jdbc.driver.OracleDriver"; // [oracle.jdbc.driver] package - [OracleDriver] Class
		String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		try {
			// 1. jdbc ����̹� �ε�
			Class.forName(driver); // driver�� ��� ���ڿ��� ���� driver�� �ִ��� Ȯ�� ��, �޸𸮿� �ø���.
			// 2. Connection ��ü�� ����.
			conn = DriverManager.getConnection(url, user, password); // Database�� ����� ���¸� ���ͼ� ����.
			System.out.println(conn);
		}catch(ClassNotFoundException e){
			// Driver�� ���о���� �� �߻��ϴ� Error(Driver �ε� ����)
			e.printStackTrace();
		}catch(SQLException e){
			// ���� ����.
			// 1. IP�� Ʋ��
			// 2. ID/PW�� Ʋ��
			// ......
			e.printStackTrace();
		}
		
		// 3. DB�� ����� SQL ����
		String sql = "SELECT * FROM DEPT";
		
		// 4. ���� ��ü
		Statement stmt = null;
		ResultSet rs = null; // Result Set: Select ���� ���� ������� ����� ��ü
		try {
			stmt = conn.createStatement();
						
			// 5. SQL�� ���� ( select ���� ResultSet ��ü�� ��ȯ )
			rs = stmt.executeQuery(sql);
			
			// 6. Record �� ���� ó��
			while (rs.next()) {
				// rs.next(); // ResultSet�� ���� ������ �̵�.

				// �޾ƿ� ResultSet�� �� ������ Ÿ�Կ� �°� ������ ����.
				int deptno = rs.getInt("deptno"); // Column Name�� deptno�� Column�� ���ͼ� ����.
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				// ��� ���
				System.out.println("deptno: " + deptno + ", dname: " + dname + ", loc: " + loc);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			// 7. �ڿ� �ݳ�(����� �ڿ��� �������� �ݳ�)
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
