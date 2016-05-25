package d20160520;

import java.awt.Button;
import java.awt.Frame;

public class WinGGD extends Frame{
	Button btn; // Button Component의 Handler를 구성하기 위한 변수.
	public WinGGD()
	{
		super("구구단"); // Title "구구단"
		setLocation(300,300); // Window 출력위치 x좌표 300, y좌표 300
		setSize(300,300); // Window 크기 너비 300, 높이 300
		
		btn = new Button("3단출력"); // 버튼에 "3단출력" 문자열을 넣고 초기화
		Handler2 hd = new Handler2(); // button에 대한 Listener 생성
		btn.addActionListener(hd); // button에 대한 Handler를 사용하여 동작.
		add(btn); // Window 컴포넌트에 button Component를 넣는다.
		setVisible(true); // 완성된 Window를 한꺼번에 출력
	}
}

