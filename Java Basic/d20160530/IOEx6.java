package d20160530;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// IO�� �̿��� ��ü ����.
public class IOEx6 {
	public static void main(String[] args) throws IOException {
		Member m1 = new Member(1, "ȫ�浿", "hong", "gildong", "010-123-1234");
		Member m2 = new Member(2, "ȫ�Ǽ�", "hong", "daddy", "010-123-4321");
		// ����: File
		File f = new File("c:\\member.dat");
		// ���Ͽ� ������ �� �ִ� Ŭ����: FileOutputStream
		FileOutputStream fos = new FileOutputStream(f);
		// Buffer: BufferOutputStream
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// ��ü ����: ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(m1); // ���� ���Ͽ� ��ü�� ���� ���� writeObject ���.
		oos.writeObject(m2);
		oos.flush();
		// ��ü�� �����ϱ� ���ؼ��� �ش� Class��  implements Serializable �� �ٿ���� �Ѵ�.
	}
}
