package d20160601;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx6 extends Frame {
	Image img;
	public WinEx6() {

		setLayout(null);
				addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Toolkit tool = Toolkit.getDefaultToolkit();
		img = tool.getImage("src/image/test.png");
		// Window Component�� ��ġ�� ����� ���߾ӿ� ������ ����.
		// ���� ȭ�� ũ��
		// x,y ��ǥ�� ������ Dimension Class
		Dimension d = tool.getScreenSize();
		// ȭ���� �ʺ�
		int w = (int)d.getWidth();
		// ȭ���� ����
		int h = (int)d.getHeight();
		
		// x ��ǥ
		int x = w/2 - 800/2;
		// y ��ǥ
		int y = h/2 - 600/2;
		
		setBounds(x,y,800,600);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// ��ϵ� �̹����� x, y ��ǥ�� �Ͽ� �ʺ� 800 ���� 600���� 
		
		g.drawImage(img, 10, 10, 800, 600, this);
		
	}
	public static void main(String[] args) {
		new WinEx6();
	}
}
