package kr.co.test.app;

public class HelloImple implements Hello{
	NowTime nt;
	String msg;
	
	public HelloImple(NowTime nt){
		this.nt = nt;
	}
	@Override
	public void sayHello() {
		// 지금이 몇시인지 알아오기
		int hours = nt.getHour();
		
		if(hours >= 5 && hours < 10){
			msg = "좋은 아침";
		}else if(hours >= 10 && hours < 15){
			msg = "밥먹었니";
		}else{
			msg = "잘가";
		}
		
		System.out.println(hours + " : " + msg);
	}
}
