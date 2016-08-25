package kr.co.test.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class CheckTime {
	public Object logAround(ProceedingJoinPoint pjp){
		// 지금 실행 중인 메서드 이름 얻어오기
		String methodName = pjp.getSignature().getName();
		Object obj = null;
		System.out.println("현재 실행중인 메서드" + methodName);
		StopWatch sw = new StopWatch();
		sw.start();
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sw.stop();
		System.out.println("처리시간 : " + sw.getTotalTimeSeconds());
		return obj;
	}
}
