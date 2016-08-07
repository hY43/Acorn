package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class NetEx3 {
	public static void main(String[] args) {
		try {
			ServerSocket s = new ServerSocket(5000); // 5000번 포트를 여는 객체 생성
			Socket client = s.accept(); // 클라이언트가 들어올때 까지 대기 하기 위한 소켓 생성 후, 기다리기 위한 accept Method 사용.
			InetAddress inet = client.getInetAddress(); // 클라이언트가 접속하면 IP를 얻어옴.
			System.out.println("ip: " + inet.getHostAddress()); // 얻어온 IP 출력
			InputStream is = client.getInputStream(); // 클라이언트로부터 데이터를 입력 받기 위한 입력 스트림 객체 생성
			OutputStream os = client.getOutputStream();	// 클라이언트에게 데이터를 전송하기 위한 출력 스트림 객체 생성.
			OutputStreamWriter osw = new OutputStreamWriter(os); // 한글 전송을 위해 Char Stream Type로 변환.
			
			BufferedWriter bw = new BufferedWriter(osw); // 속도 개선을 위한 Buffered Class 객체 생성.
			
			PrintWriter pw = new PrintWriter(bw);
			InputStreamReader isr = new InputStreamReader(is); // 한글을 고객으로 부터 입력 받았을때 처리하기 위한 Char Stream으로의 변환.
			BufferedReader br = new BufferedReader(isr);
			
			String msg = null;
			while((msg = br.readLine()) != null)
			{
				System.out.println(msg);
				pw.println(msg);
				//bw.write(msg); // 이렇게 사용해도 되지만 여기에서는 자료형을 따로 신경쓰지 않기 위해 println 사용
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
