package d20160603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCEx2 {
	public static void main(String[] args) {
		
		System.out.print("�˻��� �μ����� �Է��ϼ��� : ");
		String data="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			data = br.readLine();
			System.out.println("data : "+data);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		// 0. ����
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl"; // �ڹٿ��� ����Ŭ����� �淮 ����̹� ���:ip:port��ȣ:db��ġ�̸�
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		
		// 1. ����̹� �ε�
		try {
			Class.forName(driver);
			// 2. Connection	
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
		} catch (SQLException e) {
				System.out.println("db ���� ����");
		}		
		// 3. SQL��
		sb.append("SELECT * FROM dept ");
		sb.append("WHERE dname = upper(?) ");
		System.out.println("����� sql�� : "+sb.toString());
		
		try {
			// 4. ���尴ü
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, data);
			//pstmt.setString(1, data.toUpperCase());
			// 5. ����
			rs = pstmt.executeQuery();
			while(rs.next()){
				// 6. ���ڵ庰 logic ó��
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println("deptno : "+deptno+" dname : "+dname+" loc : "+loc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 7. �ڿ��ݳ�(close())
		
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
