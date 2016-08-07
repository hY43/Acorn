package d20160530;

import java.net.InetAddress;
import java.net.UnknownHostException;
// InetAddress Class: IP�� �ٷ�� ���� Class.
public class NetEx1 {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		// InetAddress Class�� �����ڰ� ���� ������ Static Method�̸� �ڱ� �ڽ��� ��ȯ�ϴ� getLocalHost Method�� ����Ѵ�.
		String name = inet.getHostName(); // inet ��ü�� HostName�� ��ȯ�Ѵ�.
		String ip = inet.getHostAddress(); // inet ��ü�� IP Address�� ��ȯ�Ѵ�.
		
		System.out.println("name: " + name);
		System.out.println("ip: " + ip);
		
		// www.naver.com ��� ȣ��Ʈ ���� ���� �������� IP�� �迭�� ���´�.
		InetAddress[] inet2 = InetAddress.getAllByName("www.naver.com");
		for(InetAddress ia : inet2)
		{
			System.out.println("���̹� ������: " + ia.getHostAddress());
		}
	}
}
