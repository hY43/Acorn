package d20160520;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class MyWin3 extends Frame {
	Button btn1;
	Button btn2;
	Button btn3;
	Button btn4;
	Button btn5;
	
	public MyWin3()
	{
		// 창의 크기 너비 400, 높이 400
		setSize(400,400);
		// 위치 450, 400
		setLocation(450,400);
		// 제목 버튼 배치
		setTitle("버튼 배치");
		// 컴포넌트 초기화
		//btn1.setSize(300,300); // btn1 을 초기화 하지 않았기 때문에 null 이 들어있다.
		btn1 = new Button("동");
		btn2 = new Button("서");
		btn3 = new Button("남");
		btn4 = new Button("북");
		btn5 = new Button("중앙");

		//FlowLayout fl = new FlowLayout(); // FlowLayout을 사용하기 위한 객체 생성
		//setLayout(fl); // FlowLayout을 적용하기 위해 setLayout Method로 사용
		add(btn1,"East"); // add([Button 객체], [Button 위치(첫글자는 대문자)]);
		add(btn2,"West");
		add(btn3,"South");
		add(btn4,"North");
		add(btn5,"Center");
		// 컴포넌트를 배치하기 쉽게 하기 위해 배치 관리자를 사용한다.
		// Frame의 기본 배치 관리자: 보더 레이아웃
		
		// 창이 보이게 설정
		setVisible(true);
	}
	public static void main(String[] args)
	{
		MyWin3 mw1 = new MyWin3();
	}
}
