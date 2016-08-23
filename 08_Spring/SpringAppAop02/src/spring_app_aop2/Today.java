package spring_app_aop2;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class Today implements MethodBeforeAdvice{
	String getTime(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/DD, HH:mm:ss");
		return sdf.format(d);
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		Today td = new Today();
		System.out.println("현재 시간은 " + td.getTime());
	}
}
