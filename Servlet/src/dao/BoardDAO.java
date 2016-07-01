package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.BoardVO;

public class BoardDAO {
		private String driver = "oracle.jdbc.driver.OracleDriver";
		private String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
		private String user = "scott";
		private String password = "tiger";
		private Connection conn;
		private PreparedStatement pstmt;
		private ResultSet rs;
		private StringBuffer sb = new StringBuffer();
		
		public BoardDAO(){
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				System.out.println("드라이버 로딩 실패");
			} catch (SQLException se) {
				System.out.println("DB 연결 실패");
			}
		}
		
		public ArrayList<BoardVO> selectAll(){

			BoardVO vo = null;
			ArrayList<BoardVO> list = new ArrayList<BoardVO>(); 
			sb.setLength(0);
			sb.append("SELECT bNo, title, writer, contents, hits, to_char(regdate, 'YYYY-MM-DD') regdate, status FROM board order by bno desc");
			try {
				pstmt = conn.prepareStatement(sb.toString());
				rs = pstmt.executeQuery();
				System.out.println();
				while(rs.next()){ 
					int bno = rs.getInt("bno");
					String title = rs.getString("title");
					String writer = rs.getString("writer");
					String contents = rs.getString("contents");
					int hits = rs.getInt("hits");
					String regDate = rs.getString("regdate");
					int status = rs.getInt("status");
					vo = new BoardVO(bno, title, writer, contents, hits, regDate, status);
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
			sb.append("SELECT bno, title, writer, contents, hits, to_char(regdate, 'YYYY-MM-DD') regdate, status FROM board ");
			sb.append("WHERE bno = ? ");


			try {
				pstmt = conn.prepareStatement(sb.toString());
				pstmt.setInt(1, no);
				rs = pstmt.executeQuery(); 
			if (rs.next()) {
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				int hits = rs.getInt("hits");
				String regDate = rs.getString("regdate");
				int status = rs.getInt("status");
				vo = new BoardVO(no, title, writer, contents, hits, regDate, status);
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
			sb.append("VALUES(BOARD_BNO_SEQ.NEXTVAL,?,?,?,0,to_char(sysdate, 'YYYY-MM-DD'),1)");
			// status : 0 블라인드 처리
			//        : 1 정상글
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
			sb.append("SET title=?,writer=?,contents=?,hits=?,regdate=?, status=? ");
			sb.append("WHERE bno = ?");
						
			try {
				pstmt = conn.prepareStatement(sb.toString());
				
				pstmt.setString(1, vo.getTitle());
				pstmt.setString(2, vo.getWriter()); 
				pstmt.setString(3, vo.getContents()); 
				pstmt.setInt(4, vo.getHits()); 
				pstmt.setString(5, vo.getRegDate()); 
				pstmt.setInt(6, vo.getStatus()); 
				pstmt.setInt(7, vo.getbNo()); 
				 
				pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void close(){
				try {
					if(rs!=null) rs.close();
					if(pstmt!=null) pstmt.close();
					if(conn!=null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}
