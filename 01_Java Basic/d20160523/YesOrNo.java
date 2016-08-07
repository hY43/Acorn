package d20160523;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class YesOrNo extends Frame implements WindowListener, MouseMotionListener{
	Button btnY;
	Button btnN;
	Label lb;
	public YesOrNo()
	{
		setLayout(null);
		setBounds(50,50,800,600);
		setTitle("Yes Or No");
		
		lb = new Label("Hello", Label.CENTER); // Hello 문자열이 적힌 Label을 생성하되, 문자열을 가운데 정렬한다.
		Color c = new Color(231,54,65);
		lb.setBackground(c);
		btnY = new Button("Yes"); // Yes 문자열이 든 버튼을 생성.
		btnN = new Button("No"); // No 문자열이 든 버튼을 생성.
		
		lb.setBounds(180, 180, 400, 100);
		btnY.setBounds(180, 440, 200, 100);
		btnN.setBounds(400, 440, 200, 100);
		add(btnY);
		add(btnN);
		add(lb);
		setVisible(true);
		
		this.addWindowListener(this); // Window Component 내에 움직임을 확인하는 리스너를 추가.
		this.addMouseMotionListener(this); // 마우스의 움직임을 확인하는 리스너 추가.
		
	}
	public static void main(String[] args){
		new YesOrNo();
	}
	
	@Override
	public void windowOpened(WindowEvent e){}
	@Override
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e){}
	@Override
	public void windowIconified(WindowEvent e){}
	@Override
	public void windowDeiconified(WindowEvent e){}
	@Override
	public void windowActivated(WindowEvent e){}
	@Override
	public void windowDeactivated(WindowEvent e){}
	
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseMoved(MouseEvent e) {
		// Yes 버튼의 중앙좌표
		int bx = btnY.getX() + 90;
		int by = btnY.getX() + 220;
		// 현재 마우스의 좌료
		int x = e.getX();
		int y = e.getY();
		// 피타고라스정리: c^2 = a^2 + b^2
		int dis = (int)(Math.sqrt((x-bx)*(x-bx) + (by-y)*(by-y)));
		if(dis < 70)
		{
			int rndX = (int)(Math.random()*650);
			int rndY = (int)(Math.random()*550);
			btnY.setLocation(rndX, rndY);
		}
		

		
	}
}
