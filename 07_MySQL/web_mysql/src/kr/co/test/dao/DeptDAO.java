package kr.co.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import kr.co.test.dto.DeptDTO;

public class DeptDAO   {
	private ConnectionMaker connectionMaker;
	public DeptDAO(ConnectionMaker connectionMaker){
		this.connectionMaker = connectionMaker;		
	}
	public void add(DeptDTO dto) throws ClassNotFoundException, SQLException{
		StringBuffer sb = new StringBuffer();		
		Connection conn = connectionMaker.makeConnection();
		PreparedStatement pstmt = null;
		
		sb.setLength(0);
		
		sb.append("insert into dept ");
		sb.append("VALUES (?,?,?)");
		
		pstmt = conn.prepareStatement(sb.toString());
		pstmt.setInt(1, dto.getDeptno());
		pstmt.setString(2, dto.getDname());
		pstmt.setString(3, dto.getLoc());
		
		pstmt.executeUpdate();
		System.out.println("성공적으로 수행되었습니다.");
		pstmt.close();
		conn.close();
	}
	
	public void drop(int deptno) throws ClassNotFoundException, SQLException{
		StringBuffer sb = new StringBuffer();		
		Connection conn = connectionMaker.makeConnection();
		PreparedStatement pstmt = null;

		sb.setLength(0);

		sb.append("DELETE FROM dept ");
		sb.append("WHERE deptno = ?");

		pstmt = conn.prepareStatement(sb.toString());
		pstmt.setInt(1, deptno);
				
		pstmt.executeUpdate();
		System.out.println("성공적으로 수행되었습니다.");
		pstmt.close();
		conn.close();
	}
	
	// 리팩토링 사항
	// 1. connection
	// 2. bind 변수
	// 3. close
	// 데이터베이스의 종류마다 Connection 하는 정보가 바뀌어야하는데, 이를 고려해
	
}
