package kr.co.test.app;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		CollectionInter ct = ac.getBean("collection", CollectionInter.class);
		ct.printList();
		ct.printMap();
		
	}
}
