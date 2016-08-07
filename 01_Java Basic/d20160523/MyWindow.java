package d20160523;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow extends Frame implements WindowListener{
	// Exit 버튼 사용을 위한 Class
	public MyWindow(){}
	public MyWindow(String title)
	{
		// String 매개변수 생성자 호출
		super(title);
		setBounds(50,50,800,600);
		setVisible(true);
		// Event Source: window 창
		// window의 동작을 감지하는 리스너
		this.addWindowListener(this); // 윈도우 화면에 대한 조작이기 때문에 WindowListener를 사용한다.
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("창이 처음 열렸을때 호출");
	}
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("종료 중일때 호출");
		System.exit(0); // 0: 정상 종료, 0이 아닌 다른 값: 비정상 종료
	}
	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("현재 창이 닫힌 후에 호출");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 버튼이 누르면 호출");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("창이 아이콘 상태에서 원래 크기로 돌아올 때 호출");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("창이 활성화 되었을때 호출");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("창이 비활성화 되었을때 호출");
		
	}
	public static void main(String[] args) {
		new MyWindow("종료창만들기");
	}
}
