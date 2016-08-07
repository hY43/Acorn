package d20160524;

import java.text.SimpleDateFormat;
import java.util.Date;
public class UtilEx2 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("d: " + d );
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:MM:ss");
		String time = sdf.format(d);
		System.out.println(time);
	}
}
