package kr.co.test.app.dao;

import java.util.ArrayList;

import kr.co.test.app.vo.DeptVO;

public interface Dao {
	public ArrayList<DeptVO> selectAll();
	public DeptVO selectOne(int no);
	public void insertOne(DeptVO vo);
	public void updateOne(DeptVO vo);
	public void deleteOne(int no);
}
