package kr.co.test.web.dao;

import java.util.List;

import kr.co.test.web.dto.BoardDTO;

public interface Dao {
	public int getTotal();
	public List<BoardDTO> selectList(int startNo, int endNo);
	public BoardDTO selectOne(int no);
	public void insertOne(BoardDTO dto);
	public void updateOne(BoardDTO dto);
	public void deleteOne(int no);
}
