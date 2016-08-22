package kr.co.test.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.test.app.dao.Dao;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Dao dao = ac.getBean("app", Dao.class);
		/*http://www.mvnrepository.com/*/		
		System.out.println("전체 데이터는 " + dao.selectCount() + "입니다.");
	}
}
