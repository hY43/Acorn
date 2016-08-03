package TestMain;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import config.ConnectionManager;
import vo.DeptVO;

public class TestMain {
	public static void main(String[] args) {
		ConnectionManager cm = ConnectionManager.getInstance();
		SqlSessionFactory factory = cm.getFactory();
		SqlSession ss = factory.openSession(true);
		
		List<DeptVO> list = ss.selectList("selectAllDept");
		for(DeptVO vo : list){
			
			System.out.println("부서번호 : " + vo.getDeptno());
			System.out.println("부서이름 : " + vo.getDname());
			System.out.println("부서위치 : " + vo.getLoc());
		}
	}
}
