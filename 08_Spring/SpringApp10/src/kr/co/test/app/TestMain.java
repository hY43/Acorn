package kr.co.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		Character ch = ac.getBean("character", Character.class);
		ch.attack("희두몬");
		ch.status();
	}
}
