package d20160603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 사원명 입력시 사원의 사번, 이름, 급여, job 출력?
public class JDBCHw2 {

	public static void main(String[] args) {
		
		System.out.print("검색할 사원명을 입력 : ");
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sb.append("SELECT empno, ename, sal, job FROM emp WHERE ename = upper(?) ");
		System.out.println("사용할 sql문 : "+sb.toString());
		
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
