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
		// File f = new File("c:\\Hello.java"); // File�� �о���� ���ؼ��� File ��ü�� ������ ��, �� ��ü�� File Class�� ���� ������ �����ؾ��Ѵ�.
		// File f2 = new File("c:\\SaveHello.java");
		
		// FileInputStream fis = new FileInputStream(f); // Byte ������ ������ ������ �о���� ���� FileInputStream�� ���� ������ ������ ��, ������ �о�� ������ File ��ü�� �����Ѵ�.
		// FileOutputStream fos = new FileOutputStream(f2); // Byte ������ ���Ͽ� ������ ���� ���� FileOutputStream�� ���� ������ ������ ��, ������ �� ������ File ��ü�� �����Ѵ�.
		
		// BufferedInputStream bis = new BufferedInputStream(fis); // ���� ���� �б⸦ ���� Buffer�� ����ؾ� �ϴµ� �̶� ����ϴ� ���� BufferedInputStream���� �а��� �ϴ� ������ FileInputStream ��ü�� �����Ѵ�.
		// BufferedOutputStream bos = new BufferedOutputStream(fos); // ���� ���� ���⸦ ���� Buffer�� ����ؾ� �ϴµ� �̶� ����ϴ� ���� BufferedOutputStream���� ������ �ϴ� ������ FileOutputStream ��ü�� �����Ѵ�.
		// ��ó�� ����� ���� ������ ���ʿ��� ������ ������ ���̱� ���� �Ʒ��� ���� ����Ѵ�.
		BufferedInputStream bis = new BufferedInputStream(
										new FileInputStream(
											new File("c:\\Hello.java")));
		BufferedOutputStream bos = new BufferedOutputStream(
										new FileOutputStream(
											new File("c:\\SaveHello.java")));
		
		int v = 0; // Byte ����, �� �ƽ�Ű �ڵ�� ���� �о� ���� ������ int Type�� ������ ������ ��, �ʱ�ȭ�Ѵ�.
		while((v=bis.read()) != -1) // Byte Stream�� ���̻� �о�� ���� ������ -1�� ��ȯ�ϱ� ������ �̿� ���� While ���� ����� ��, �� �������� -1�� �ƴ� ���, �� �о�� ������ �ִµ��� �ݺ� ��Ű���� �ڵ带 �ۼ��Ѵ�.
		{
			bos.write(v); // �ٷ� ���Ͽ� ���� ���� �ƴ϶� Buffer�� Buffer�� ���� �� ������ �ְ� ���� ���� �Ѳ����� ���Ͽ� ���ش�.
			System.out.print((char)v); // read Method�� �ƽ�Ű �ڵ�, �� int Type�� ������ ��ȯ�ϹǷ� ��½ÿ��� char Type������ �� ��ȯ�� �ʿ��ϴ�.
		}
		bos.flush(); // ���� Buffer�� �������� �ʾҴ��� ���� Buffer�� �ִ� ������ �켱 ���� ���Ͽ� ������ flush Method ���
	}
}
