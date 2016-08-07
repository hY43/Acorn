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
		// Window Component의 위치를 모니터 정중앙에 오도록 설정.
		// 현재 화면 크기
		// x,y 좌표를 저장할 Dimension Class
		Dimension d = tool.getScreenSize();
		// 화면의 너비
		int w = (int)d.getWidth();
		// 화면의 높이
		int h = (int)d.getHeight();
		
		// x 좌표
		int x = w/2 - 800/2;
		// y 좌표
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
