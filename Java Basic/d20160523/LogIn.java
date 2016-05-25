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
		btnLogin = new Button("로그인");
		btnLogin.setBounds(150,200,80,50);
		Color c = new Color(180,205,230);
		btnLogin.setBackground(c);
		btnReset = new Button("Reset");
		btnReset.setBounds(250,200,80,50);
		c = new Color(224,229,245);
		btnLogin.setBackground(c);
		
		// Label Component
		lbId = new Label("ID", Label.CENTER);
		lbId.setBounds(150,80, 20,20);
		lbPw = new Label("PW", Label.CENTER);
		lbPw.setBounds(150,120, 20,20);
		
		// TextField Component
		tfId = new TextField();
		tfId.setBounds(180, 75, 150, 30);
		tfPw = new TextField();
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
		btnLogin.addActionListener(this);
		btnReset.addActionListener(this);
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
