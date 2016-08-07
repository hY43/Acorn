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
		// byte Stream �迭�� ������ �д� �ɷ��� �ִ� Ŭ������?
		FileInputStream fis = new FileInputStream(f);
		// OutputStream <== �ֻ��� Ŭ����
		// FileOutputStream
		FileOutputStream fos = new FileOutputStream(f2);
		
		/*
		char value = (char)fis.read(); // �ش� ������ ù������ �ƽ�Ű �ڵ� ���� ��ȯ���ִµ� �̸� ���� ����ȯ�Ͽ� ������ ���ڸ� ����Ѵ�.
		System.out.println(value);
		*/
		int value = 0;
		while((value = fis.read()) != -1)
		{
			System.out.print((char)value);
			// �ѱ��� �����ڵ� 2 Byte�ε� Byte Stream, �� �ƽ�Ű �ڵ�� �о���Ƿ� ���ڰ� ������ ������ �ȴ�.
			// �׷��Ƿ� �ѱ��� ����ϱ� ���ؼ��� 2 Byte ������ ������ �д� Character Stream�� ����ؾ� �Ѵ�.
			fos.write(value); // Hello.java ������ ������ ����.�����ڵ嵵 �״�� �߶� �賢�� ������ �ۼ��ؼ� ������ ������ �״�� �о��ش�.
		}
			

		
		
	}
}
