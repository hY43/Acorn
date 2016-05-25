package hw20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
// 1부터 50까지 버튼 50개를 생성해서 화면에 배치해보세요(FlowLayout)

public class Hw01 extends Frame{
	/* Member Variable */
	Button[] btn;
	
	/* Constructor */
	Hw01()
	{
		// setSize(500,300); // 너비 500, 높이 300
		// setLocation(350,400); // x 350 y 400
		setBounds(350,400,500,300);
		setTitle("버튼 50개 생성"); // Title "버튼 50개 생성"
		
		// 배치 관리자를 FlowLayout으로 변경
		FlowLayout fl = new FlowLayout(); 
		setLayout(fl); // FlowLayout 설정
		
		btn = new Button[50]; // Button 객체 50개를 넣을 배열 생성
		for(int i=0;i<btn.length;i++)
		{
			btn[i] = new Button("" + (i+1)); // 실제 Button 객체 생성
			add(btn[i]); // 생성된 Button을 추가
		}
		setVisible(true); // 윈도우가 보이도록 값 전환
	}
	
	/* Member Method */
	public static void main(String[] args)
	{
		Hw01 h1 = new Hw01();
	}
}

