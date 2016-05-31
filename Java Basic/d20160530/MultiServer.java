package d20160530;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(5000); // 5000번 port를 open하는  Socket 객체 생성.
			while(true){
				System.out.println("클라이언트 접속 대기중");
				Socket client = ss.accept(); // 클라이언트가 들어오길 대기. 단 이전과는 달리 무한 반복 시켜서 Client Socket는 클라이언트 측에서 접속해올때마다 받아주는 안내 데스크 역할만 해줌.
							     // 실제로 클라이언트가 접속하면 다른 소켓을 생성하여 클라이언트 정보를 넘겨주고, 다음 클라이언트가 접속할때까지 대기한다.ㄴ
				MTServer ms = new MTServer(client); // 실제 데이터를 주고 받을 소켓 클래스인데 여러 명의 사용자와 동시에 통신하기 위해 Thread로 구현.
				ms.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
