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
	Socket client;
	MTServer(Socket client) // �����ϴ� Ŭ���̾�Ʈ�� ���� ��ü.......
	{
		this.client = client;
	}
	@Override
	public void run() {
		// ��� Ŭ���̾�Ʈ�� ����� ����ϴ� �ڵ�.
		InetAddress inet = client.getInetAddress();
		String ip = inet.getHostAddress();
		System.out.println("������ IP: " + inet.getHostAddress());
		
		// ������ ���� ��ü
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
		// ������ �߽� ��ü
	}
}
