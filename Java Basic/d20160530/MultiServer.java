package d20160530;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiServer {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(5000); // 5000�� port�� open�ϴ�  Socket ��ü ����.
			while(true){
				System.out.println("Ŭ���̾�Ʈ ���� �����");
				Socket client = ss.accept(); // Ŭ���̾�Ʈ�� ������ ���. �� �������� �޸� ���� �ݺ� ���Ѽ� Client Socket�� Ŭ���̾�Ʈ ������ �����ؿö����� �޾��ִ� �ȳ� ����ũ ���Ҹ� ����.
				MTServer ms = new MTServer(client); // ���� �����͸� �ְ� ���� ���� Ŭ�����ε� ���� ���� ����ڿ� ���ÿ� ����ϱ� ���� Thread�� ����.
				ms.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
