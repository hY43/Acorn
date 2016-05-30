package d20160530;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

// ��ü �ҷ�����
public class IOEx7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("c:\\member.dat");
		// ���Ͽ� ������ �� �ִ� Ŭ����: FileInputStream
		FileInputStream fis = new FileInputStream(f);
		// ���� ��� ����: BufferedInputStream
		BufferedInputStream bos = new BufferedInputStream(fis);
		// ��ü�� �����Ͽ� �о���� Ŭ����: ObjectInputStream
		ObjectInputStream ois = new ObjectInputStream(bos);
		
		Object obj1 = ois.readObject(); // File�� �����Ͽ� Object�� �о���� ���� readObject ���.
		Object obj2 = ois.readObject();
		
		Member m1 = (Member)obj1; // ���Ͽ� ���� ��ü�� Member Type�̹Ƿ� ��ü ����ȯ�Ѵ�.
		System.out.println("�̸�: " + m1.getName());
		System.out.println("ID: " + m1.getId());
		System.out.println("PW: " + m1.getPw()); // ����ȭ���� �ʰ� transient keyword�� ����߱� ������ String�� �⺻ ���� null�� ��µȴ�. 
		
		Member m2 = (Member)obj2;
		System.out.println("�̸�: " + m2.getName());
		System.out.println("ID: " + m2.getId());
		System.out.println("PW: " + m2.getPw());
		
		
		
	}
}
