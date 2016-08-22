package kr.co.test.app;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.test.app.dao.Dao;
import kr.co.test.app.vo.DeptVO;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
				
		Dao dao = ac.getBean("dao", Dao.class);
		ArrayList<DeptVO> list = dao.selectAll();
		
		for(DeptVO vo : list){
			System.out.println(vo.getDeptno() + " : " + vo.getDname() + " : " + vo.getLoc());
		}
	}
}
