package d20160526;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Racing extends Frame{
	Button[] horse = new Button[3];
	Button run;
	
	Racing()
	{
		setTitle("경마게임");
		setBounds(50,50,800,350);
		setLayout(null);
		
		run = new Button("RUN");
		run.setBounds(50,270,700,50);
		
		for(int i=0;i<horse.length;i++)
			horse[i] = new Button(""+(i+1));
		horse[0].setBounds(50, 50, 100, 50);
		horse[1].setBounds(50, 50+60, 100, 50);
		horse[2].setBounds(50, 50+60+60, 100, 50);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		for(int i=0;i<horse.length;i++)
			add(horse[i]);
		add(run);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Racing();
	}
}
