package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.MemoVO;

public class MemoDAO {
	private StringBuffer sb = new StringBuffer();
	private PreparedStatement pstmt;
	private ResultSet rs;
	private Connection conn;
	
	public MemoDAO(){
		conn = MakeConnection.getInstance().getConnection();
	}
	public ArrayList<MemoVO> selectAll() {
		ArrayList<MemoVO> list = new ArrayList<MemoVO>();
		sb.setLength(0);
		sb.append("SELECT no, writer, contents, wdate, status, pw ");
		sb.append("FROM memo ORDER BY no desc");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			while(rs.next()){
				int no = rs.getInt("no");
				String writer = rs.getString("writer");
				String contents = rs.getString("contents");
				String wdate = rs.getString("wdate");
				int status = rs.getInt("status");
				String pw = rs.getString("pw");
				MemoVO vo = new MemoVO(no, writer, contents, wdate, status, pw);
				list.add(vo);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

}
