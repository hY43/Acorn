package d20160603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// ����� �Է½� ����� ���, �̸�, �޿�, job ���?
public class JDBCHw2 {

	public static void main(String[] args) {
		
		System.out.print("�˻��� ������� �Է� : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String data="";
		try {
			data = br.readLine();
			System.out.println("data : "+data);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
	
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sb.append("SELECT empno, ename, sal, job FROM emp WHERE ename = upper(?) ");
		System.out.println("����� sql�� : "+sb.toString());
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, data);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				int sal = rs.getInt(3);
				String job = rs.getString(4);
				System.out.println("empno : "+empno+" ename : "+ename+" sal : "+sal+" job : "+job);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
}
