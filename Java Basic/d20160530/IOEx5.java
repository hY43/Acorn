package d20160530;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx5 {
	public static void main(String[] args) throws IOException {
		File f = new File("c:\\saveData.sav"); // �����͸� ������ ���� ��ü�� ����
		// ���� ����: FileOutputStream
		// ������: BufferedOutputStream
		// �⺻ �ڷ��� �����͸� ����: DataOutputStream
		FileOutputStream fos = new FileOutputStream(f); // �����͸� "����"�� �����ؾ��ϱ� ������ File Stream�� �����ش�.
		FileInputStream fis = new FileInputStream(f); // �����͸� "����"�� ���� �о�;��ϱ� ������ File Stream�� �����ش�.
		BufferedOutputStream bos = new BufferedOutputStream(fos); // ���� ���� ���⸦ ���� Buffered Class ��ü ����.
		BufferedInputStream bis = new BufferedInputStream(fis); // ���� ���� �б⸦ ���� Buffered Class ��ü ����.
		
		DataOutputStream dos = new DataOutputStream(bos); // Data�� �����ؾ��ϹǷ� DataOutputStream ��ü�� ����.
		DataInputStream dis = new DataInputStream(bis); // Data�� �о�;��ϹǷ� DataInputStream ��ü�� ����.
		
		// ������ ���� Method���� ���.
		dos.writeUTF("ȫ�浿"); // �ɸ��� ��
		dos.writeInt(10); // ����
		dos.writeLong(43224322); // ����ġ
		dos.writeBoolean(true); // ����: �� true, �� false
		dos.writeByte(21); // �ֹ��� ��ȣ
		dos.flush();
		// �� ������ ������ ������ �о�;� �Ѵ�.
		System.out.println("�ɸ��� ��: " + dis.readUTF());
		System.out.println("����: " + dis.readInt());
		System.out.println("����ġ: " + dis.readLong());
		System.out.println("����: " + ((dis.readBoolean()==true)? "��" : "��"));
		System.out.println("�ɸ��� ��: " + dis.readByte());		
	}
}
