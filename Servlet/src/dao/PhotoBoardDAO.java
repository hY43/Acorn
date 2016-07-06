package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.PhotoBoardVO;

public class PhotoBoardDAO{
	private ResultSet rs;
	private PreparedStatement pstmt;
	private StringBuffer sb = new StringBuffer();
	private Connection conn;

		public PhotoBoardDAO(){
			conn = MakeConnection.getInstance().getConnection();
		}
		
		public ArrayList<PhotoBoardVO> selectAll(){
			ArrayList<PhotoBoardVO> list = new ArrayList<PhotoBoardVO>();
			PhotoBoardVO vo = null;
			sb.setLength(0);
			sb.append("SELECT pno, title, contents, writer, filename, to_char(regdate, 'YYYY-MM-DD') regdate FROM photoboard");
		
			try {
				pstmt = conn.prepareStatement(sb.toString());
				rs = pstmt.executeQuery();
				
				while(rs.next()){
					int pno = rs.getInt("pno");
					String title = rs.getString("title");
					String contents = rs.getString("contents");
					String writer = rs.getString("writer");
					String filename = rs.getString("filename");
					String regDate = rs.getString("regdate");
					vo = new PhotoBoardVO(pno, title, contents, writer, filename, regDate);
					list.add(vo);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return list;
		}
		public PhotoBoardVO selectOne(int no){
			PhotoBoardVO vo = null;
			sb.setLength(0);
			sb.append("SELECT title, contents, writer, filename, regdate");
			sb.append("FROM photoboard ");
			sb.append("WHERE pno = ? ");
			
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setInt(1, no);
				rs = pstmt.executeQuery();
				if(rs.next()){
					String title = rs.getString("title");
					String contents = rs.getString("contents");
					String writer = rs.getString("writer");
					String filename = rs.getString("filename");
					String regdate = rs.getString("regdate");
					
					vo = new PhotoBoardVO(no, title, contents, writer, filename, regdate);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return vo;
		}
		
		public void insertOne(PhotoBoardVO vo){
			sb.setLength(0);
			sb.append("INSERT INTO photoboard ");
			sb.append("VALUES(photoboard_pno_seq.nextval,?,?,?,?,sysdate)");
			
			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setString(1, vo.getTitle());
				pstmt.setString(2, vo.getContents());
				pstmt.setString(3, vo.getWriter());
				pstmt.setString(4, vo.getFilename());
				
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
