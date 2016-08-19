package kr.co.test.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 이 클래스는 XML과 같은 설정 정보가 들어있는 Class 임을 Annotation으로 명시
@Configuration
public class AppConfig {
@Bean(name="helloBean")
	public Hello helloWorld(){
		
		return new HelloImple();
	}
}
