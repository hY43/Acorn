package d20160601;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class WinEx7 extends JFrame{
	Image img;
	TCanvas can;
	Container panel;
	
	public WinEx7() {

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
		
		can = new TCanvas(img);
		panel = getContentPane();
		panel.add(can);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(img, 10, 10, 800, 600, this);
	}
	public static void main(String[] args) {
		new WinEx7();
	}
}
