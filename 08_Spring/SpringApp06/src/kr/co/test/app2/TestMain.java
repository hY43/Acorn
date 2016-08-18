package kr.co.test.app2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app2.xml");
		SystemMonitor sm = ac.getBean("sm", SystemMonitor.class);
		sm.print();
	}
}
