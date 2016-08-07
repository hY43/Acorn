package d20160524;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OuterClassEx4 extends Frame {
	public OuterClassEx4()
	{
		setBounds(100, 100, 800, 600);

		// �͸� Ŭ����(Anonymous Class) : ��ȸ������ ����Ұǵ� ���� �̸� �� �ʿ� �ֳ�..
		/*
		WindowAdapter wa = new WindowAdapter() {
			// WindowAdapter Class�� ��ӹ޴� �͸� Ŭ����.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		addWindowListener(wa);
		*/
		// ���� ���� ���� �������� wa�� ������ �ʿ� �ֳ� �׳� �Ʒ��� ���� �ִ´�.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// ���� ����ϴ� �ڵ�� [��Ŭ��]-[Add to Snippets] ����� �̿��ؼ� �����ϸ� ���ϴ�.
		
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new OuterClassEx4();
	}
	
}
