package d20160525;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BigChance extends Frame implements ActionListener{
	Button btn;
	Label[] lotto = new Label[6];
	
	BigChance()
	{
		setLayout(null);
		setBounds(100,100,600,400);
		btn = new Button("´ë¹Ú");
		btn.setBounds(100,300,400,50);
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i] = new Label();
			//lotto[i].setBackground(Color.black);
		}
		lotto[0].setBounds(100, 100, 40, 50);
		lotto[1].setBounds(170, 100, 40, 50);
		lotto[2].setBounds(240, 100, 40, 50);
		lotto[3].setBounds(310, 100, 40, 50);
		lotto[4].setBounds(380, 100, 40, 50);
		lotto[5].setBounds(450, 100, 40, 50);

		add(btn);
		for(int i=0;i<lotto.length;i++)
			add(lotto[i]);
		
		btn.addActionListener(this);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		PrintLotto02 pt = new PrintLotto02();
		int[] getlotto = pt.getLotto();
		for(int i=0;i<getlotto.length;i++)
		{
			lotto[i].setText(String.valueOf(getlotto[i]));
		}
	}
	
	public static void main(String[] args) {
		new BigChance();
	}
}
