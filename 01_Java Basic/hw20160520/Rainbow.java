package hw20160520;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rainbow extends Frame implements ActionListener{
	Button btn = new Button();
	
	Rainbow()
	{
		// Window Component �ʱ�ȭ.
		setTitle("Rainbow");
		setBounds(300,300,300,300);
		// Layout ����
		setLayout(null);
		// Button Component �ʱ�ȭ.
		btn = new Button("Click");
		btn.setBounds(0,150,300,150);
		// Window Component�� Button Component �ֱ�.
		add(btn);
		// �ϼ��� Component ���̵��� true �������� ����.
		setVisible(true);
		// Event �߻��� �����ų ���� ����.
		btn.addActionListener(this);
		// Listener
		
		// Handler
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ed) {
		// 7 ���� ������ ����ִ� Color Ÿ���� �迭 c ���� �� �ʱ�ȭ.
		Color[] c = {Color.red, Color.yellow, Color.green, Color.blue, Color.magenta, Color.pink, Color.ORANGE};

		
		for(int i=0;i<7;i++)
		{
			this.setBackground(c[i]); // i��° ��ҿ� ����ִ� �������� ���� ����.
			// 0.1 �ʰ� ����Ű�� ���� try~catch ��.
			try {
				Thread.sleep(100); // 0.1�ʰ� ���.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		new Rainbow(); 
	}
}
