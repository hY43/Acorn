package d20160520;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// 내가 하고자 하는 작업
		System.out.println("날 왜 클릭해 버럭@@");
		System.out.println("종료합니다.");
		System.exit(0);
		// 0: 정상 종료, 다른 값: 비정상 종료
	}
}
