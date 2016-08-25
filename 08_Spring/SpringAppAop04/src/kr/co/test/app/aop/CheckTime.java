package kr.co.test.app.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class CheckTime implements MethodInterceptor{
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		StopWatch sw = new StopWatch(); // 시간 재는 객체
		sw.start(); // 시간 측정 시작
		Object obj = invocation.proceed(); // 지정한 메서드가 실행
		sw.stop(); // 시간 측정 끝
		
		System.out.println("처리 시간: " + sw.getTotalTimeSeconds());
		return obj;
	}
}
