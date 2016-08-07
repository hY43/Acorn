package d20160520;

// Frame Class를 사용하는데 필요한 API import
import java.awt.Frame;

//자바언어에서 많이 사용되는 클래스는 java.lang package에 있는데 java.lang package에 포함되는 class는 apiimport를 생략할 수 있다.

public class MyWin extends Frame{
// Window 창을 만들기 위해 Frame Class를 상속 받아 사용하는 MyWin Class.
	
	/* Constructor */
	public MyWin()
	{
		super("내가 만든 윈도우"); // 부모 생성자 호출.
		// Window 창 보이도록 설정
		super.setVisible(true); // Frame의 부모 클래스인 Window Class에 있는 setVisible Method를 호출하여 Window 창이 눈에 보이도록 변경.
		// 창 크기 조절
		// 너비 400 높이 300
		super.setSize(400,300);
		// 창의 위치를 x 300 y 300으로 이동 시켜서 출력
		super.setLocation(300,300);
		// 타이틀 주기
		//super.setTitle("니렙에 잠이 오냐?");
	}
	
}
