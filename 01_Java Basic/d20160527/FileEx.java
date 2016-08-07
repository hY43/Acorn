package d20160527;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello3.java");
		if(f.exists()) System.out.println("파일이 있음"); // 해당 파일이 존재하는지에 대한 조건문
		else f.createNewFile(); // 파일이 없으면 만들 것.
		if(f.canRead()) System.out.println("읽기 가능"); // 해당 파일을 읽을 수 있는지에 대한 조건문.		
		System.out.println(f.getAbsolutePath());
		System.out.println("=================================");
		File f2 = new File("C:\\Program files");
		if(f2.isDirectory()) System.out.println("디렉토리");
		else System.out.println("파일");
		
		String[] fileList = f2.list(); // 디렉토리 내 파일을 String 배열로 저장.
		for(String x : fileList)
			System.out.println(x);
	}
}
