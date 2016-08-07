package d20160602;

// DB 관련 클래스, 인터페이스를 포함한 Package: java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx1 {
	public static void main(String[] args) {
		// DB 연결에 필요한 변수 선언.
		String driver = "oracle.jdbc.driver.OracleDriver"; // [oracle.jdbc.driver] package - [OracleDriver] Class
		String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		Connection conn = null;
		try {
			// 1. jdbc 드라이버 로딩
			Class.forName(driver); // driver에 담긴 문자열과 같은 driver가 있는지 확인 후, 메모리에 올린다.
			// 2. Connection 객체를 생성.
			conn = DriverManager.getConnection(url, user, password); // Database에 연결된 상태를 얻어와서 저장.
			System.out.println(conn);
		}catch(ClassNotFoundException e){
			// Driver를 못읽어왔을 때 발생하는 Error(Driver 로딩 실패)
			e.printStackTrace();
		}catch(SQLException e){
			// 연결 실패.
			// 1. IP가 틀림
			// 2. ID/PW가 틀림
			// ......
			e.printStackTrace();
		}
		
		// 3. DB에 사용할 SQL 문장
		String sql = "SELECT * FROM DEPT";
		
		// 4. 문장 객체
		Statement stmt = null;
		ResultSet rs = null; // Result Set: Select 문을 통해 얻어지는 결과의 객체
		try {
			stmt = conn.createStatement();
						
			// 5. SQL문 실행 ( select 문은 ResultSet 객체를 반환 )
			rs = stmt.executeQuery(sql);
			
			// 6. Record 별 로직 처리
			while (rs.next()) {
				// rs.next(); // ResultSet의 다음 행으로 이동.

				// 받아온 ResultSet을 각 데이터 타입에 맞게 변수에 대입.
				int deptno = rs.getInt("deptno"); // Column Name이 deptno인 Column을 얻어와서 저장.
				String dname = rs.getString("dname");
				String loc = rs.getString("loc");

				// 결과 출력
				System.out.println("deptno: " + deptno + ", dname: " + dname + ", loc: " + loc);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			// 7. 자원 반납(사용한 자원을 역순으로 반납)
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
