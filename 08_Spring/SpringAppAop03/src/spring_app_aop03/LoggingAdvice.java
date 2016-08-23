package spring_app_aop03;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAdvice implements AfterReturningAdvice{
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		Today td = new Today();
		FileWriter fw = new FileWriter("C:/Log/" + td.getTime()+".log");
		fw.write(td.getTime() + " : 비밀리에 이체 진행중입니다.");
		fw.flush();
		fw.close();
	}

}
