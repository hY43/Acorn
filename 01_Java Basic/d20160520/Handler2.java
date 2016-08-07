package d20160520;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=1;i<=9;i++)
		{
			System.out.println("3 * " + i + " = " + (3*i));
		}
		System.out.println("종료합니다.");
		System.exit(0);
	}
	
}
