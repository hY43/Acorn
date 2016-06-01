package d20160601;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Algorithm.Drawrect;

public class WinEx5 extends Frame implements MouseListener{
	int x1, y1, x2, y2;
	int width, height;
	public WinEx5() {
		setBounds(100, 100, 800, 600);
		setLayout(null);
				addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);
		addMouseListener(this);
}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawArc(x1, y1, width, height, 0, 360);
	}
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		x2 = e.getX();
		y2 = e.getY();
		height = y2-y1;
		width = x2-x1;
		repaint();
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		new WinEx5();
	}
}
