package d20160601;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx2 extends Frame{
	public WinEx2() {
		setBounds(100,100,800,600);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawOval(100, 100, 400, 400);
		g.drawArc(200, 180, 50, 50, 20, 140);
		g.drawOval(200, 200, 50, 50);
		g.fillOval(215, 215, 20, 20);
		g.drawArc(350, 180, 50, 50, 20, 140);
		g.drawOval(350, 200, 50, 50);
		g.fillOval(365, 215, 20, 20);
		g.fillRect(285, 250, 30, 50);
		g.drawArc(250, 300, 200, 20, 180, 180);
	}
	public static void main(String[] args) {
		new WinEx2();
	}
}
