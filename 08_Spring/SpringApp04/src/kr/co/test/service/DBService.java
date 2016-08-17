package kr.co.test.service;

import kr.co.test.app.vo.DeptVO;

public interface DBService {
	public void readAll();
	public void readOne(int no);
	public void write(DeptVO vo);
	public void modify(DeptVO vo);
	public void drop(int no);
}	
