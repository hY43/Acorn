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
		btn[0] = new Button("^.^"); // 머리
		btn[0].setBounds(400, 200, 50, 30);
		btn[1] = new Button(); // 몸통
		btn[1].setBounds(400, 235, 50, 60);
		btn[2] = new Button(); // 왼팔
		btn[2].setBounds(345, 235, 50, 20);
		btn[3] = new Button(); // 오른팔
		btn[3].setBounds(455, 235, 50, 20);
		btn[4] = new Button(); // 왼다리
		btn[4].setBounds(400, 300, 20, 60);
		btn[5] = new Button(); // 오른다리
		btn[5].setBounds(430, 300, 20, 60);	
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // Window Component 종료를 위한 WindowAdapter 사용.
		
		for(int i=0;i<btn.length;i++) // 방향키를 누르면 로봇 버튼 전체가 움직이도록 한꺼번에 
		{
			btn[i].addKeyListener(this); // 각각의 방향키에 대한 리스너 설치.
			add(btn[i]); // 각 버튼를  Window Component에 설치.
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
		int key = e.getKeyCode(); // 키보드 입력 값 확인을 위해 keyCode를 받아 int Type 변수 key에 저장.
		for (int i = 0; i < btn.length; i++) {
			// 좌표 수정을 위해 현재 버튼의 x,y 좌표를 받아서 int type 변수 x와 y에 저장한다.
			int x = btn[i].getX();
			int y = btn[i].getY();
			System.out.println(key); // 방향키에 대한 아스키 코드값 확인을 위해 key 값을 출력한다.
						
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
						// 앞으로 JUMP!!
						int val;

						if (j <= 50) {
							// 앞의 위쪽으로 올라가는 것을 만들기 위해서는 x좌표값은 늘어나고 y좌표값은 줄어들어야한다. 
							y = btn[k].getY() - 1;
							x = btn[k].getX() + 1;
						} else {
							// 앞의 아래쪽으로 내려가는 것을 만들기 위해서는 x 좌표값은 늘어나고 y좌표값은 늘어나야한다.
							y = btn[k].getY() + 1;
							x = btn[k].getX() + 1;
						}
						
						//x = btn[k].getX() + 1;
						btn[k].setLocation(x, y); // 변경한 x, y 좌표를 실제 좌표에 적용.
						
						try {
							Thread.sleep(1);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						} // 딜레이를 주어 움직이는 것을 눈으로 확인 가능하도록.
					}
				}
				break;
			} else if (key == 88) {
				// 오른팔이 늘어나도록 하기 위한 코드
				int width = btn[3].getWidth();
				for(int j=0;j<1000;j++){
					if(j<500)
						width++; // 팔을 의미하는 버튼의 너비를 증가시킴
					else
						width--; // 팔을 의미하는 버튼의 너비를 감소시킴
					btn[3].setSize(width,btn[3].getHeight()); // 증가된 값을 실제 버튼에 증가.
					try {
						Thread.sleep(1);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				Color c = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
				btn[3].setBackground(c);
				// 팡리 원래대로 돌아올때마다 색을 변경함.
				break;
			}
		}
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
