package kr.co.test.app.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import kr.co.test.app.vo.DeptVO;
import kr.co.test.service.DBService;

public class TestMain {
	public static void main(String[] args) {
		BeanFactory bf = new XmlBeanFactory(new FileSystemResource("src/application.xml"));
		DBService cd = bf.getBean("dbService", DBService.class);
		
		cd.readAll();
		cd.readOne(10);
		cd.write(new DeptVO());
		cd.modify(new DeptVO());
		cd.drop(10);
		
	}
}
