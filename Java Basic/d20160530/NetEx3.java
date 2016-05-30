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
			ServerSocket s = new ServerSocket(5000); // 5000�� ��Ʈ�� ���� ��ü ����
			Socket client = s.accept(); // Ŭ���̾�Ʈ�� ���ö� ���� ��� �ϱ� ���� ���� ���� ��, ��ٸ��� ���� accept Method ���.
			InetAddress inet = client.getInetAddress(); // Ŭ���̾�Ʈ�� �����ϸ� IP�� ����.
			System.out.println("ip: " + inet.getHostAddress()); // ���� IP ���
			InputStream is = client.getInputStream(); // Ŭ���̾�Ʈ�κ��� �����͸� �Է� �ޱ� ���� �Է� ��Ʈ�� ��ü ����
			OutputStream os = client.getOutputStream();	// Ŭ���̾�Ʈ���� �����͸� �����ϱ� ���� ��� ��Ʈ�� ��ü ����.
			OutputStreamWriter osw = new OutputStreamWriter(os); // �ѱ� ������ ���� Char Stream Type�� ��ȯ.
			
			BufferedWriter bw = new BufferedWriter(osw); // �ӵ� ������ ���� Buffered Class ��ü ����.
			
			PrintWriter pw = new PrintWriter(bw);
			InputStreamReader isr = new InputStreamReader(is); // �ѱ��� ������ ���� �Է� �޾����� ó���ϱ� ���� Char Stream������ ��ȯ.
			BufferedReader br = new BufferedReader(isr);
			
			String msg = null;
			while((msg = br.readLine()) != null)
			{
				System.out.println(msg);
				pw.println(msg);
				//bw.write(msg); // �̷��� ����ص� ������ ���⿡���� �ڷ����� ���� �Ű澲�� �ʱ� ���� println ���
				pw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
