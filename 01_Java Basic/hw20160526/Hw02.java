package hw20160526;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
//ball46
public class Hw02 extends JFrame implements ActionListener{
	JButton bigChance;
	ImageIcon[] lImg = new ImageIcon[46];
	JButton[] lotto = new JButton[6];
	Lotto[] l = new Lotto[6];
	Hw02()
	{
		setLayout(null);
		setBounds(50,50,660,300);
		bigChance = new JButton("대박!!");
		bigChance.setBounds(20,200,610,50);
		for(int i=0;i<lImg.length;i++){
			lImg[i] = new ImageIcon("src/lottoImage/ball" + (i+1) + ".png");
		}
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i] = new JButton(lImg[45]);
		}
		
		lotto[0].setBounds(50, 50, 50, 50);
		lotto[1].setBounds(50+100, 50, 50, 50);
		lotto[2].setBounds(50+100+100, 50, 50, 50);
		lotto[3].setBounds(50+100+100+100, 50, 50, 50);
		lotto[4].setBounds(50+100+100+100+100, 50, 50, 50);
		lotto[5].setBounds(50+100+100+100+100+100, 50, 50, 50);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 창이 닫히면 프로그램이 종료되도록.
		for(int i=0;i<lotto.length;i++)
			add(lotto[i]);
		add(bigChance);
		setVisible(true);
		
		bigChance.addActionListener(this);
	}
	public static void main(String[] args) {
		new Hw02();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		PrintLotto02 lt = new PrintLotto02();
		int[] getlt = lt.getLotto();
		for(int i=0;i<l.length;i++)
		{
			l[i] = new Lotto(lotto[i],lImg, getlt[i]);
			l[i].start();
		}
	}
}
