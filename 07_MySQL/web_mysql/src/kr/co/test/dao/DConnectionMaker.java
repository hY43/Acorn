package kr.co.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker{

	@Override
	public Connection makeConnection() throws ClassNotFoundException, SQLException {
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.0.74:3306/testdb";
		String user="sang";
		String password = "won";
		Class.forName(driver);
		
		return DriverManager.getConnection(url, user, password);
	}

}
