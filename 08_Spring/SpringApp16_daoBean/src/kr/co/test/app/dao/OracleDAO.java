package kr.co.test.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleDAO implements Dao{
	Connection conn;
	StringBuffer sb = new StringBuffer();
	ResultSet rs;
	PreparedStatement pstmt;
	
	public void init(){
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.74:1521:orcl";
		String user = "scott";
		String password = "tiger";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("driver 연동 실패");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("DB 연동 실패");
			e.printStackTrace();
		}
	}
	
	@Override
	public int selectCount() {
		sb.setLength(0);
		sb.append("SELECT COUNT(*) cnt FROM dept");
		int result = 0;
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			if(rs.next()){
				result = rs.getInt("cnt");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public void close(){
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
