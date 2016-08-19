package kr.co.test.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class GreetingImple implements Greeting {
	// 스프링에게 필요한 값을 직접 찾아 놓도록 하기 위해 명시.
	/*단 스프링은 데이터를 "이름"이 아닌 "자료형"으로 찾기 때문에 변수의 이름은 의미가 없다.*/
	@Autowired
	
	@Qualifier("nt1")
	NowTime nt;
	String msg;
	
	public void setNt(NowTime nt) {
		this.nt = nt;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public GreetingImple(){}
	public GreetingImple(NowTime nt, String msg) {
		super();
		this.nt = nt;
		this.msg = msg;
	}

	@Override
	public void printMsg() {
		System.out.println("현재 시각은 " + nt.getTime() + "입니다.");
		System.out.println("전달 메세지는 " + msg + "입니다.");
		
	}
}
