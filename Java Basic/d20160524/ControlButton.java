package d20160524;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ControlButton extends Frame implements KeyListener{
	Button btn;
	
	ControlButton()
	{
		setBounds(0,0,1000,800);
		setTitle("Control");
		setLayout(null);
		btn = new Button("^.^");
		btn.setBounds(216,415,100,100);
		btn.addKeyListener(this);
		add(btn);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ControlButton();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// Ű���� ��ư ��, ���ڸ� �ν�
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// ��� Ű���� ��ư �ν�
		int key = e.getKeyCode();

		int x = btn.getX();
		int y = btn.getY();
		
		if(key == 38) // up
			y -= 3;
		else if(key == 40) // down
			y += 3;
		else if(key == 37) // left
			x -= 3;
		else if(key == 39) // right
			x += 3;
		else if(key == 32) // space bar
		{
			for(int i=0;i<=50;i++)
			{
				y-=1;
				btn.setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			for(int i=0;i<=50;i++)
			{
				y+=1;
				btn.setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
				
		}
		btn.setLocation(x, y);
	}
	@Override
	public void keyReleased(KeyEvent e){
		// Ű���� ��ư ���� �ν�
	}
}
