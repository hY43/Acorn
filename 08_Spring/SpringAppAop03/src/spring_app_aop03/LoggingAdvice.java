package spring_app_aop03;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LoggingAdvice implements AfterReturningAdvice{
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// Get Time
		Today td = new Today();
		// Write File
		FileWriter fw = new FileWriter("C:/Log/" + td.getTime()+".log");
		fw.write(td.getTime() + " : 비밀리에 이체 진행중입니다.");
		fw.flush();
        fw.close();
        
        // Folder Open
        Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
            dirToOpen = new File("C:/Log/");
            desktop.open(dirToOpen);
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        }
    }
		
}
