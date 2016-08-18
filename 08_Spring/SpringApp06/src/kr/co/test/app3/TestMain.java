package kr.co.test.app3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		/*ApplicationContext = bean 정의 파일 읽기(BeanFactory) + ( 메세지 소스/이벤트 처리, AOP, 다국어 처리 )*/
		ApplicationContext ac = new ClassPathXmlApplicationContext("app3.xml"); 
		Printer p = ac.getBean("printer", Printer.class);
		p.print();
	}
}
