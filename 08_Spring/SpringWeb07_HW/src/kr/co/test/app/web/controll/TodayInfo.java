package kr.co.test.app.web.controll;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TodayInfo {
	public static String getTime(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY.MM.dd HH:MM:ss");
		return sdf.format(d);
	}
	public static String getDayOfWeek(){
		String[] dayOfWeek = { "일", "월", "화", "수", "목", "금", "토" }; 
		return dayOfWeek[Calendar.DAY_OF_WEEK_IN_MONTH%7];
	}
	
	
}
