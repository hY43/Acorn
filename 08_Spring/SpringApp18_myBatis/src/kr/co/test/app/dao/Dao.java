package kr.co.test.app.dao;

import java.util.List;

import kr.co.test.app.vo.DeptVO;

public interface Dao {
	public List<DeptVO> selectAll();
	public DeptVO selectOne(int no);
	public void insertOne(String dname, String loc);
	public void updateOne(DeptVO vo);
	public void deleteOne(int no);
}
