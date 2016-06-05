package d20160602;
// Hw01, �Ʒ��� ���� ����Ͻÿ�
// EMP Table
// ��� �̸� �޿� �μ���ȣ
// -----------------
// ��~~~~~~~~~~~~~~~

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHw1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		// 1. jdbc Driver �ε�.
		try {
			Class.forName(driver);
			// 2. Connection ����
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. SQL �� �ۼ�
		String sql = "select empno, ename, sal, deptno from emp where ename = 'SCOTT'";
		
		// 4. ���� ��ü
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			// 5. ����
			rs = stmt.executeQuery(sql);
			// 6. ���ڵ� �� ���� ó��		
			System.out.println("���  �̸�  �޿�  �μ���ȣ");
			System.out.println("------------------");
			while(rs.next())
			{
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				int deptno = rs.getInt("deptno");
				System.out.println(empno + "  " + ename + " " + sal + " " + deptno);
			}
		}catch(SQLException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		// 7. �ڿ� �ݳ�
		
	}
}
