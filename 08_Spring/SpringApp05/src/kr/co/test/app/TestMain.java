package kr.co.test.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;


public class TestMain {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Hello h = bf.getBean("time", Hello.class);
		h.sayHello();
		
	}
}
