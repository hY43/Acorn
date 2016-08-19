package kr.co.test.app;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NowTime {
	public String getTime(){
		/*Calendar 사용*/
		/*
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		if(minute<10)
			return (hour + "시 0" + minute + "분"); // 10시 05분 과 같이 리턴
		else
			return (hour + "시 " + minute + "분"); // 10시 05분 과 같이 리턴
		*/
		
		/*SimpleDateFormat 사용*/
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(" HH시 mm분");
		return sdf.format(d);
		}
}
