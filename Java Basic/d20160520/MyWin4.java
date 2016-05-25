package d20160520;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin4 extends Frame implements ActionListener{
	/* Member Variable */
	Button rBtn;
	Button bBtn;

	/* Constructor */
	MyWin4()
	{
		// Window Component �ʱ�ȭ
		setBounds(300,300,300,300);
		setTitle("MyWin4");
		// Layout ����.(Frame ��ġ ������: BorderLayout)

		setLayout(null); // ��ġ ������ �Ƚ� -> �� ������Ʈ�� ũ��� ��ġ�� �����ؾ� ��� ����.
		
		// Button Component �ʱ�ȭ.
		rBtn = new Button("Red"); // "Red" ���ڿ��� �Էµ� ��ư ��ü ����.
		bBtn = new Button("Blue"); // "Blue" ���ڿ��� �Էµ� ��ư ��ü ����.
		
		// Button Component ��ġ �� ũ�� ����.
		// ��ġ �����ڸ� �Ⱦ��� ������ ������Ʈ�� ũ��� ��ġ�� �����Ѵ�.
		rBtn.setBounds(0,150,150,150);
		bBtn.setBounds(150,150,150,150);
		// �̺�Ʈ �ҽ�: red Button
		// addActionListener�� �Ű������� ActionListener Type �����̾�� �ϴµ� ActionListener���� �����ؾ� �ϴ� Method��
		// actionPerformed �Ѱ� �̹Ƿ� ���Ӱ� Handler Class�� �����ϴ� ���� �ƴ϶�, ActionListener Interface�� implements keyword��
		// ���� ��, ���� actionPerformed Method�� �����Ͽ���.
		// ���� �ڱ� �ڽ��� �ǹ��ϴ� this keyword�� �̿��ϸ� ������ Handler ������ ����� �ʿ� ���� addActionListener Method�� �����ϰ� �Ǵµ�
		// addActionListener Method������,,,,,,,���� ���� �Ͼ��??? -> ���� ���� ������ actionPerformed Method�� �����ϴ� ���� �ƴұ�??
		
		// Event ó��.
		rBtn.addActionListener(this); // rBtn Button ��ü�� ������ ���� Event ó��.
		bBtn.addActionListener(this); // bBtn Button ��ü�� ������ ���� Event ó��.
		
		// �ϼ��� Button component���� Window Conponent�� �Է�.
		add(rBtn);
		add(bBtn);
		// �ϼ��� Window Component�� ���̵��� Visible ������ true�� ����.
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//String color = e.getActionCommand();
		// getActionCommand�� ���� �Է� �޴� ����...���� �� ����� Command��� �� ��ü�� �ν� ���� ���� �ֱ� ������ 
		// Object ��ü�� ��ȯ�ϴ� getSource Method�� ����Ѵ�.
		Object obj = e.getSource();
		if(obj == rBtn) // ���� ��ü�� rBtn�̶�� ������ ���������� �����ض�.
			this.setBackground(Color.red);
		else if(obj == bBtn) // ���� ��ü�� bBtn�̶�� ������ �Ķ������� �����ض�.
			this.setBackground(Color.blue);
		
		//Color c = new Color(100,200,150);
		//this.setBackground(c);
	}
	public static void main(String[] args)
	{
		// ���� Stack ������ ���� ������ �Ҵ��ؼ� ���� �������� �ʵ��� Heap�� ��ü�� ����.
		new MyWin4();
	}
}
