package kr.co.test.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import kr.co.test.web.dto.BoardDTO;
import kr.co.test.web.dto.StartEnd;

public class BoardOracleDAO implements Dao {
	@Autowired
	SqlSession ss;

	@Override
	public int getTotal() {
		return ss.selectOne("kr.co.test.board.getTotal");
	}

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<BoardDTO> selectList(int startNo, int endNo) {
		StartEnd se = new StartEnd(startNo, endNo);
		return ss.selectList("kr.co.test.board.total", se);
	}

	@Override
	public BoardDTO selectOne(int no) {
		return ss.selectOne("kr.co.test.board.getOne", no);
	}

	@Override
	public void insertOne(BoardDTO dto) {
		/* board.xml의 insert id가 add로 같아야 함 */
		ss.insert("kr.co.test.board.add", dto);
	}

	@Override
	public void updateOne(BoardDTO dto) {
		ss.update("kr.co.test.board.updateOne", dto);
	}

	@Override
	public void deleteOne(int no) {
		ss.delete("kr.co.test.board.deleteOne", no);
	}
}