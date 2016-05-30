package d20160530;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class IOEx4 {
	public static void main(String[] args) throws IOException {
		// 키보드로부터 입력 받기
		// ctl + z 누를 때까지 반복.
		/*
		int value = 0;
		while((value = System.in.read())!=-1)
		{
			System.out.print((char)value);
			// Byte Stream이므로 한글을 읽을 수 없다.
		}
		System.out.println();
		System.out.println("----------------------------");
		*/
		// InputStream <=InputStreamReader=> Reader
		InputStreamReader isr = new InputStreamReader(System.in);
		// 키보드를 통해 데이터를 입력받는데 이때 키보드 입력은 Byte 단위로 이루어지므로 이를 Char Type으로 바꾸는 Bridge 역활을 하는 InputStreamReader 객체를 선언한다.
		BufferedReader br = new BufferedReader(isr);
		// 좁더 빠른 입력을 위해 Buffered Class를 사용하는데 InputStreamReader를 통해 Byte Stream에서 Char Stream으로 변환되었으므로  Char Stream Type의 Buffered Class인 BufferedReader Class를 사욯한다.
		
		File f = new File("c:\\test.txt"); // 쓰고자 하는 파일을 객체로 생성한다.
		FileWriter fw = new FileWriter(f); // 쓰고자 하는 파일을 매개 변수로 하여, Char Stream Type의 FileWriter 객체를 생성한다.
		BufferedWriter bw = new BufferedWriter(fw);	// 좀더 빠른 쓰기를 위해 Buffered Class 사용.
		
		String data = null; // Char Stream Type의 readLine은 Line 단위로 데이터를 받아오므로 String Type의 변수를 선언한다.
		while((data=br.readLine()) != null) // 다음 줄이 존재하지 않을때 까지 읽어오도록 설정한다.
		{
			System.out.println(data); //
			bw.write(data + "\n");
		}
		bw.flush();
	}
}
