package d20160530;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// IO를 이용한 객체 저장.
public class IOEx6 {
	public static void main(String[] args) throws IOException {
		Member m1 = new Member(1, "홍길동", "hong", "gildong", "010-123-1234");
		Member m2 = new Member(2, "홍판서", "hong", "daddy", "010-123-4321");
		// 파일: File
		File f = new File("c:\\member.dat");
		// 파일에 접근할 수 있는 클래스: FileOutputStream
		FileOutputStream fos = new FileOutputStream(f);
		// Buffer: BufferOutputStream
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		// 객체 저장: ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(m1); // 열린 파일에 객체를 적기 위한 writeObject 사용.
		oos.writeObject(m2);
		oos.flush();
		// 객체를 저장하기 위해서는 해당 Class에  implements Serializable 를 붙여줘야 한다.
	}
}
