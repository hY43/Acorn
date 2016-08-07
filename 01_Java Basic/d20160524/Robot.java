package d20160524;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Robot extends Frame implements KeyListener{
	Button[] btn = new Button[6];
	Robot()
	{
		setBounds(0,0,1000,800);
		setLayout(null);
		btn[0] = new Button("^.^"); // �Ӹ�
		btn[0].setBounds(400, 200, 50, 30);
		btn[1] = new Button(); // ����
		btn[1].setBounds(400, 235, 50, 60);
		btn[2] = new Button(); // ����
		btn[2].setBounds(345, 235, 50, 20);
		btn[3] = new Button(); // ������
		btn[3].setBounds(455, 235, 50, 20);
		btn[4] = new Button(); // �޴ٸ�
		btn[4].setBounds(400, 300, 20, 60);
		btn[5] = new Button(); // �����ٸ�
		btn[5].setBounds(430, 300, 20, 60);	
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // Window Component ���Ḧ ���� WindowAdapter ���.
		
		for(int i=0;i<btn.length;i++) // ����Ű�� ������ �κ� ��ư ��ü�� �����̵��� �Ѳ����� 
		{
			btn[i].addKeyListener(this); // ������ ����Ű�� ���� ������ ��ġ.
			add(btn[i]); // �� ��ư��  Window Component�� ��ġ.
		}
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Robot();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode(); // Ű���� �Է� �� Ȯ���� ���� keyCode�� �޾� int Type ���� key�� ����.
		for (int i = 0; i < btn.length; i++) {
			// ��ǥ ������ ���� ���� ��ư�� x,y ��ǥ�� �޾Ƽ� int type ���� x�� y�� �����Ѵ�.
			int x = btn[i].getX();
			int y = btn[i].getY();
			System.out.println(key); // ����Ű�� ���� �ƽ�Ű �ڵ尪 Ȯ���� ���� key ���� ����Ѵ�.
						
			if (key == 38) // up
			{
				y -= 3;
				btn[i].setLocation(x,y);
			}
			else if (key == 40) // down
			{
				y += 3;
				btn[i].setLocation(x,y);
			}
			else if (key == 37) // left
			{
				x -= 3;
				btn[i].setLocation(x,y);
			}
			else if (key == 39) // right
			{
				x += 3;
				btn[i].setLocation(x,y);
			}
			else if (key == 32) // space bar
			{
				for(int j=0;j<=100;j++)
				{
					for(int k=0;k<btn.length;k++)
					{
						// ������ JUMP!!
						int val;

						if (j <= 50) {
							// ���� �������� �ö󰡴� ���� ����� ���ؼ��� x��ǥ���� �þ�� y��ǥ���� �پ�����Ѵ�. 
							y = btn[k].getY() - 1;
							x = btn[k].getX() + 1;
						} else {
							// ���� �Ʒ������� �������� ���� ����� ���ؼ��� x ��ǥ���� �þ�� y��ǥ���� �þ���Ѵ�.
							y = btn[k].getY() + 1;
							x = btn[k].getX() + 1;
						}
						
						//x = btn[k].getX() + 1;
						btn[k].setLocation(x, y); // ������ x, y ��ǥ�� ���� ��ǥ�� ����.
						
						try {
							Thread.sleep(1);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						} // �����̸� �־� �����̴� ���� ������ Ȯ�� �����ϵ���.
					}
				}
				break;
			} else if (key == 88) {
				// �������� �þ���� �ϱ� ���� �ڵ�
				int width = btn[3].getWidth();
				for(int j=0;j<1000;j++){
					if(j<500)
						width++; // ���� �ǹ��ϴ� ��ư�� �ʺ� ������Ŵ
					else
						width--; // ���� �ǹ��ϴ� ��ư�� �ʺ� ���ҽ�Ŵ
					btn[3].setSize(width,btn[3].getHeight()); // ������ ���� ���� ��ư�� ����.
					try {
						Thread.sleep(1);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				Color c = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
				btn[3].setBackground(c);
				// �θ� ������� ���ƿö����� ���� ������.
				break;
			}
		}
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
