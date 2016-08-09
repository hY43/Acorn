package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.BoardVO;

public class BoardDAO {
	private StringBuffer sb = new StringBuffer();
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	public BoardDAO(){
		conn = MakeConnection.getInstance().getConnection();
	}
	
	public ArrayList<BoardVO> selectAll(){
		sb.setLength(0);
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		sb.append("SELECT * FROM board ORDER BY bno DESC");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				int hits = rs.getInt("hits");
				String regDate = rs.getString("regdate");
				int status = rs.getInt("status");
				BoardVO vo = new BoardVO(bno, title, writer, contents, hits, regDate, status);
				list.add(vo);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public BoardVO selectOne(int bno){
		sb.setLength(0);
		
		BoardVO vo = null;
		sb.append("SELECT * FROM board ");
		sb.append("WHERE bno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				int hits = rs.getInt("hits");
				String regDate = rs.getString("regdate");
				int status = rs.getInt("status");
				vo = new BoardVO(bno, title, writer, contents, hits, regDate, status);
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	
	public void insertOne(String writer, String title, String contents){
		sb.setLength(0);
		sb.append("INSERT INTO board ");
		sb.append("VALUES(board_bno_seq.nextval, ?, ?, ?, 0, sysdate, 1)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, title);
			pstmt.setString(2, writer);
			pstmt.setString(3, contents);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateOne(int bno, String writer, String title, String contents) {
		sb.setLength(0);
		sb.append("UPDATE board ");
		sb.append("SET writer=?, title=?, contents=? ");
		sb.append("WHERE bno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, contents);
			pstmt.setInt(4, bno);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void raiseHits(int bno){
		sb.setLength(0);
		sb.append("UPDATE board ");
		sb.append("SET hits=hits+1 ");
		sb.append("WHERE bno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deleteOne(int bno) {
		sb.setLength(0);
		sb.append("DELETE FROM board ");
		sb.append("WHERE bno = ?");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, bno);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
