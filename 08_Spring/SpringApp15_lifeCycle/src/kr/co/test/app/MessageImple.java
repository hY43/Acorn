package kr.co.test.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageImple implements Message, InitializingBean, DisposableBean {
	/*Bean을 시작하고 종료할때 사용할 Method를 구현하기 위해 Interface implements*/
	String name;
	
	public MessageImple(){}
	public MessageImple(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void printMessage() {
			System.out.println(name);
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean 인터페이스 구현 메서드: 종료 메서드");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean 인터페이스 구현 메서드 : 초기화 메서드 정의 ");		
	}
}
