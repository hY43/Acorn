package d20160520;

import java.awt.Button; // Button Class ����� ���� API Import
import java.awt.Frame; // Frame Class ����� ���� API Import
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin2_ImpAction extends Frame implements ActionListener {
	/* Member Variable */
	Button btn;

	/* Constructor */
	MyWin2_ImpAction()
	{
		super("������2"); // title "������2" ����.
		// ������Ʈ �ʱ�ȭ
		btn = new Button("�� Ŭ���غ�!!"); // ��ư�� ����. �̴�� ������ �� �� ���� �����̳ʿ� ��ƾ��Ѵ�. 
		
		setSize(500,300); // �ʺ� 500 ���� 500�� ũ��� ����.
		setLocation(400,200); // ��� ��ġ�� x��ǥ 400 y��ǥ 200���� ����.
		// * Event ó��
		// 1) event source ����: btn
		// 2) Listener ����.
		// Handler�� ActionListener �������̽��� ������ Ŭ����.

		btn.addActionListener(this); // Event Source�� ��ư�� ActionListener �߰�.
		
		add(btn); // Window ������Ʈ�� btn ������Ʈ�� ��´�.
		setVisible(true); // Window â ���̵��� ����.(�� �ϼ��� â�� �ѹ��� �����ֱ� ���� �Ϲ������� setVisible�� ���� �������� �д�.)
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// ���� ActionListener ����.
		for(int i=1;i<=9;i++) // �ܼ�â�� 3�� ���.
		{
			System.out.println("3 * " + i + " = " + (3*i));
		}
		System.out.println("�����մϴ�.");
		System.exit(0); // 3�� ��� �� ���α׷� ����
	}
	
	public static void main(String[] args)
	{
		new MyWin2_ImpAction();
	}
}
