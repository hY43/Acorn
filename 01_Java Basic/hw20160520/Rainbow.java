package hw20160520;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rainbow extends Frame implements ActionListener{
	Button btn = new Button();
	
	Rainbow()
	{
		// Window Component 초기화.
		setTitle("Rainbow");
		setBounds(300,300,300,300);
		// Layout 제거
		setLayout(null);
		// Button Component 초기화.
		btn = new Button("Click");
		btn.setBounds(0,150,300,150);
		// Window Component에 Button Component 넣기.
		add(btn);
		// 완성된 Component 보이도록 true 설정으로 변경.
		setVisible(true);
		// Event 발생시 실행시킬 동작 수행.
		btn.addActionListener(this);
		// Listener
		
		// Handler
		
	}
	
	@Override
	public void actionPerformed(ActionEvent ed) {
		// 7 가지 색상이 들어있는 Color 타입의 배열 c 선언 및 초기화.
		Color[] c = {Color.red, Color.yellow, Color.green, Color.blue, Color.magenta, Color.pink, Color.ORANGE};

		
		for(int i=0;i<7;i++)
		{
			this.setBackground(c[i]); // i번째 요소에 들어있는 색상으로 배경색 변경.
			// 0.1 초간 대기시키기 위한 try~catch 문.
			try {
				Thread.sleep(100); // 0.1초간 대기.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		new Rainbow(); 
	}
}
