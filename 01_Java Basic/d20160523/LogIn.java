package d20160523;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn extends Frame implements ActionListener{
	Button btnLogin;
	Button btnReset;
	TextField tfId;
	TextField tfPw;
	Label lbId;
	Label lbPw;
	
	public LogIn()
	{
		/* Component 초기화 */
		// Window Component
		setTitle("로그인"); // Window Component Title 명 지정
		setLayout(null); // 배치 관리자 사용 X
		setBounds(500,300,500,300); // Window Component 위치 및 크기 지정
		
		// Button Component
		btnLogin = new Button("로그인"); // "로그인" 버튼 생성
		btnLogin.setBounds(150,200,80,50); // "로그인" 버튼의 사이즈 및 위치 설정.
		Color c = new Color(180,205,230); // RGB 값을 이용한 color 생성
		btnLogin.setBackground(c); // 생성한 color로 "로그인" 버튼 색 설정.
		btnReset = new Button("Reset"); // "Reset" 버튼 생성
		btnReset.setBounds(250,200,80,50); // "Reset" 버튼의 위치 및 크기 지정.
		c = new Color(224,229,245);
		btnLogin.setBackground(c);
		
		// Label Component
		lbId = new Label("ID", Label.CENTER); // ID 문자열 라벨을 생성하되 문자열을 라벨의 중앙에 위치한다.
		lbId.setBounds(150,80, 20,20); // 라벨의 위치 및 크기 설정.
		lbPw = new Label("PW", Label.CENTER); // PW 문자열 라벨을 생성하되 문자열을 라벨의 중앙에 위치한다.
		lbPw.setBounds(150,120, 20,20); // 라벨의 위치 및 크기 설정.
		
		// TextField Component
		tfId = new TextField(); // id를 입력할 TextField 생성
		tfId.setBounds(180, 75, 150, 30);
		tfPw = new TextField(); // 비밀번호를 입력할 TextField 생성.
		tfPw.setBounds(180, 115, 150, 30);
		
		/* Component 추가 */
		add(tfPw);
		add(tfId);
		add(lbId);
		add(lbPw);
		add(btnLogin);
		add(btnReset);
		setVisible(true);
		
		/* Listener 추가 및 수행 */
		btnLogin.addActionListener(this); // login 버튼에 대한 리스너 추가.
		btnReset.addActionListener(this); // Reset 버튼에 대한 리스너 추가.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼의 참조 값 비교를 위한 getSource Method
		if(e.getSource() == btnLogin) // 로그인 버튼을 눌렀을 경우.
		{
			System.out.println("ID: " + tfId.getText()); // ID Field에 입력된 값 가져와서 출력
			System.out.println("PW: " + tfPw.getText()); // PW field에 입력된 값 가져와서 출력
			if(tfId.getText().equals("aaa") && tfPw.getText().equals("bbb")){
				// id가 aaa이고 pw가 bbb인 경우 로그인 성공 메세지 띄우고 구구단 Method 출력
				System.out.println("로그인 성공!!");
				new GuGuWin();
			}
			else{
				System.out.println("로그인 실패!!");
			}
		}
		else if(e.getSource() == btnReset) // Reset 버튼을 누른 경우.
		{
			tfId.getText();tfId.setText("");
			tfPw.getText();tfPw.setText("");
		}
	}
	
	public static void main(String[] args)
	{
		new LogIn();
	}
}
