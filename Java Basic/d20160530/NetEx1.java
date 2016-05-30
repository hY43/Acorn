package d20160530;

import java.net.InetAddress;
import java.net.UnknownHostException;
// InetAddress Class: IP를 다루기 위한 Class.
public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		// InetAddress Class는 생성자가 없기 때문에 Static Method이며 자기 자신을 반환하는 getLocalHost Method를 사용한다.
		String name = inet.getHostName(); // inet 객체의 HostName을 반환한다.
		String ip = inet.getHostAddress(); // inet 객체의 IP Address를 반환한다.
		
		System.out.println("name: " + name);
		System.out.println("ip: " + ip);
		
		// www.naver.com 라는 호스트 명을 갖는 도메인의 IP를 배열로 얻어온다.
		InetAddress[] inet2 = InetAddress.getAllByName("www.naver.com");
		for(InetAddress ia : inet2)
		{
			System.out.println("네이버 아이피: " + ia.getHostAddress());
		}
	}
}
