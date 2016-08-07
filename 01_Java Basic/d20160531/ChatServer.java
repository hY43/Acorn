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
		super("채팅서버"); // window Component의 Title 설정.
		setDefaultCloseOperation(EXIT_ON_CLOSE); // window Component의 X를 눌렀을 때
													// 종료하도록 설정.

		jta = new JTextArea();
		Font f = new Font("Gothic", Font.BOLD, 30);
		jta.setFont(f);
		// jta.setFont(new Font("Gothic",Font.BOLD,30));
		// JScrollPanel 객체를 생성할때 JTextArea를 넘기게 되면 Panel에 TextArea가 add되기 때문에
		// TextArea에 대한 특별한 조작이 필요없다.
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		jbtn = new JButton("종료");

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
			// 통신을 위한 소켓 생성.
			ss = new ServerSocket(5000);
			while (true) {
				// 사용자 접속 대기
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
					// 현재 스크롤 가장 아래로 이동.
					JScrollBar sb = jsp.getVerticalScrollBar();
					int v= sb.getMaximum();
					sb.setValue(v);
				}
			} catch (IOException e) {
				list.remove(this); // 접속 종료하면 해당 소켓에 대한 데이터를 ArrayList로부터 제거한다.
			}
		} // run() End

		public void broadcast(String data) {
			// ArrayList 안에 있는 모든 사용자에게 이 내용을 전달.
			for (MServer x : list) {
				x.pw.println(data);
				x.pw.flush();
			}
		}
	} // MServer Class End

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("종료합니다");
		System.exit(0);
	} // ChatServer Class End
}
