package d20160520;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// ���� �ϰ��� �ϴ� �۾�
		System.out.println("�� �� Ŭ���� ����@@");
		System.out.println("�����մϴ�.");
		System.exit(0);
		// 0: ���� ����, �ٸ� ��: ������ ����
	}
}
