package spring_app2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Coffee cf = (Coffee)(bf.getBean("coffee"));
		cf.drink("sangwon");
	}
}
