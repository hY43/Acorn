package spring_app_hw_app1;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class HijackGugu implements MethodBeforeAdvice{
	private int dan;

	public void setDan(int dan) {
		this.dan = dan;
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
			for(int j=1;j<10;j++)
				System.out.println(dan + " * " + j + " = " + (dan*j));
	

	}

}
