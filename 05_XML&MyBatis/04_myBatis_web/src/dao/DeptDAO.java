package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.ConnectionManager;
import vo.DeptVO;

public class DeptDAO {
	public SqlSession ss;
	public DeptDAO(){
		SqlSessionFactory factory = ConnectionManager.getInstance().getFactory();
		ss = factory.openSession(true);
		System.out.println(ss);
	}
	
	public List<DeptVO> selectAll(){ 
		return ss.selectList("selectAllDept");
	} // selectAll() end
	
	public void insertData(String dname, String loc){
		DeptVO vo = new DeptVO();
		vo.setDname(dname);
		vo.setLoc(loc);		
		ss.insert("insertOneDept", vo);
	}
	
	public void deleteData(int deptno){
		ss.delete("deleteOneDept", deptno);
	}
} // DeptDAO Class end
