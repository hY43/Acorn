package d20160601;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class WinEx3 extends Frame implements ActionListener {
	Button btn;
	Random rnd = new Random();

	public WinEx3() {
		setBounds(100, 100, 800, 600);
		setLayout(null);
		btn = new Button();
		btn.setBounds(200, 500, 400, 40);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		add(btn);
		setVisible(true);
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	@Override
	public void paint(Graphics g) {
		// 랜덤한 위치와 크기로 그리기.
		for (int i = 0; i < 2000; i++) {
			// g.setColor(new Color(rnd.nextInt(255), rnd.nextInt(255), rnd.nextInt(255)));
			g.drawOval(rnd.nextInt(800), rnd.nextInt(600), rnd.nextInt(300), rnd.nextInt(300));
			g.drawRect(rnd.nextInt(800), rnd.nextInt(600), rnd.nextInt(300), rnd.nextInt(300));

		}
	}

	public static void main(String[] args) {
		new WinEx3();
	}

}
