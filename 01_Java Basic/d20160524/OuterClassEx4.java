package d20160524;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class OuterClassEx4 extends Frame {
	public OuterClassEx4()
	{
		setBounds(100, 100, 800, 600);

		// 익명 클래스(Anonymous Class) : 일회용으로 사용할건데 굳이 이름 줄 필요 있나..
		/*
		WindowAdapter wa = new WindowAdapter() {
			// WindowAdapter Class를 상속받는 익명 클래스.
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		addWindowListener(wa);
		*/
		// 굳이 위와 같이 참조변수 wa를 생성할 필요 있나 그냥 아래와 같이 넣는다.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// 자주 사용하는 코드는 [우클릭]-[Add to Snippets] 기능을 이용해서 저장하면 편하다.
		
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		new OuterClassEx4();
	}
	
}
