package spring_app1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// 객체 관리는 스프링을 통해서 유지
		ApplicationContext ac = new AnnotationConfigApplicationContext(HelloConf.class);
		Hello h = (Hello)(ac.getBean("bean", Hello.class));
		// Spring을 통해서 만들게 되면 알아서 객체를 "싱글톤"으로 관리하게 된다.
		h.sayHello("상원");
	}
}
