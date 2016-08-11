package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;

public class MakeConnection{
	private static MakeConnection mc = new MakeConnection();
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.74:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn = null;
	
	public MakeConnection(){}
	public static MakeConnection getInstance(){
		return mc;
	}
	public Connection getConnection(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		return conn;
	}
}
