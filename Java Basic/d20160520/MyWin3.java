package d20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyWin3 extends Frame {
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	
	public MyWin3()
	{
		// â�� ũ�� �ʺ� 400, ���� 400
		setSize(400,400);
		// ��ġ 450, 400
		setLocation(450,400);
		// ���� ��ư ��ġ
		setTitle("��ư ��ġ");
		// ������Ʈ �ʱ�ȭ
		//btn1.setSize(300,300); // btn1 �� �ʱ�ȭ ���� �ʾұ� ������ null �� ����ִ�.
		btn1 = new Button("��");
		btn2 = new Button("��");
		btn3 = new Button("��");
		btn4 = new Button("��");
		btn5 = new Button("�߾�");

		//FlowLayout fl = new FlowLayout(); // FlowLayout�� ����ϱ� ���� ��ü ����
		//setLayout(fl); // FlowLayout�� �����ϱ� ���� setLayout Method�� ���
		add(btn1,"East"); // add([Button ��ü], [Button ��ġ(ù���ڴ� �빮��)]);
		add(btn2,"West");
		add(btn3,"South");
		add(btn4,"North");
		add(btn5,"Center");
		// ������Ʈ�� ��ġ�ϱ� ���� �ϱ� ���� ��ġ �����ڸ� ����Ѵ�.
		// Frame�� �⺻ ��ġ ������: ���� ���̾ƿ�
		
		// â�� ���̰� ����
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MyWin3 mw1 = new MyWin3();
	}
}
