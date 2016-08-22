package kr.co.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");
		
		Message m = ac.getBean("app", Message.class);
		m.printMessage();
		
		// 스프링 컨테이너 종료
		AbstractApplicationContext aac = (AbstractApplicationContext) ac;
		aac.close();
	}
}
