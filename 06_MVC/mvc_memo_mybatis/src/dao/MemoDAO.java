package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


import vo.MemoVO;
import vo.StartEndVO;

public class MemoDAO {
	SqlSessionFactory factory;
	
	//private한 멤버변수(전역변수) 선언
	private StringBuffer sb = new StringBuffer();
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	public MemoDAO(){
		factory = ConnectionManager.getInstance().getFactory();
	}
	public List<MemoVO> selectAll(int start, int end) {
		SqlSession ss = factory.openSession(true);
		StartEndVO se = new StartEndVO(start, end);
		List<MemoVO> list = ss.selectList("selectAll",se);
		ss.close();
		return list;
	}
	
	public void insertOne(String writer, String contents, String pw){
		SqlSession ss = factory.openSession(true);
		MemoVO vo = new MemoVO();
		vo.setWriter(writer);
		vo.setContents(contents);
		vo.setPw(pw);
		ss.insert("insertOne", vo);
		ss.close();
	}
	
	//전체 데이터가 몇건인지 알아오기
	public int getTotal(){
		SqlSession ss = factory.openSession(true);
		int count = ss.selectOne("getTotal");
		ss.close();
		return count;
	}// getTotal() end

	public String searchPw(int no) {
		SqlSession ss = factory.openSession(true);
		String pw = ss.selectOne("searchPw", no);
		ss.close();
		return pw;
	}

	public void deleteOne(int no) {
		SqlSession ss = factory.openSession(true);
		ss.delete("deleteOne", no);
		ss.close();
	}

	public void updateOne(int no, String contents) {
		SqlSession ss = factory.openSession(true);
		MemoVO vo = new MemoVO();
		vo.setNo(no);
		vo.setContents(contents);
		ss.update("updateOne",vo);
		ss.close();
	}

}
