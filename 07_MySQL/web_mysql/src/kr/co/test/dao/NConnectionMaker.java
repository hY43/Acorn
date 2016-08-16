package kr.co.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NConnectionMaker implements ConnectionMaker{

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.74:1521:orcl";
		String user="scott";
		String password = "tiger";
		Class.forName(driver);
		
		return DriverManager.getConnection(url, user, password);
	}

}
