package kr.co.test.app.dao;

import java.util.ArrayList;

import kr.co.test.app.vo.DeptVO;

public interface CommonDAO {
	public void connection();
	public void insert(DeptVO vo);
	public void update(DeptVO vo);
	public void delete(int no);
	public DeptVO selectOne(int no);
	public ArrayList<DeptVO> selectAll();
	public void close();
}
