package kr.co.kitcoop.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.co.kitcoop.vo.EmpVO;

public class EmpDAO {
	SqlSessionFactory factory = null;
	SqlSession ss = null;
	
	public EmpDAO(){
		factory = ConnectionManager.getInstance().getFactory();
	}
	
	public List<EmpVO> selectAll(){
		ss = factory.openSession(true);
		
		List<EmpVO> list = ss.selectList("kr.co.kitcoop.empSelect");
		ss.close();
		return list;
	}
	
	public EmpVO selectOne(int empno){
		ss = factory.openSession(true);
		EmpVO vo = new EmpVO();
		vo.setEmpno(empno);
			
		return ss.selectOne("kr.co.kitcoop.empSelect", vo);
	}
	
	public List<EmpVO> searchByName(String ename, int sal){
		ss = factory.openSession(true);
		HashMap hm = new HashMap();
		hm.put("ename", ename);
		hm.put("sal", sal);
		return ss.selectList("kr.co.kitcoop.empSelect", hm);
	}
	
	public void modify(int empno, String ename, int sal, String job){
		ss = factory.openSession(true);
		EmpVO vo = new EmpVO();
		HashMap hm = new HashMap();
		
		hm.put("empno", empno);
		if(ename!=null && !ename.equals("")) hm.put("ename", ename);
		if(sal!=0) hm.put("sal", sal);
		if(job !=null && !job.equals("")) hm.put("job", job);
		ss.update("updateOne", hm);
	}
	
	public List<EmpVO> search(String keyword){
		ss = factory.openSession(true);
		List<EmpVO> list = ss.selectList("kr.co.kitcoop.searchEmployeeByName", keyword);
		ss.close();
		return list;
	}
	
	public void insertData(String ename, String job, int mgr, int sal, int comm, int deptno){
		ss = factory.openSession(true);
		EmpVO vo = new EmpVO();
		vo.setEname(ename);
		vo.setJob(job);
		vo.setMgr(mgr);
		vo.setSal(sal);
		vo.setComm(comm);
		vo.setDeptno(deptno);
		
		ss.insert("empInsert", vo);
		ss.close();
	}
}
