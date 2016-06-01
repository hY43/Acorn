package d20160601;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Algorithm.Drawrect;

public class WinEx4 extends Frame implements MouseListener{
	int x1, y1, x2, y2;
	public WinEx4() {
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
		g.drawLine(x1, y1, x2, y2);
	}
	@Override
	public void update(Graphics g) {
		// super.update(g); // �ڵ����� ����� paint Method ȣ��
		// ������ �ʵ��� update Method�� ȣ������ �ʰ� �ٷ� paint Method�� ȣ���ϵ��� override
		paint(g);
	}
	public static void main(String[] args) {
		new WinEx4();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("���� �� ȣ��");
		x1 = e.getX();
		y1 = e.getY();
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("�� �� ȣ��");
		x2 = e.getX();
		y2 = e.getY();
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

}
