package d20160531;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatServer extends JFrame implements ActionListener {
	JTextArea jta;
	JButton jbtn;
	JScrollPane jsp;
	ServerSocket ss;
	PrintWriter pw;
	BufferedReader br;
	ArrayList<MServer> list = new ArrayList<MServer>();

	public ChatServer() {
		super("ä�ü���"); // window Component�� Title ����.
		setDefaultCloseOperation(EXIT_ON_CLOSE); // window Component�� X�� ������ ��
													// �����ϵ��� ����.

		jta = new JTextArea();
		Font f = new Font("Gothic", Font.BOLD, 30);
		jta.setFont(f);
		// jta.setFont(new Font("Gothic",Font.BOLD,30));
		// JScrollPanel ��ü�� �����Ҷ� JTextArea�� �ѱ�� �Ǹ� Panel�� TextArea�� add�Ǳ� ������
		// TextArea�� ���� Ư���� ������ �ʿ����.
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jbtn = new JButton("����");

		add(jsp, "Center");
		add(jbtn, "South");

		jbtn.addActionListener(this);

		setBounds(100, 100, 800, 600);
		setVisible(true);

		vchat();
	}

	public static void main(String[] args) {
		new ChatServer();
	}

	public void vchat() {

		try {
			// ����� ���� ���� ����.
			ss = new ServerSocket(5000);
			while (true) {
				// ����� ���� ���
				Socket client = ss.accept();
				MServer ms = new MServer(client);
				list.add(ms);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class MServer extends Thread {
		Socket client;
		String ip;
		PrintWriter pw;
		BufferedReader br;

		MServer(Socket client) throws IOException {
			this.client = client;
			InetAddress inet = client.getInetAddress();
			ip = inet.getHostAddress();
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(client.getOutputStream())));
		}

		@Override
		public void run() {
			String msg = null;

			try {
				while (true) {
					msg = br.readLine();
					jta.append("[" + ip + "]" + msg + "\n");
					broadcast("[" + ip + "]" + msg + "\n");
					// ���� ��ũ�� ���� �Ʒ��� �̵�.
					JScrollBar sb = jsp.getVerticalScrollBar();
					int v= sb.getMaximum();
					sb.setValue(v);
				}
			} catch (IOException e) {
				list.remove(this); // ���� �����ϸ� �ش� ���Ͽ� ���� �����͸� ArrayList�κ��� �����Ѵ�.
			}
		} // run() End

		public void broadcast(String data) {
			// ArrayList �ȿ� �ִ� ��� ����ڿ��� �� ������ ����.
			for (MServer x : list) {
				x.pw.println(data);
				x.pw.flush();
			}
		}
	} // MServer Class End

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("�����մϴ�");
		System.exit(0);
	} // ChatServer Class End
}
