package spring_app_aop03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today{
	String getTime(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
		return sdf.format(d);
	}
}
