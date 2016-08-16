package kr.co.test.main;

import java.sql.SQLException;

import kr.co.test.dao.ConnectionMaker;
import kr.co.test.dao.DeptDAO;
import kr.co.test.dao.NConnectionMaker;
import kr.co.test.dto.DeptDTO;

public class TestMain {
	public static void main(String[] args) {
		ConnectionMaker cm = new NConnectionMaker();
		// ConnectionMaker cm = new DConnectionMaker();
		DeptDAO dao = new DeptDAO(cm);
		DeptDTO dto = new DeptDTO(99, "홍길동", "서울");
		try {
			dao.add(dto);
			//ddod.drop(99);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
