package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.BoardVO;



public class BoardDAO { //BoardDAO class
	//private한 멤버변수(전역변수) 선언
	private StringBuffer sb = new StringBuffer();
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	//기본생성자 (constructor)
	public BoardDAO(){
		conn = MakeConnection.getInstance().getConnection();
	}//constructor end
	
	//전체목록 조회
	public ArrayList<BoardVO> selectAll(int start, int end){
		ArrayList<BoardVO> list = new ArrayList<BoardVO>(); // ArrlayList가 사용할 객체의 타입이 BoardVO인 변수 list 선언 (<>generics)
		sb.setLength(0);	//sb를 비워줌. 
		sb.append("SELECT BNO, WRITER, TITLE, CONTENTS, HITS, regdate, STATUS "); //저장된 StringBuffer 변수 값 뒤에 새로 입력한 값(SQL문)을 추가함.
		sb.append("FROM (SELECT ROWNUM RN, BNO, WRITER, TITLE, CONTENTS,HITS, regdate, STATUS ");
		sb.append("FROM (SELECT * FROM board ORDER BY regdate desc)) ");
		sb.append("WHERE RN >= ? and RN <= ? ");
		/*SQL문 .  from절이 제일 먼저 인식하기 때문에 제일 먼저 인식해야하는 sql문을 from절에 먼저 넣어서 실행하게 해줌! rownum rn은 게시물에 번호를 붙여주는 역할!
		 * SELECT BNO, WRITER, TITLE, CONTETNS, regdate, STATUS
		FROM (SELECT ROWNUM RN, BNO, WRITER, TITLE, CONTETNS, regdate, STATUS
			FROM (SELECT * FROM board ORDER BY regdate desc))
		WHERE RN >= 11 and RN <= 20*/
		
		try {
			pstmt = conn.prepareStatement(sb.toString());	
			//bind 변수( ? ) 가 있나없나 유무보고
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			while(rs.next()){
			int BNO = rs.getInt("BNO");
			String writer = rs.getString("writer");
			String title  = rs.getString("title");
			String contents = rs.getString("contents");
			int hits = rs.getInt("hits");
			String regdate = rs.getString("regdate");
			int status = rs.getInt("status");
			
			BoardVO vo = new BoardVO(BNO, writer, title, contents, hits, regdate, status);
			list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}//selectAll() end
	
	public void insertOne(String writer, String title, String contents){
		sb.setLength(0);
		sb.append("INSERT INTO board ");
		sb.append("VALUES(board_BNO_seq.nextval,?,?,?,0,sysdate,1) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, contents);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//insertOne ()end
	
	public BoardVO selectOne(int BNO){
		sb.setLength(0);
		sb.append("SELECT * FROM board ");
		sb.append("WHERE BNO = ?");
		BoardVO vo = null;
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, BNO);
			rs = pstmt.executeQuery();
			if(rs.next()){
			String writer = rs.getString("writer");
			String title  = rs.getString("title");
			String contents = rs.getString("contents");
			int hits = rs.getInt("hits");
			String regdate = rs.getString("regdate");
			int status = rs.getInt("status");
			
			vo = new BoardVO(BNO, writer, title, contents, hits, regdate, status);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}//selectOne() end
	
	public void updateOne(int BNO, String writer, String title, String contents){
		sb.setLength(0);
		sb.append("UPDATE board ");
		sb.append("SET writer = ?, title = ?, contents =? ");
		sb.append("WHERE BNO = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, writer);
			pstmt.setString(2, title);
			pstmt.setString(3, contents);
			pstmt.setInt(4, BNO);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}//updateOne() end
	
	public void deleteOne(int BNO){
		sb.setLength(0);
		sb.append("DELETE board ");
		sb.append("WHERE BNO = ? ");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, BNO);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void raiseHits(int BNO){
		sb.setLength(0);
		sb.append("UPDATE board ");
		sb.append("SET hits = hits+1 ");
		sb.append("WHERE BNO = ? ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, BNO);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//raiseHits() end
	
	//동시에 여러개 지우기(체크박스로 복수의 게시물 지우기)
	public void deleteList(String[] list){
		int[] list2 = new int[list.length];
		for (int i = 0; i < list.length; i++) {
			list2[i] = Integer.parseInt(list[i]);
		}
		sb.setLength(0);
		sb.append("DELETE board ");
		sb.append("WHERE BNO in ( ");
		for (int i = 0; i < list2.length; i++) {
			sb.append(" ? ");
			if(i != list2.length-1) sb.append(",");
		}
		sb.append(" )");
		System.out.println("sql : "+ sb.toString());
		try {
			pstmt = conn.prepareStatement(sb.toString());
			for (int i = 1; i <= list2.length; i++) {
				pstmt.setInt(i, list2[i-1]);
			}
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//deleteList() end
	
	//전체 데이터가 몇건인지 알아오기
	public int getTotal(){
		sb.setLength(0);
		sb.append("SELECT COUNT(*) CNT FROM board");
		int result = -1; //비정상적이라는 의미로 -1
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			rs.next();
			result = rs.getInt("cnt");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}// getTotal() end
	
}//BoardDAO() end
