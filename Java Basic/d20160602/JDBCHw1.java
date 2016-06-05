package d20160602;
// Hw01, 아래와 같이 출력하시오
// EMP Table
// 사번 이름 급여 부서번호
// -----------------
// 값~~~~~~~~~~~~~~~

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
		
		// 1. jdbc Driver 로딩.
		try {
			Class.forName(driver);
			// 2. Connection 생성
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 3. SQL 문 작성
		String sql = "select empno, ename, sal, deptno from emp where ename = 'SCOTT'";
		
		// 4. 문장 객체
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			// 5. 실행
			rs = stmt.executeQuery(sql);
			// 6. 레코드 별 로직 처리		
			System.out.println("사번  이름  급여  부서번호");
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
		

		// 7. 자원 반납
		
	}
}
