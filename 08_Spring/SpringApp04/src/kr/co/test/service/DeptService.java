package kr.co.test.service;

import kr.co.test.app.dao.CommonDAO;
import kr.co.test.app.vo.DeptVO;

public class DeptService implements DBService{
	// 다형성을 이용하여 상황에 따라 MySqlDAO 혹은 OracleDAO 객체를 받아서 사용한다.
	CommonDAO dao;
	
	public DeptService(CommonDAO dao){
		this.dao = dao;
		this.dao.connection();
	}
	@Override
	public void readAll() {
		dao.selectAll();
	}

	@Override
	public void readOne(int no) {
		dao.selectOne(no);
	}

	@Override
	public void write(DeptVO vo) {
		dao.insert(vo);
	}

	@Override
	public void modify(DeptVO vo) {
		dao.update(vo);
	}

	@Override
	public void drop(int no) {
		dao.delete(no);		
	}
}
