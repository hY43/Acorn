package kr.co.test.app.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.util.StopWatch;

@Aspect
public class CheckTime {
	@Pointcut("execution (public void printName(..))")
	public void publicTarget(){}
	
	@Around("publicTarget()")
	public Object logAround(ProceedingJoinPoint pjp){
		StopWatch sw = new StopWatch();
		sw.start();
		Object obj = null;
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sw.stop();
		System.out.println("처리시간: " + sw.getTotalTimeSeconds());
		
		return obj;
	}
}
