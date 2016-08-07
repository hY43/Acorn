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
			// IP�� 192.168.0.234 �̸�, Port ��ȣ 5000�� ������ ���� ��ü ����.
			Socket s = new Socket("192.168.0.234", 5000); 
			// Server �� Socket���κ��� �����͸� �޾ƿ��� ���� InputStream ��ü ����.(������ �Է� ��Ʈ�� ��ü�� �����Ѵ�)
			InputStream is = s.getInputStream();
			// Server �� �������� �����͸� ������ ���� OutputStream ��ü ����.(������ ��� ��Ʈ�� ��ü�� �����Ѵ�.)
			OutputStream os = s.getOutputStream();
			
			// Socket�� �⺻������ Byte Stream�� �����Ѵ�.
			// �����͸� ���� �ѱ۵� �Է� �����ϵ��� �ϱ� ���� Byte Stream Type�� Char Stream���� ��ȯ�Ѵ�(OutputStreamWriter �̿�)
			OutputStreamWriter osw = new OutputStreamWriter(os);
			// ���ݴ� ���� ���� ���� Buffered Class ���.
			BufferedWriter bw = new BufferedWriter(osw);
			// println Method ����� ���� PrintWriter ��ü ����
			// -> ��� ������ BufferedWriter�� write Method�� ����ص� �ǳ�, println Method�� �Ű� ���� Ÿ�Կ� ������ ���� �����̴�.
			PrintWriter pw = new PrintWriter(bw);
			
			// Ű����� ���� �����͸� �Է� �޾� Server Socket���� �����ϱ� ���� �켱 System.in���� �Է� ��Ʈ�� ��ü�� �����Ѵ�.
			InputStreamReader isr = new InputStreamReader(System.in);
			// �����κ��� �Է� ���� �����͸� �о� ȭ�鿡 ����ϱ� ���� ��ü ����.
			InputStreamReader isr2 = new InputStreamReader(is);
			
			// �Է� �ӵ��� ���̱� ���� Buffered Class ���.
			BufferedReader br = new BufferedReader(isr);
			BufferedReader br2 = new BufferedReader(isr2);
			
			String data = null;
			while((data = br.readLine())!=null)
			{
				pw.println(data); // Ű����� �Է¹��� �����͸� Server���� ����(�����δ� buffer�� ���)
				pw.flush(); // buffer�� ���� ������ �������� ����.
				String msg = br2.readLine(); // ������ ���� ���� �����͸� msg ������ ����
				System.out.println("������ ������ ��: " + msg);
			}
			
		} catch (UnknownHostException e) {
			// �� �� ���� Server�� ��.
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
