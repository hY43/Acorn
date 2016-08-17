package kr.co.test.app;

import java.util.Calendar;

public class NowTime {
	Calendar cal;
	
	public int getHour(){
		// 지금 시간 알아와서 리턴
		cal = Calendar.getInstance();
		return cal.get(cal.HOUR_OF_DAY);
	}
}
