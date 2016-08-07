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
		File f = new File("c:\\saveData.sav"); // 데이터를 저장할 파일 객체를 생성
		// 파일 접근: FileOutputStream
		// 빠르게: BufferedOutputStream
		// 기본 자료형 데이터를 저장: DataOutputStream
		FileOutputStream fos = new FileOutputStream(f); // 데이터를 "파일"에 저장해야하기 때문에 File Stream을 열어준다.
		FileInputStream fis = new FileInputStream(f); // 데이터를 "파일"로 부터 읽어와야하기 때문에 File Stream을 열어준다.
		BufferedOutputStream bos = new BufferedOutputStream(fos); // 좀더 빠른 쓰기를 위해 Buffered Class 객체 생성.
		BufferedInputStream bis = new BufferedInputStream(fis); // 좀더 빠른 읽기를 위해 Buffered Class 객체 생성.
		
		DataOutputStream dos = new DataOutputStream(bos); // Data를 저장해야하므로 DataOutputStream 객체를 생성.
		DataInputStream dis = new DataInputStream(bis); // Data를 읽어와야하므로 DataInputStream 객체를 생성.
		
		// 데이터 쓰기 Method들을 사용.
		dos.writeUTF("홍길동"); // 케릭터 명
		dos.writeInt(10); // 레벨
		dos.writeLong(43224322); // 경험치
		dos.writeBoolean(true); // 성별: 남 true, 여 false
		dos.writeByte(21); // 주무기 번호
		dos.flush();
		// 쓴 순서와 동일한 순서로 읽어와야 한다.
		System.out.println("케릭터 명: " + dis.readUTF());
		System.out.println("레벨: " + dis.readInt());
		System.out.println("경험치: " + dis.readLong());
		System.out.println("성별: " + ((dis.readBoolean()==true)? "남" : "여"));
		System.out.println("케릭터 명: " + dis.readByte());		
	}
}
