package d20160520;

import java.awt.Button; // Button Class 사용을 위한 API Import
import java.awt.Frame; // Frame Class 사용을 위한 API Import
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin2_ImpAction extends Frame implements ActionListener {
	/* Member Variable */
	Button btn;

	/* Constructor */
	MyWin2_ImpAction()
	{
		super("윈도우2"); // title "윈도우2" 지정.
		// 컴포넌트 초기화
		btn = new Button("날 클릭해봐!!"); // 버튼을 만듬. 이대로 눈으로 볼 수 없고 컨테이너에 담아야한다. 
		
		setSize(500,300); // 너비 500 높이 500의 크기로 지정.
		setLocation(400,200); // 출력 위치를 x좌표 400 y좌표 200으로 지정.
		// * Event 처리
		// 1) event source 결정: btn
		// 2) Listener 부착.
		// Handler는 ActionListener 인터페이스를 구현한 클래스.

		btn.addActionListener(this); // Event Source인 버튼에 ActionListener 추가.
		
		add(btn); // Window 컴포넌트에 btn 컨포넌트를 담는다.
		setVisible(true); // Window 창 보이도록 변경.(다 완성된 창을 한번에 보여주기 위해 일반적으로 setVisible을 가장 마지막에 둔다.)
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		// 직접 ActionListener 구현.
		for(int i=1;i<=9;i++) // 콘솔창에 3단 출력.
		{
			System.out.println("3 * " + i + " = " + (3*i));
		}
		System.out.println("종료합니다.");
		System.exit(0); // 3단 출력 후 프로그램 종료
	}
	
	public static void main(String[] args)
	{
		new MyWin2_ImpAction();
	}
}
