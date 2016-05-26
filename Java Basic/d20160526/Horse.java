package d20160526;

import javax.swing.JButton;

public class Horse extends Thread{
	JButton jbtn;
	static int uId=1;
	int hId;
	boolean flag = false;
	public Horse(JButton jbtn)
	{
		this.jbtn = jbtn;
		hId = uId++;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++){
			int x = jbtn.getX();
			int y = jbtn.getY();
			x += (int)(Math.random()*20);
			
			if(x > 800)
			{
				x = 800;
				if(flag == false)
				{
					System.out.println(hId + "¹ø ¸» µµÂø!");
					flag = true;
				}
			}
			jbtn.setLocation(x,y);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
