package d20160524;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Robot3 extends Frame implements KeyListener{
	Button[] btn = new Button[12];
	Button wall = new Button();
	Button[] sWall = new Button[4];
	
	Robot3()
	{
		setBounds(0,0,1000,800);
		setLayout(null);
		btn[0] = new Button("^.^"); // 머리
		btn[0].setBounds(200, 200, 50, 30);
		btn[1] = new Button(); // 몸통
		btn[1].setBounds(200, 235, 50, 60);
		btn[2] = new Button(); // 왼팔
		btn[2].setBounds(145, 235, 50, 20);
		btn[3] = new Button(); // 오른팔
		btn[3].setBounds(255, 235, 50, 20);
		btn[4] = new Button(); // 왼다리
		btn[4].setBounds(200, 300, 20, 60);
		btn[5] = new Button(); // 오른다리
		btn[5].setBounds(230, 300, 20, 60);	
		btn[6] = new Button();
		btn[6].setBounds(295, 220, 10, 15);
		Color c = new Color(0,0,0);
		btn[6].setBackground(c);
		btn[7] = new Button();
		btn[7].setBounds(145, 170, 200, 50);
		btn[7].setBackground(c);
		btn[8] = new Button();
		btn[8].setBounds(145, 220, 10, 15);
		btn[8].setBackground(c);
		btn[9] = new Button();
		btn[9].setBounds(145, 220, 10, 15);
		btn[9].setBackground(c);
		btn[10] = new Button();
		btn[10].setBounds(345, 165, 20, 60);
		btn[10].setBackground(c);
		btn[11] = new Button();
		btn[11].setBounds(195, 170, 50, 50);
		
		wall.setBounds(745,115,150,200);
		sWall[0] = new Button();
		sWall[1] = new Button();
		sWall[2] = new Button();
		sWall[3] = new Button();
		
		sWall[0].setBounds(745, 115, 75, 100);
		sWall[1].setBounds(745, 215, 75, 100);
		sWall[2].setBounds(820, 115, 75, 100);
		sWall[3].setBounds(820, 215, 75, 100);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		for(int i=0;i<btn.length;i++) // 방향키를 누르면 로봇 버튼 전체가 움직이도록 한꺼번에 
		{
			btn[i].addKeyListener(this);
			add(btn[i]);
		}
		add(wall);
		for(int i=0;i<sWall.length;i++)
			add(sWall[i]);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Robot3();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int key = e.getKeyCode();
		System.out.println(key);
		for (int i = 0; i < btn.length; i++) {
			int x = btn[i].getX();
			int y = btn[i].getY();
			System.out.println(key);
						
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
						int val;

						if (j <= 50) {
							y = btn[k].getY() - 1;
							x = btn[k].getX() + 1;
						} else {
							y = btn[k].getY() + 1;
							x = btn[k].getX() + 1;
						}
						x = btn[k].getX() + 1;
						btn[k].setLocation(x, y);
						
						try {
							Thread.sleep(1);
						} catch (InterruptedException e1) {
							e1.printStackTrace();
						}
					}
				}
				break;
			} else if (key == 88) {
				int width = btn[3].getWidth();
				for(int j=0;j<1000;j++){
					if(j<500)
						width++;
					else
						width--;
					btn[3].setSize(width,btn[3].getHeight());
					try {
						Thread.sleep(1);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				}
				Color c = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
				btn[3].setBackground(c);
				break;
			}else if (key == 82)
			{
				Button bullet = new Button();
				bullet.setBounds(btn[7].getX()+30,btn[7].getY(),50,50);
				add(bullet);
				int bx = bullet.getX();
							
				for(int l=0;l<sWall.length;l++)
				add(sWall[l]);
				
				for(int t=0;bx<1000;t++)
				{
					bx += 1;
					bullet.setLocation(bx, bullet.getY());
					Color c = new Color(180,205,230);
					bullet.setBackground(Color.red);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}	
					if(bx >= 745)
					{
						remove(wall);
						int sX = sWall[0].getX()-1;
						int sY = sWall[0].getY()-1;
						sWall[0].setLocation(sX,sY);
						
						sX = sWall[1].getX()-1;
						sY = sWall[1].getY()+1;
						sWall[1].setLocation(sX,sY);
						
						sX = sWall[2].getX()+1;
						sY = sWall[2].getY()-1;
						sWall[2].setLocation(sX,sY);
						
						sX = sWall[3].getX()+1;
						sY = sWall[3].getY()+1;
						sWall[3].setLocation(sX,sY);
					}
				}
				remove(sWall[1]);
				break;
			}
			else if(key == 65)
			{
				wall.setBounds(745,115,150,200);
				sWall[0] = new Button();
				sWall[1] = new Button();
				sWall[2] = new Button();
				sWall[3] = new Button();
				
				sWall[0].setBounds(745, 115, 75, 100);
				sWall[1].setBounds(745, 215, 75, 100);
				sWall[2].setBounds(820, 115, 75, 100);
				sWall[3].setBounds(820, 215, 75, 100);
				add(wall);
			}
		}
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
