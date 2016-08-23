package spring_app_aop2;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

// 공통 관심사
public class HijackBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("공통 관심사 업무를 지정");
		System.out.println("메서드가 실행되기 전에 가로채기");
	}

}
