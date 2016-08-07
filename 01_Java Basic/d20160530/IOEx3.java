package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) throws IOException{
		File f = new File("c:\\Hello.java"); // File을 읽어오기 위해 읽고자 하는 파일을 File Class를 이용하여 객체로 생성한다.
		File f2 = new File("c:\\HelloJava3.java"); // File에 쓰기 위해 쓰고자 하는 파일을 File Class를 이용하여 객체로 생성한다.

		
		FileReader fr = new FileReader(f); // Char단위로 읽어오기 위해 Char Stream 의 Class 인 FileReader 객체를 생성한다.
		FileWriter fw = new FileWriter(f2); // Char단위로 쓰기 위해 Char Stream 의 Class 인 FileWriter 객체를 생성한다.
		
		BufferedReader br = new BufferedReader(fr); // 조금더 빠른 읽기를 위해 Char Stream의 Buffered Class의 객체를 생성한다.
		BufferedWriter bw = new BufferedWriter(fw); // 조금더 빠른 쓰기를 위해 Char Stream의 Buffered Class의 객체를 생성한다.
		
		String data = null; // Char Stream 의 읽기는 Line 단위로 파일을 읽어오기 때문에 이를 저장할 변수로 String Type의 변수를 선언한다.
		while((data = br.readLine()) != null) // 다음에 읽을 Line이 null, 즉 더이상 읽을 내용이 없다면 While 문을 탈출한다.
		{
			// readLine은 한줄씩 읽어오기 때문에 이전의 Byte Stream의 read보다 성능이 훨씬 좋다.
			// System.out.print(data);
			bw.write(data + "\n"); // bw 객체, 즉 쓰고자 하는 파일에 좀전에 읽어온 Hello.java의 내용을 Line 단위로 적되, 개행한다.
		}
		bw.flush(); // Buffer Class를 이용하면 Buffer가 가들 찼을때만 쓰기 때문에, 강제로 현재 버퍼에 있는 내용을 적어주어야 바로 적용된다.
	}
}
