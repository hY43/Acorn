package d20160530;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class MTServer extends Thread {
	Socket client; // 클라이언트 소켓 정보를 받기 위한 Socket 객체
	MTServer(Socket client) // 접속하고자 하는 클라이언트의 소켓 정보를 Listener Socket으로 부터 전달 받는다.
	{
		this.client = client;
	}
	@Override
	public void run() {
		// 모든 클라이언트와 통신을 담당하는 코드.
		InetAddress inet = client.getInetAddress(); // 클라이언트의 Local IP 정보를 얻어온다.
		String ip = inet.getHostAddress();
		System.out.println("접속자 IP: " + inet.getHostAddress());
		
		// 서버의 수신 객체
		try {
			BufferedReader br = new BufferedReader(
									new InputStreamReader(
											client.getInputStream()));
			BufferedWriter bw = new BufferedWriter(
									new OutputStreamWriter(
											client.getOutputStream()));
			String msg = null;
			PrintWriter pw = new PrintWriter(bw);
			while((msg = br.readLine()) != null)
			{
				System.out.println("[" + ip + "]: " + msg);
				pw.println(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 서버의 발신 객체
	}
}
