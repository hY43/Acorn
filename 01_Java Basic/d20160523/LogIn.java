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
		/* Component �ʱ�ȭ */
		// Window Component
		setTitle("�α���"); // Window Component Title �� ����
		setLayout(null); // ��ġ ������ ��� X
		setBounds(500,300,500,300); // Window Component ��ġ �� ũ�� ����
		
		// Button Component
		btnLogin = new Button("�α���"); // "�α���" ��ư ����
		btnLogin.setBounds(150,200,80,50); // "�α���" ��ư�� ������ �� ��ġ ����.
		Color c = new Color(180,205,230); // RGB ���� �̿��� color ����
		btnLogin.setBackground(c); // ������ color�� "�α���" ��ư �� ����.
		btnReset = new Button("Reset"); // "Reset" ��ư ����
		btnReset.setBounds(250,200,80,50); // "Reset" ��ư�� ��ġ �� ũ�� ����.
		c = new Color(224,229,245);
		btnLogin.setBackground(c);
		
		// Label Component
		lbId = new Label("ID", Label.CENTER); // ID ���ڿ� ���� �����ϵ� ���ڿ��� ���� �߾ӿ� ��ġ�Ѵ�.
		lbId.setBounds(150,80, 20,20); // ���� ��ġ �� ũ�� ����.
		lbPw = new Label("PW", Label.CENTER); // PW ���ڿ� ���� �����ϵ� ���ڿ��� ���� �߾ӿ� ��ġ�Ѵ�.
		lbPw.setBounds(150,120, 20,20); // ���� ��ġ �� ũ�� ����.
		
		// TextField Component
		tfId = new TextField(); // id�� �Է��� TextField ����
		tfId.setBounds(180, 75, 150, 30);
		tfPw = new TextField(); // ��й�ȣ�� �Է��� TextField ����.
		tfPw.setBounds(180, 115, 150, 30);
		
		/* Component �߰� */
		add(tfPw);
		add(tfId);
		add(lbId);
		add(lbPw);
		add(btnLogin);
		add(btnReset);
		setVisible(true);
		
		/* Listener �߰� �� ���� */
		btnLogin.addActionListener(this); // login ��ư�� ���� ������ �߰�.
		btnReset.addActionListener(this); // Reset ��ư�� ���� ������ �߰�.
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// ��ư�� ���� �� �񱳸� ���� getSource Method
		if(e.getSource() == btnLogin) // �α��� ��ư�� ������ ���.
		{
			System.out.println("ID: " + tfId.getText()); // ID Field�� �Էµ� �� �����ͼ� ���
			System.out.println("PW: " + tfPw.getText()); // PW field�� �Էµ� �� �����ͼ� ���
			if(tfId.getText().equals("aaa") && tfPw.getText().equals("bbb")){
				// id�� aaa�̰� pw�� bbb�� ��� �α��� ���� �޼��� ���� ������ Method ���
				System.out.println("�α��� ����!!");
				new GuGuWin();
			}
			else{
				System.out.println("�α��� ����!!");
			}
		}
		else if(e.getSource() == btnReset) // Reset ��ư�� ���� ���.
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
