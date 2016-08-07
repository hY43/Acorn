package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.BoardVO;

public class BoardDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver"; // driver 연동을 위한 패키지가 작성된 문자열, oracle.jdbc.driver 패키지의 OracleDriver Class
	private String url = "jdbc:oracle:thin:@192.168.0.74:1521:orcl"; // Database 접속을 위한 url 문자열 생성.
	private String user = "scott"; // DB 접속을 위한 ID
	private String password = "tiger"; // DB 접속을 위한 Password
	private ResultSet rs; // select 질의 문의 결과를 저장하기 위한 ResultSet 객체 생성
	private PreparedStatement pstmt; // 문장 객체 생성을 위한 PreparedStatement Type의 참조 변수 선언
	private Connection conn; // Database와의 연결 상태를 저장하기 위한 Connection Type의 참조 변수 선언.
	private StringBuffer sb = new StringBuffer(); // SQL 문의 문자열 저장을 위한 StringBuffer 객체 생성.
	
	public BoardDAO(){
		try {
			Class.forName(driver); // 드라이버 로딩
			conn = DriverManager.getConnection(url, user, password); // 사용자 계정 정보를 이용하여 Databse 접속 및 연결 상태 저장.
			// System.out.println(conn);
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
	
	public ArrayList<BoardVO> selectAll(int startNo, int endNo){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		BoardVO vo = null;
		sb.setLength(0);
		/*sb.append("SELECT bno, title, writer, contents, hits, to_char(regdate, 'YYYY-MM-DD') regdate, status ");*/
		sb.append("SELECT bno, title, writer, contents, hits, regdate, status ");
		sb.append("FROM (SELECT rownum r, bno, title, writer, contents, hits, regdate, status ");
		sb.append("FROM (SELECT bno, title, writer, contents, hits, regdate, status FROM board ORDER BY bno DESC) ");
		sb.append("WHERE rownum <= ? ) ");
		sb.append("WHERE r >= ? ");
	
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, endNo);
			pstmt.setInt(2, startNo);
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
		sb.append("SELECT title, writer, contents, hits, to_char(regdate, 'YYYY-MM-DD') regdate, status ");
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
	
	public int getTotalCount(){
		// 전체 데이터 수를 알아오기 위한 Method
		int totalCnt = 0; // 전체 데이터 수 저장을 위한 변수로 0으로 초기화.
		sb.setLength(0);
		sb.append("SELECT count(*) cnt FROM board"); // SQL 내장 함수 count를 사용하여 전체 row 수 검색
		
		try {
			pstmt = conn.prepareStatement(sb.toString()); // 작성한 SQL 문을 이용하여 문장 객체 생성.
			rs = pstmt.executeQuery(); // 문장 객체 실행 및 결과 값을 resultSet에 저장.
			rs.next(); // resultSet 의 항목 얻어옴.
			totalCnt = rs.getInt("cnt"); // 검색의 결과를 totalCnt에 저장
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return totalCnt; // 결과로 전체 데이터 수 반환.
	}
	
	public void raiseHits(int no){
		// 상세 페이지 보기 클릭 시 조회 수를 증가 시킬 Method
		sb.setLength(0);
		sb.append("UPDATE board ");
		sb.append("SET hits=hits+1 "); // 기존의 값에서 1을 증가 시킴.
		sb.append("where bno = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString()); // 문장 객체 생성
			pstmt.setInt(1, no); // 바인드 변수와 입력 받은 bno 값 매칭.
			pstmt.executeUpdate(); // 문장 객체 실행.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
