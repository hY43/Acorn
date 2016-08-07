package d20160530;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx2 {
	public static void main(String[] args) throws IOException
	{
		// File f = new File("c:\\Hello.java"); // File을 읽어오기 위해서는 File 객체를 생성한 후, 그 객체를 File Class의 참조 변수에 대입해야한다.
		// File f2 = new File("c:\\SaveHello.java");
		
		// FileInputStream fis = new FileInputStream(f); // Byte 단위로 파일의 내용을 읽어오기 위해 FileInputStream의 참조 변수를 선언한 후, 내용을 읽어올 파일의 File 객체를 대입한다.
		// FileOutputStream fos = new FileOutputStream(f2); // Byte 단위로 파일에 내용을 쓰기 위해 FileOutputStream의 참조 변수를 선언한 후, 내용을 쓸 파일의 File 객체를 대입한다.
		
		// BufferedInputStream bis = new BufferedInputStream(fis); // 좀더 빠른 읽기를 위해 Buffer를 사용해야 하는데 이때 사용하는 것이 BufferedInputStream으로 읽고자 하는 파일의 FileInputStream 객체를 대입한다.
		// BufferedOutputStream bos = new BufferedOutputStream(fos); // 좀더 빠른 쓰기를 위해 Buffer를 사용해야 하는데 이때 사용하는 것이 BufferedOutputStream으로 쓰고자 하는 파일의 FileOutputStream 객체를 대입한다.
		// 위처럼 사용할 수도 있으나 불필요한 변수의 선언을 줄이기 위해 아래와 같이 사용한다.
		BufferedInputStream bis = new BufferedInputStream(
										new FileInputStream(
											new File("c:\\Hello.java")));
		BufferedOutputStream bos = new BufferedOutputStream(
										new FileOutputStream(
											new File("c:\\SaveHello.java")));
		
		int v = 0; // Byte 단위, 즉 아스키 코드로 값을 읽어 오기 때문에 int Type의 변수를 선언한 후, 초기화한다.
		while((v=bis.read()) != -1) // Byte Stream은 더이상 읽어올 값이 없으면 -1을 반환하기 때문에 이와 같이 While 문을 사용할 때, 그 조건으로 -1이 아닌 경우, 즉 읽어올 내용이 있는동안 반복 시키도록 코드를 작성한다.
		{
			bos.write(v); // 바로 파일에 쓰는 것이 아니라 Buffer에 Buffer가 가득 찰 때까지 넣고 가득 차면 한꺼번에 파일에 써준다.
			System.out.print((char)v); // read Method는 아스키 코드, 즉 int Type의 변수를 반환하므로 출력시에는 char Type으로의 형 변환이 필요하다.
		}
		bos.flush(); // 만약 Buffer가 가득차지 않았더라도 현재 Buffer에 있는 내용을 우선 먼저 파일에 쓰도록 flush Method 사용
	}
}
