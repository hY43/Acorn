package hw20160526;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Lotto extends Thread{
	JButton btn;
	ImageIcon[] lImg;
	int num;
	
	public Lotto(JButton btn, ImageIcon[] lImg, int num)
	{
		this.btn = btn;
		this.lImg = lImg;
		this.num = num;
	}
	@Override
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			this.btn.setIcon(lImg[(int)(Math.random()*45)]);
			try {
				Thread.sleep((int)(Math.random()*100));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.btn.setIcon(lImg[num]);
	}
}
