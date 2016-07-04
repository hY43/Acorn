package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.GuestBookVO;

public class GuestBookDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.72:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();
	
	public GuestBookDAO(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 연동 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("DB 연동 실패");
		}
	}
	
	public ArrayList<GuestBookVO> selectAll(){
		ArrayList<GuestBookVO> list = new ArrayList<GuestBookVO>();
		GuestBookVO vo = null;
		
		sb.setLength(0);
		sb.append("SELECT gno, writer, contents, to_char(regdate,'YYYY-MM-DD') regdate ");
		sb.append("FROM guestbook");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				int gno = rs.getInt("gno");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				String regDate = rs.getString("regdate");
				vo = new GuestBookVO(gno, writer, contents, regDate);
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;		
	}
	public GuestBookVO selectOne(int no){
		GuestBookVO vo = null;
		sb.setLength(0);
		sb.append("SELECT writer, contents, to_char(regdate, 'YYYY-MM-DD') regdate ");
		sb.append("FROM guestbook ");
		sb.append("WHERE gno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()){
				int gno = no;
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				String regDate = rs.getString("regdate");
				
				vo = new GuestBookVO(gno, writer, contents, regDate);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;		
	}
	
	public void insertOne(GuestBookVO vo){
		sb.setLength(0);
		sb.append("INSERT INTO guestbook ");
		sb.append("VALUES(guestbook_gno_seq.nextval, ?, ?, sysdate)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getContents());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteOne(int no){
		sb.setLength(0);
		sb.append("DELETE FROM guestbook ");
		sb.append("WHERE gno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateOne(GuestBookVO vo){
		sb.setLength(0);
		sb.append("UPDATE guestbook ");
		sb.append("SET writer=?, contents=? ");
		sb.append("WHERE gno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getContents());
			pstmt.setInt(3, vo.getGno());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
