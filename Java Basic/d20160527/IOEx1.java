package d20160527;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx1 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello.java");
		File f2 = new File("c:\\CopyHello.java");
		// byte Stream 계열의 파일을 읽는 능력이 있는 클래스는?
		FileInputStream fis = new FileInputStream(f);
		// OutputStream <== 최상위 클래스
		// FileOutputStream
		FileOutputStream fos = new FileOutputStream(f2);
		
		/*
		char value = (char)fis.read(); // 해당 파일의 첫글자의 아스키 코드 값을 반환해주는데 이를 강제 형변환하여 원래의 문자를 출력한다.
		System.out.println(value);
		*/
		int value = 0;
		while((value = fis.read()) != -1)
		{
			System.out.print((char)value);
			// 한글은 유니코드 2 Byte인데 Byte Stream, 즉 아스키 코드로 읽어오므로 글자가 깨져서 나오게 된다.
			// 그러므로 한글을 사용하기 위해서는 2 Byte 단위로 파일을 읽는 Character Stream을 사용해야 한다.
			fos.write(value); // Hello.java 파일의 내용을 복사.유니코드도 그대로 잘라서 배끼기 때문에 작성해서 파일을 읽으면 그대로 읽어준다.
		}
			

		
		
	}
}
