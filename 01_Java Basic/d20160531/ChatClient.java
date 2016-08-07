package d20160531;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable, KeyListener{
	JPanel jp1, jp2, jpSouth;
	JLabel jIp, jName;
	JButton jbtnConnect, jbtnReset , jbtnSend;
	JTextField jtfIp, jtfName, jtfChat;
	
	JTextArea jta;
	JScrollPane jsp;
	
	CardLayout layout;
	
	String ip,name;
	Socket s;
	PrintWriter pw;
	BufferedReader br;
	
	public ChatClient(){
		super("채팅클라이언트");
		setBounds(100, 100, 800, 600);
		// 컴포넌트 초기화 
		layout = new CardLayout();
		
		setLayout(layout);
				
		jp1 = new JPanel();
		jp2 = new JPanel();
		jpSouth = new JPanel();
		
		
		
		jIp = new JLabel("IP");
		jName = new JLabel("NAME");
		jbtnConnect = new JButton("Connect");
		jbtnReset = new JButton("RESET");
		jtfIp = new JTextField();
		jtfName = new JTextField();
		
		jta = new JTextArea();
		jsp = new JScrollPane(jta,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		jtfChat = new JTextField(50);
		jbtnSend = new JButton("전송"); 
		jpSouth.add(jtfChat);
		jpSouth.add(jbtnSend);
		jp2.setLayout(new BorderLayout());
		jp2.add(jsp,"Center");
		jp2.add(jpSouth, "South");
		
		
		jtfChat.addKeyListener(this);
		
		// Frame 기본 배치관리자 : BorderLayout
		// Panel 기본 배치관리자 : FlowLayout 
		jp1.setLayout(null);
		// 모든 컴포넌트의 크기, 위치 지정 
		jIp.setBounds(170, 170, 100, 30);
		jName.setBounds(170, 270, 100, 30);
		jtfIp.setBounds(300, 170, 100, 30);
		jtfName.setBounds(300, 270, 100, 30);
		jbtnConnect.setBounds(200, 450, 100, 30);
		jbtnReset.setBounds(350, 450, 100, 30);
		
		jp1.add(jIp);
		jp1.add(jName);
		jp1.add(jtfIp);
		jp1.add(jtfName);
		jp1.add(jbtnConnect);
		jp1.add(jbtnReset);
		
		add(jp1,"login");
		
		add(jp2,"chat");
		
		layout.show(getContentPane(), "login");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		jbtnConnect.addActionListener(this);
		jbtnReset.addActionListener(this);
		jbtnSend.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ChatClient();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtnConnect)
		{
			layout.show(getContentPane(), "chat");
			ip = jtfIp.getText();
			name = jtfName.getText();
			// 채팅 시작.
			vchat();
		}else if(obj == jbtnReset){
			jtfIp.getText();jtfIp.setText("");
			jtfName.getText();jtfName.setText("");
		}else if(obj == jbtnSend){
			
		}
	}

	public void vchat(){
		// 현재 클래스가 runnable 인터 페이스 구현 객체
		Thread th = new Thread(this);
		// 쓰레드 시작.
		th.start();
	}
	
	@Override
	public void run() {
		// 소켓 생성.

		try {
			s = new Socket(ip, 5000);
			// 수신부
			br = new BufferedReader(
					new InputStreamReader(
							s.getInputStream()));
			// 발신부
			pw = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									s.getOutputStream())));
			pw.println(name);
			pw.flush();
			String data = null;
			while (true) {
				data = br.readLine();
				jta.append(data + "\n");
				JScrollBar sb = jsp.getVerticalScrollBar();
				int v = sb.getMaximum();
				sb.setValue(v);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == 10){ // Enter 입력.
			String data = jtfChat.getText();
			// jta에 글자 추가
			jta.append("[ME]: " + data + "\n");
			jtfChat.getText();jtfChat.setText("");
			// 서버에 전송
			pw.println(data);
			pw.flush();
			JScrollBar sb = jsp.getVerticalScrollBar();
			int v = sb.getMaximum();
			sb.setValue(v);
		}
	}

	@Override
	public void keyReleased(KeyEvent e){}
}
