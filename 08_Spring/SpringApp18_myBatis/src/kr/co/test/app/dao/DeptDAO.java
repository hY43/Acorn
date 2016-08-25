package kr.co.test.app.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.co.test.app.vo.DeptVO;

public class DeptDAO implements Dao{
	ConnectionManager cm;
		
	public void setCm(ConnectionManager cm) {
		this.cm = cm;
	}

	@Override
	public List<DeptVO> selectAll() {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		List<DeptVO> list = ss.selectList("kr.co.test.app.selectAll");
		ss.close();

		return list;
	}

	@Override
	public DeptVO selectOne(int no) {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		DeptVO vo = ss.selectOne("kr.co.test.app.selectOne", no);
		ss.close();
		return vo;
	}

	@Override
	public void insertOne(String dname, String loc) {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		DeptVO vo = new DeptVO();
		vo.setDname(dname);
		vo.setLoc(loc);
		ss.insert("kr.co.test.app.insertOne", vo);
		ss.close();
		
	}

	@Override
	public void updateOne(DeptVO vo) {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		ss.update("kr.co.test.app.updateOne", vo);
		ss.close();
	}

	@Override
	public void deleteOne(int no) {
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		ss.update("deleteOne", no);
		ss.close();
	}

}
