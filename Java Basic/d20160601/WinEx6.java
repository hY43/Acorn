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
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 등록된 이미지를 x, y 좌표를 하여 너비 800 높이 600으로 
		
		g.drawImage(img, 10, 10, 800, 600, this);
		
	}
	public static void main(String[] args) {
		new WinEx6();
	}
}
