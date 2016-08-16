package Hello;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class TestMain {
	public static void main(String[] args) {
		// Spring: Bean 관리하는 Container
		// 콩 자판기
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/app.xml"));
		// 콩자판기에서 콩하나 찾아오기
		Object obj = bf.getBean("bean");
		Hello h = (Hello)obj;
		h.sayHello("Sangwon");
	}
}
