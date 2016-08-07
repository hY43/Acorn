package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetEx2 {
	public static void main(String[] args){
		// Socket
		// Client Socket: Socket
		try {
			// IP는 192.168.0.234 이며, Port 번호 5000에 연결할 소켓 객체 생성.
			Socket s = new Socket("192.168.0.234", 5000); 
			// Server 측 Socket으로부터 데이터를 받아오기 위한 InputStream 객체 생성.(소켓의 입력 스트림 객체를 생성한다)
			InputStream is = s.getInputStream();
			// Server 측 소켓으로 데이터를 보내기 위한 OutputStream 객체 생성.(소켓의 출력 스트림 객체를 생성한다.)
			OutputStream os = s.getOutputStream();
			
			// Socket은 기본적으로 Byte Stream을 지원한다.
			// 데이터를 쓰되 한글도 입력 가능하도록 하기 위해 Byte Stream Type을 Char Stream으로 변환한다(OutputStreamWriter 이용)
			OutputStreamWriter osw = new OutputStreamWriter(os);
			// 조금더 빨리 쓰기 위한 Buffered Class 사용.
			BufferedWriter bw = new BufferedWriter(osw);
			// println Method 사용을 위해 PrintWriter 객체 생성
			// -> 사용 이유는 BufferedWriter의 write Method를 사용해도 되나, println Method는 매개 변수 타입에 제한이 없기 때문이다.
			PrintWriter pw = new PrintWriter(bw);
			
			// 키보드로 부터 데이터를 입력 받아 Server Socket으로 전송하기 위해 우선 System.in으로 입력 스트림 객체를 생성한다.
			InputStreamReader isr = new InputStreamReader(System.in);
			// 서버로부터 입력 받은 데이터를 읽어 화면에 출력하기 위한 객체 생성.
			InputStreamReader isr2 = new InputStreamReader(is);
			
			// 입력 속도를 높이기 위해 Buffered Class 사용.
			BufferedReader br = new BufferedReader(isr);
			BufferedReader br2 = new BufferedReader(isr2);
			
			String data = null;
			while((data = br.readLine())!=null)
			{
				pw.println(data); // 키보드로 입력받은 데이터를 Server에게 전송(실제로는 buffer에 기록)
				pw.flush(); // buffer에 적힌 내용을 서버에게 전송.
				String msg = br2.readLine(); // 서버로 부터 받은 데이터를 msg 변수에 저장
				System.out.println("서버가 전송한 글: " + msg);
			}
			
		} catch (UnknownHostException e) {
			// 알 수 없는 Server일 때.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
