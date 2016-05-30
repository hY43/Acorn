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
		// Ű����κ��� �Է� �ޱ�
		// ctl + z ���� ������ �ݺ�.
		/*
		int value = 0;
		while((value = System.in.read())!=-1)
		{
			System.out.print((char)value);
			// Byte Stream�̹Ƿ� �ѱ��� ���� �� ����.
		}
		System.out.println();
		System.out.println("----------------------------");
		*/
		// InputStream <=InputStreamReader=> Reader
		InputStreamReader isr = new InputStreamReader(System.in);
		// Ű���带 ���� �����͸� �Է¹޴µ� �̶� Ű���� �Է��� Byte ������ �̷�����Ƿ� �̸� Char Type���� �ٲٴ� Bridge ��Ȱ�� �ϴ� InputStreamReader ��ü�� �����Ѵ�.
		BufferedReader br = new BufferedReader(isr);
		// ���� ���� �Է��� ���� Buffered Class�� ����ϴµ� InputStreamReader�� ���� Byte Stream���� Char Stream���� ��ȯ�Ǿ����Ƿ�  Char Stream Type�� Buffered Class�� BufferedReader Class�� ��G�Ѵ�.
		
		File f = new File("c:\\test.txt"); // ������ �ϴ� ������ ��ü�� �����Ѵ�.
		FileWriter fw = new FileWriter(f); // ������ �ϴ� ������ �Ű� ������ �Ͽ�, Char Stream Type�� FileWriter ��ü�� �����Ѵ�.
		BufferedWriter bw = new BufferedWriter(fw);	// ���� ���� ���⸦ ���� Buffered Class ���.
		
		String data = null; // Char Stream Type�� readLine�� Line ������ �����͸� �޾ƿ��Ƿ� String Type�� ������ �����Ѵ�.
		while((data=br.readLine()) != null) // ���� ���� �������� ������ ���� �о������ �����Ѵ�.
		{
			System.out.println(data); //
			bw.write(data + "\n");
		}
		bw.flush();
	}
}
