package d20160601;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WinEx1 extends Frame{
	public WinEx1(){
		
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
		// paint: 그림을 그려주는 Method
		// Graphics g: 붓이라고 생각하면 편하다.
		// 직선 그리기.
		g.drawLine(100, 100, 200, 200);
		// 사각형 그리기.
		g.drawRect(200, 200, 150, 150);
		// 원 그리기.
		g.drawOval(200, 200, 150, 150);
		// 타원 그리기.(x, y, width, height, 시작 각, 끝 각)
		g.drawArc(100, 100, 100, 100, 0, 180);
		// 사각형 채우기
		g.fillRect(300, 300, 50, 50);
		g.setColor(Color.red);
		g.fillOval(400, 300, 50, 50);
		g.setColor(Color.blue);
		g.drawString("아영씨와 오빠들", 200, 200);
		
	}
	
	public static void main(String[] args) {
		new WinEx1();
	}
}
