package d20160520;

import java.awt.Button;
import java.awt.Frame;

public class WinGGD extends Frame{
	Button btn; // Button Component�� Handler�� �����ϱ� ���� ����.
	public WinGGD()
	{
		super("������"); // Title "������"
		setLocation(300,300); // Window �����ġ x��ǥ 300, y��ǥ 300
		setSize(300,300); // Window ũ�� �ʺ� 300, ���� 300
		
		btn = new Button("3�����"); // ��ư�� "3�����" ���ڿ��� �ְ� �ʱ�ȭ
		Handler2 hd = new Handler2(); // button�� ���� Listener ����
		btn.addActionListener(hd); // button�� ���� Handler�� ����Ͽ� ����.
		add(btn); // Window ������Ʈ�� button Component�� �ִ´�.
		setVisible(true); // �ϼ��� Window�� �Ѳ����� ���
	}
}

