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
		
		System.out.print("검색할 부서명을 입력하세요 : ");
		String data="";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			data = br.readLine();
			System.out.println("data : "+data);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		// 0. 변수
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl"; // 자바에서 오라클연결시 경량 드라이버 사용:ip:port번호:db설치이름
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer();
		
		// 1. 드라이버 로딩
		try {
			Class.forName(driver);
			// 2. Connection	
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException e) {
				System.out.println("db 연결 실패");
		}		
		// 3. SQL문
		sb.append("SELECT * FROM dept ");
		sb.append("WHERE dname = upper(?) ");
		System.out.println("사용할 sql문 : "+sb.toString());
		
		try {
			// 4. 문장객체
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, data);
			//pstmt.setString(1, data.toUpperCase());
			// 5. 실행
			rs = pstmt.executeQuery();
			while(rs.next()){
				// 6. 레코드별 logic 처리
				int deptno = rs.getInt(1);
				String dname = rs.getString(2);
				String loc = rs.getString(3);
				System.out.println("deptno : "+deptno+" dname : "+dname+" loc : "+loc);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 7. 자원반납(close())
		
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
