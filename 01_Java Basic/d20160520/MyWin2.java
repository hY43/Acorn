package d20160520;

import java.awt.Button; // Button Class ����� ���� API Import
import java.awt.Frame; // Frame Class ����� ���� API Import

public class MyWin2 extends Frame{
	/* Member Variable */
	Button btn;

	/* Constructor */
	MyWin2()
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
		Handler hd = new Handler();
		btn.addActionListener(hd);
		
		add(btn); // Window ������Ʈ�� btn ������Ʈ�� ��´�.
		setVisible(true); // Window â ���̵��� ����.(�� �ϼ��� â�� �ѹ��� �����ֱ� ���� �Ϲ������� setVisible�� ���� �������� �д�.)
	}
}
