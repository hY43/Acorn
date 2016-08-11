package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.BoardVO;
import vo.StartEndVO;



public class BoardDAO { //BoardDAO class
	SqlSessionFactory factory;
	
	//private한 멤버변수(전역변수) 선언
	private StringBuffer sb = new StringBuffer();
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	//기본생성자 (constructor)
	public BoardDAO(){
		factory = ConnectionManager.getInstance().getFactory();
	}//constructor end
	
	//전체목록 조회
	public List<BoardVO> selectAll(int start, int end){
		SqlSession ss = factory.openSession(true);
		StartEndVO se = new StartEndVO(start, end);
		List<BoardVO> list = ss.selectList("selectAll",se);
		ss.close();
		return list;
	}//selectAll() end
	
	public void insertOne(String writer, String title, String contents){
		SqlSession ss = factory.openSession(true);
		BoardVO vo = new BoardVO();
		vo.setWritter(writer);
		vo.setTitle(title);
		vo.setContents(contents);
		ss.insert("insertOne", vo);
		ss.close();
	}//insertOne ()end

	public BoardVO selectOne(int bno){
		SqlSession ss = factory.openSession(true);
		BoardVO vo = ss.selectOne("selectOne",bno);
		ss.close();
		return vo;
	}//selectOne() end
	
	public void raiseHits(int bno){
		SqlSession ss = factory.openSession(true);
		ss.update("raiseHits", bno);
		ss.close();
	}//raiseHits() end
	
	public void updateOne(int bno, String writer, String title, String contents){
		SqlSession ss = factory.openSession(true);
		BoardVO vo = new BoardVO();
		vo.setBno(bno);
		vo.setWritter(writer);
		vo.setTitle(title);
		vo.setContents(contents);
		ss.update("updateOne", vo);
		ss.close();		
	}//updateOne() end
	

	public void deleteOne(int bno){
		SqlSession ss = factory.openSession(true);
		ss.delete("deleteOne",bno);
		ss.close();
	}

	//동시에 여러개 지우기(체크박스로 복수의 게시물 지우기)
	public void deleteList(String[] list){
		int[] list2 = new int[list.length];
		for(int i=0;i<list.length;i++){
			list2[i] = Integer.parseInt(list[i]);
		}
		HashMap hm = new HashMap();
		hm.put("list", list2);
		SqlSession ss = factory.openSession(true);
		ss.delete("deleteList", hm);
		ss.close();	
	}//deleteList() end

	//전체 데이터가 몇건인지 알아오기
	public int getTotal(){
		SqlSession ss = factory.openSession(true);
		int count = ss.selectOne("getTotal");
		ss.close();
		return count;
	}// getTotal() end
	
}//BoardDAO() end
