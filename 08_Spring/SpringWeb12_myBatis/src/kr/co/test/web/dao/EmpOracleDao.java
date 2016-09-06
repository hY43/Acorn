package kr.co.test.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.test.web.dto.EmpDTO;

public class EmpOracleDao implements Dao{
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<EmpDTO> selectAll() {
		
		return ss.selectList("kr.co.test.emp.selectAll");
	}

	@Override
	public void insertOne(EmpDTO dto) {
		ss.insert("kr.co.test.emp.insertOne", dto);
	}

}
