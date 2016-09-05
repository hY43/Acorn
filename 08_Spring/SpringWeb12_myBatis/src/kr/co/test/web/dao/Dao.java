package kr.co.test.web.dao;

import java.util.List;

import kr.co.test.web.dto.EmpDTO;

public interface Dao {
	public List<EmpDTO> selectAll();
}
