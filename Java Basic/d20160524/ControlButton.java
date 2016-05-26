package d20160524;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
// Keyboard에 대한 Event를 인식하여 처리하기 위한 Listener로 KeyListener Interface를 사용하였다.
public class ControlButton extends Frame implements KeyListener{
	Button btn;
	
	ControlButton()
	{
		setBounds(0,0,1000,800); // Window Component의 위치 및 크기 설정
		setTitle("Control"); // Window Component의 타이틀 설정
		setLayout(null); // Layout을 Null 처리하여 사용자가 정의하여 사용할 수 있게 함.
		btn = new Button("^.^"); // Button의 내용
		btn.setBounds(216,415,100,100); // Button의 위치 및 크기 설정.
		btn.addKeyListener(this); // Button에 대한 키보드 조작을 인식하기 위한 KeyListener 설치
		add(btn); // Button Component를 Window Component에 넣기.

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // Window Component의 X버튼을 누를 경우에 종료 시키기 위한 WindowAdapter Class 사용.
			// WindowAdapter Class에는 Window Event 관련된 Method들이 오버라이드 되어 빈 Method로 구현되어있기 때문에 필요한 Method만 불러내어 사용하기 위해 이러한 방식을 이용.
		
		setVisible(true); // 완성된 Window Component 화면에 출력.
		
	}
	public static void main(String[] args) {
		new ControlButton();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// 키보드 버튼 중, 글자만 인식
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// 모든 키보드 버튼 인식
		int key = e.getKeyCode(); // 입력된 Keyboard가 무었인지 아스키 코드값으로 받아서 int Type 변수 key에 대입.

		// 현재 Button의 x,y 좌표를 각각 받아온다.
		int x = btn.getX();
		int y = btn.getY();
		
		if(key == 38) // up
			y -= 3; // y좌표를 감소 시켜서 위쪽 방향으로 올라가게 한다.
		else if(key == 40) // down
			y += 3; // y좌표를 증가 시켜서 아래쪽 방향으로 내려가게 한다.
		else if(key == 37) // left
			x -= 3; // x좌표를 감소 시켜 왼쪽으로 이동 시킨다.
		else if(key == 39) // right
			x += 3; // x좌표를 증가 시켜 오른쪽으로 이동 시킨다.
		else if(key == 32) // space bar
		{
			// JUMP!!!!
			for(int i=0;i<=50;i++) // 50만큼 상승 시킴
			{
				y-=1;
				btn.setLocation(x, y);
				try {
					Thread.sleep(5); // 그냥 상승 시키면 너무 빨라서 확인할 수 없으므로 약간의 딜레이를 주기 위해 sleep Method 사용.
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			for(int i=0;i<=50;i++) // 50만큼 하강 시킴.
			{
				y+=1;
				btn.setLocation(x, y);
				try {
					Thread.sleep(5);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
				
		}
		btn.setLocation(x, y); // 변화한 좌표로 이동.
	}
	@Override
	public void keyReleased(KeyEvent e){
		// 키보드 버튼 떼면 인식
	}
}
