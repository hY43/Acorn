package d20160527;

import java.io.File;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\Hello3.java");
		if(f.exists()) System.out.println("������ ����"); // �ش� ������ �����ϴ����� ���� ���ǹ�
		else f.createNewFile(); // ������ ������ ���� ��.
		if(f.canRead()) System.out.println("�б� ����"); // �ش� ������ ���� �� �ִ����� ���� ���ǹ�.		
		System.out.println(f.getAbsolutePath());
		System.out.println("=================================");
		File f2 = new File("C:\\Program files");
		if(f2.isDirectory()) System.out.println("���丮");
		else System.out.println("����");
		
		String[] fileList = f2.list(); // ���丮 �� ������ String �迭�� ����.
		for(String x : fileList)
			System.out.println(x);
	}
}
