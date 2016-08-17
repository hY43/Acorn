package spring_app1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// 객체 관리는 스프링을 통해서 유지
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		Hello h1 = (Hello)(bf.getBean("bean"));
		Hello h2 = (Hello)(bf.getBean("bean"));
		System.out.println(h1);
		System.out.println(h2);
		// Spring을 통해서 만들게 되면 알아서 객체를 "싱글톤"으로 관리하게 된다.
		h1.sayHello("sangwon");
	}
}
