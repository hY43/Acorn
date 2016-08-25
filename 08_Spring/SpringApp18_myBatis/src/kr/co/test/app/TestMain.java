package kr.co.test.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.test.app.dao.Dao;
import kr.co.test.app.vo.DeptVO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Dao d = ac.getBean("dao", Dao.class);
		
		System.out.println("===================");
		DeptVO vo1 = d.selectOne(10);
		System.out.println(vo1.getDeptno() + " : " + vo1.getDname() + " : " + vo1.getLoc() );
		
		System.out.println("===================");
/*		d.insertOne("test", "test");*/
/*		DeptVO vo3 = new DeptVO();
		vo3.setDeptno(47);
		vo3.setDname("test2");
		vo3.setLoc("test2");
		
		d.updateOne(vo3);
		*/
		d.deleteOne(47);
		System.out.println("===================");
		List<DeptVO> list = d.selectAll();
		
		for(DeptVO vo2 : list){
			System.out.println(vo2.getDeptno() + " : " + vo2.getDname() + " : " + vo2.getLoc() );
		}
	}
}
