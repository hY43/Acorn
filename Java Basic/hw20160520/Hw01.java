package hw20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
// 1���� 50���� ��ư 50���� �����ؼ� ȭ�鿡 ��ġ�غ�����(FlowLayout)

public class Hw01 extends Frame{
	/* Member Variable */
	Button[] btn;
	
	/* Constructor */
	Hw01()
	{
		// setSize(500,300); // �ʺ� 500, ���� 300
		// setLocation(350,400); // x 350 y 400
		setBounds(350,400,500,300);
		setTitle("��ư 50�� ����"); // Title "��ư 50�� ����"
		
		// ��ġ �����ڸ� FlowLayout���� ����
		FlowLayout fl = new FlowLayout(); 
		setLayout(fl); // FlowLayout ����
		
		btn = new Button[50]; // Button ��ü 50���� ���� �迭 ����
		for(int i=0;i<btn.length;i++)
		{
			btn[i] = new Button("" + (i+1)); // ���� Button ��ü ����
			add(btn[i]); // ������ Button�� �߰�
		}
		setVisible(true); // �����찡 ���̵��� �� ��ȯ
	}
	
	/* Member Method */
	public static void main(String[] args)
	{
		Hw01 h1 = new Hw01();
	}
}

