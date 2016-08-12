package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public void insertOne(String writer, String contents, String pw) {
		sb.setLength(0);
		sb.append("INSERT INTO memo(no, writer, contents, wdate, status, pw) ");
		sb.append("VALUES(memo_no_seq.nextval, ?, ?, sysdate, 1, ?) ");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, writer);
			pstmt.setString(2, contents);
			pstmt.setString(3, pw);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//전체 데이터가 몇건인지 알아오기
	public int getTotal(){
		SqlSession ss = factory.openSession(true);
		int count = ss.selectOne("getTotal");
		ss.close();
		return count;
	}// getTotal() end

}
