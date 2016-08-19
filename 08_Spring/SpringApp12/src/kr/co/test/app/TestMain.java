package kr.co.test.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		/*XMl 파일을 이용한 로딩*/
		/*ApplicationContext ac = new ClassPathXmlApplicationContext("app.xml");*/
		/*Java 파일을 이용한 로딩*/
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		Hello h = ac.getBean("helloBean", Hello.class);
		h.printHello("spring Java Config");
	}
}
