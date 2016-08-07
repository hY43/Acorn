package hw20160520;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hw02 extends Frame implements ActionListener{
	Button btn;
	Hw02()
	{
		this.setBounds(300,300,400,400);
		this.setLayout(null);
		this.btn = new Button("Click");
		btn.setBounds(150,300,100,30);
		btn.addActionListener(this);
		add(btn);
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Hw02();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		int rgb1 = (int)(Math.random()*256);
		int rgb2 = (int)(Math.random()*256);
		int rgb3 = (int)(Math.random()*256);
		Color c = new Color(rgb1, rgb2, rgb3);
		this.setBackground(c);
	}

}
