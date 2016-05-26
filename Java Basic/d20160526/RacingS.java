package d20160526;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RacingS extends JFrame implements ActionListener{
	Horse h1, h2, h3;
	JButton jbtn1, jbtn2, jbtn3;
	JButton jbtnStart; 
	ImageIcon img1, img2, img3;
	RacingS()
	{
		setBounds(50,50,1000,800);
		setLayout(null);
		jbtnStart = new JButton("시작");
		img1 = new ImageIcon("src/image/horse.gif");
		img2 = new ImageIcon("src/image/horse.gif");
		img3 = new ImageIcon("src/image/horse.gif");
		jbtn1 = new JButton(img1);
		jbtn2 = new JButton(img2);
		jbtn3 = new JButton(img3);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Window 창 종료 버튼
		jbtn1.setBounds(100,50,120,60);
		jbtn2.setBounds(100,200,120,60);
		jbtn3.setBounds(100,350,120,60);
		jbtnStart.setBounds(400,600,500,50);
		
		jbtnStart.addActionListener(this);
		add(jbtn1);
		add(jbtn2);
		add(jbtn3);
		add(jbtnStart);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == jbtnStart)
		{
			if(h1 == null)
			{
				h1 = new Horse(jbtn1);
				h2 = new Horse(jbtn2);
				h3 = new Horse(jbtn3);
				
				h1.start();
				h2.start();
				h3.start();
			}		
		}
	}
	public static void main(String[] args) {
		new RacingS();
	}
}
