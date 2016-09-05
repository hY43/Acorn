package kr.co.test.web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.co.test.web.dto.DeptDTO;

public class DeptOracleDAO implements Dao{
	SqlSession ss;
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	@Override
	public List<DeptDTO> selectAll() {
		return ss.selectList("kr.co.test.dept.selectAll");
	}
	
}
