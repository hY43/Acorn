package d20160523;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends Frame implements WindowListener{
	// Exit ��ư ����� ���� Class
	public MyWindow(){}
	public MyWindow(String title)
	{
		// String �Ű����� ������ ȣ��
		super(title);
		setBounds(50,50,800,600);
		setVisible(true);
		// Event Source: window â
		// window�� ������ �����ϴ� ������
		this.addWindowListener(this); // ������ ȭ�鿡 ���� �����̱� ������ WindowListener�� ����Ѵ�.
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("â�� ó�� �������� ȣ��");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("���� ���϶� ȣ��");
		System.exit(0); // 0: ���� ����, 0�� �ƴ� �ٸ� ��: ������ ����
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("���� â�� ���� �Ŀ� ȣ��");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("�ּ�ȭ ��ư�� ������ ȣ��");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("â�� ������ ���¿��� ���� ũ��� ���ƿ� �� ȣ��");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("â�� Ȱ��ȭ �Ǿ����� ȣ��");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("â�� ��Ȱ��ȭ �Ǿ����� ȣ��");
		
	}
	public static void main(String[] args) {
		new MyWindow("����â�����");
	}
}
