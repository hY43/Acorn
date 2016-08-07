package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MakeConnection {
	// DB 연결만 하는 객체.
	// 싱글톤 패턴을 적용.
	// -> 무겁거나 한개이상의 객체가 필요 없을때
	private static MakeConnection mc = new MakeConnection(); // class 가 로딩되기 전에 단 한번만 객체를 생성하며 그 이후에는 생성자가 private이므로 생성할 수 없다.
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private MakeConnection(){
		

	}
	
	public static MakeConnection getInstance(){
		return mc;
	}
	
	public Connection getConnection(){
		if(conn==null){
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				// System.out.println(conn);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("드라이버 연동 실패");
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("DB 연결 실패");
				e.printStackTrace();
			}
		}
		return conn;
	}
}
