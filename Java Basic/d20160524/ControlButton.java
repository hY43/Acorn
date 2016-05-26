package d20160524;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
// Keyboard�� ���� Event�� �ν��Ͽ� ó���ϱ� ���� Listener�� KeyListener Interface�� ����Ͽ���.
public class ControlButton extends Frame implements KeyListener{
	Button btn;
	
	ControlButton()
	{
		setBounds(0,0,1000,800); // Window Component�� ��ġ �� ũ�� ����
		setTitle("Control"); // Window Component�� Ÿ��Ʋ ����
		setLayout(null); // Layout�� Null ó���Ͽ� ����ڰ� �����Ͽ� ����� �� �ְ� ��.
		btn = new Button("^.^"); // Button�� ����
		btn.setBounds(216,415,100,100); // Button�� ��ġ �� ũ�� ����.
		btn.addKeyListener(this); // Button�� ���� Ű���� ������ �ν��ϱ� ���� KeyListener ��ġ
		add(btn); // Button Component�� Window Component�� �ֱ�.

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // Window Component�� X��ư�� ���� ��쿡 ���� ��Ű�� ���� WindowAdapter Class ���.
			// WindowAdapter Class���� Window Event ���õ� Method���� �������̵� �Ǿ� �� Method�� �����Ǿ��ֱ� ������ �ʿ��� Method�� �ҷ����� ����ϱ� ���� �̷��� ����� �̿�.
		
		setVisible(true); // �ϼ��� Window Component ȭ�鿡 ���.
		
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
		int key = e.getKeyCode(); // �Էµ� Keyboard�� �������� �ƽ�Ű �ڵ尪���� �޾Ƽ� int Type ���� key�� ����.

		// ���� Button�� x,y ��ǥ�� ���� �޾ƿ´�.
		int x = btn.getX();
		int y = btn.getY();
		
		if(key == 38) // up
			y -= 3; // y��ǥ�� ���� ���Ѽ� ���� �������� �ö󰡰� �Ѵ�.
		else if(key == 40) // down
			y += 3; // y��ǥ�� ���� ���Ѽ� �Ʒ��� �������� �������� �Ѵ�.
		else if(key == 37) // left
			x -= 3; // x��ǥ�� ���� ���� �������� �̵� ��Ų��.
		else if(key == 39) // right
			x += 3; // x��ǥ�� ���� ���� ���������� �̵� ��Ų��.
		else if(key == 32) // space bar
		{
			// JUMP!!!!
			for(int i=0;i<=50;i++) // 50��ŭ ��� ��Ŵ
			{
				y-=1;
				btn.setLocation(x, y);
				try {
					Thread.sleep(5); // �׳� ��� ��Ű�� �ʹ� ���� Ȯ���� �� �����Ƿ� �ణ�� �����̸� �ֱ� ���� sleep Method ���.
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			for(int i=0;i<=50;i++) // 50��ŭ �ϰ� ��Ŵ.
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
		btn.setLocation(x, y); // ��ȭ�� ��ǥ�� �̵�.
	}
	@Override
	public void keyReleased(KeyEvent e){
		// Ű���� ��ư ���� �ν�
	}
}
