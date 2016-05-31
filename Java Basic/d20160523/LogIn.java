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
		btnLogin = new Button("로그인"); // btnLogin 객체를 생성하고, 타이틀을 "로그인"으로 설정.
		btnLogin.setBounds(150,200,80,50); // btnLogin 객체의 위치 및 크기 설정.
		Color c = new Color(180,205,230); // btnLogin 객체의 색을 변경하기 위해 RGB 값을 섞어 Color 참조 변수에 대입.
		btnLogin.setBackground(c); // 생성한 Color 참조 변수 c를 이용하여 btnLogin 객체의 색 변경.
		btnReset = new Button("Reset"); // btnReset 객체 생성하고, 타이틀을 "Reset"으로 설정.
		btnReset.setBounds(250,200,80,50); // btnReset 객체의 위치 및 크기 설정.
		c = new Color(224,229,245); // btnLogin 객체의 색을 변경하기 위해 Color 객체 생성.
		btnLogin.setBackground(c); // Color 참조 변수를 이용하여 btnLogin 객체 배경색 설정.
		
		// Label Component
		lbId = new Label("ID", Label.CENTER); // lbId 객체를 선언하고, 그 내용으로 "ID" 문자열을 넣는데 가운데로 정렬한다.
		lbId.setBounds(150,80, 20,20); // lbId 객체의 크기 및 위치를 설정.
		lbPw = new Label("PW", Label.CENTER); // lbPw 객체를 선언하고, 그 내용으로 "PW" 문자열을 넣는데 가운데로 정렬한다.
		lbPw.setBounds(150,120, 20,20); // lbPw 객체의 크기 및 위치를 설정.
		
		// TextField Component
		tfId = new TextField(); // tfId 객체를 생성.
		tfId.setBounds(180, 75, 150, 30); // tfId 객체의 크기 및 위치 설정.
		tfPw = new TextField(); // tfPw 객체를 생성.
		tfPw.setBounds(180, 115, 150, 30); // tfPw 객체의 크기 및 위치 설정.
		
		/* Component 추가 */
		add(tfPw);
		add(tfId);
		add(lbId);
		add(lbPw);
		add(btnLogin);
		add(btnReset);
		setVisible(true);
		
		/* Listener 추가 및 수행 */
		btnLogin.addActionListener(this); // Button 객체인 btnLogin에 발생 가능한 Event를 위한 Listener 추가.
		btnReset.addActionListener(this); // Button 객체인 btnReset에 발생 가능한 Event를 위한 Listener 추가.
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
