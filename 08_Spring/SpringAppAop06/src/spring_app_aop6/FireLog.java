package spring_app_aop6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class FireLog {
	public void doAspect(JoinPoint jp){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = sdf.format(d);
		File f = new File("C:\\log\\file_" + time + ".log");
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.println("총기 사용: " + time);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
