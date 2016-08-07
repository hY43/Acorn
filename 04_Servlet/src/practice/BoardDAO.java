package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BoardDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver"; // driver 연동을 위한 패키지가 작성된 문자열, oracle.jdbc.driver 패키지의 OracleDriver Class
	private String url = "jdbc:oracle:thin:@172.30.1.13:1521:orcl"; // Database 접속을 위한 url 문자열 생성.
	private String user = "scott"; // DB 접속을 위한 ID
	private String password = "tiger"; // DB 접속을 위한 Password
	private ResultSet rs; // 
	private PreparedStatement pstmt;
	private Connection conn;
	private StringBuffer sb = new StringBuffer();
	
	public BoardDAO(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(conn);
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
	
	public ArrayList<BoardVO> selectAll(){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO vo = null;
		sb.setLength(0);
		sb.append("SELECT bno, title, writer, contents, hits, regdate, status FROM board");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				int hits = rs.getInt("hits");
				String regdate = rs.getString("regdate");
				int status = rs.getInt("status");
				vo = new BoardVO(bno, title, writer, contents, hits, regdate, status);
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public BoardVO selectOne(int no){
		BoardVO vo = null;
		sb.setLength(0);
		sb.append("SELECT title, writer, contents, hits, regdate, status ");
		sb.append("FROM board ");
		sb.append("WHERE bno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()){
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				int hits = rs.getInt("hits");
				String regdate = rs.getString("regdate");
				int status = rs.getInt("status");
				vo = new BoardVO(no, title, writer, contents, hits, regdate, status);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	
	public void insertOne(BoardVO vo){
		sb.setLength(0);
		sb.append("INSERT INTO board ");
		sb.append("VALUES(board_bno_seq.nextval, ?, ?, ?, 0, sysdate, 1)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContents());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteOne(int no){
		sb.setLength(0);
		sb.append("DELETE FROM board ");
		sb.append("WHERE bno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateOne(BoardVO vo){
		sb.setLength(0);
		sb.append("UPDATE board ");
		sb.append("SET title = ?, writer = ?, contents = ? ");
		sb.append("WHERE bno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContents());
			pstmt.setInt(4, vo.getBno());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
