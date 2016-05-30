package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOEx3 {
	public static void main(String[] args) throws IOException{
		File f = new File("c:\\Hello.java"); // File�� �о���� ���� �а��� �ϴ� ������ File Class�� �̿��Ͽ� ��ü�� �����Ѵ�.
		File f2 = new File("c:\\HelloJava3.java"); // File�� ���� ���� ������ �ϴ� ������ File Class�� �̿��Ͽ� ��ü�� �����Ѵ�.

		
		FileReader fr = new FileReader(f); // Char������ �о���� ���� Char Stream �� Class �� FileReader ��ü�� �����Ѵ�.
		FileWriter fw = new FileWriter(f2); // Char������ ���� ���� Char Stream �� Class �� FileWriter ��ü�� �����Ѵ�.
		
		BufferedReader br = new BufferedReader(fr); // ���ݴ� ���� �б⸦ ���� Char Stream�� Buffered Class�� ��ü�� �����Ѵ�.
		BufferedWriter bw = new BufferedWriter(fw); // ���ݴ� ���� ���⸦ ���� Char Stream�� Buffered Class�� ��ü�� �����Ѵ�.
		
		String data = null; // Char Stream �� �б�� Line ������ ������ �о���� ������ �̸� ������ ������ String Type�� ������ �����Ѵ�.
		while((data = br.readLine()) != null) // ������ ���� Line�� null, �� ���̻� ���� ������ ���ٸ� While ���� Ż���Ѵ�.
		{
			// readLine�� ���پ� �о���� ������ ������ Byte Stream�� read���� ������ �ξ� ����.
			// System.out.print(data);
			bw.write(data + "\n"); // bw ��ü, �� ������ �ϴ� ���Ͽ� ������ �о�� Hello.java�� ������ Line ������ ����, �����Ѵ�.
		}
		bw.flush(); // Buffer Class�� �̿��ϸ� Buffer�� ���� á������ ���� ������, ������ ���� ���ۿ� �ִ� ������ �����־�� �ٷ� ����ȴ�.
	}
}
