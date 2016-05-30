package d20160530;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

// 객체 불러오기
public class IOEx7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("c:\\member.dat");
		// 파일에 접근할 수 있는 클래스: FileInputStream
		FileInputStream fis = new FileInputStream(f);
		// 버퍼 사용 가능: BufferedInputStream
		BufferedInputStream bos = new BufferedInputStream(fis);
		// 객체에 접근하여 읽어오는 클래스: ObjectInputStream
		ObjectInputStream ois = new ObjectInputStream(bos);
		
		Object obj1 = ois.readObject(); // File에 접근하여 Object를 읽어오기 위한 readObject 사용.
		Object obj2 = ois.readObject();
		
		Member m1 = (Member)obj1; // 파일에 적힌 객체는 Member Type이므로 객체 형변환한다.
		System.out.println("이름: " + m1.getName());
		System.out.println("ID: " + m1.getId());
		System.out.println("PW: " + m1.getPw()); // 직렬화되지 않게 transient keyword를 사용했기 때문에 String의 기본 값인 null이 출력된다. 
		
		Member m2 = (Member)obj2;
		System.out.println("이름: " + m2.getName());
		System.out.println("ID: " + m2.getId());
		System.out.println("PW: " + m2.getPw());
		
		
		
	}
}
