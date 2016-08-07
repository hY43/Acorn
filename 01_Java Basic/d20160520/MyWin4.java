package d20160520;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWin4 extends Frame implements ActionListener{
	/* Member Variable */
	Button rBtn;
	Button bBtn;

	/* Constructor */
	MyWin4()
	{
		// Window Component 초기화
		setBounds(300,300,300,300);
		setTitle("MyWin4");
		// Layout 제거.(Frame 배치 관리자: BorderLayout)

		setLayout(null); // 배치 관리자 안써 -> 각 컴포넌트의 크기와 위치를 지정해야 사용 가능.
		
		// Button Component 초기화.
		rBtn = new Button("Red"); // "Red" 문자열이 입력된 버튼 객체 생성.
		bBtn = new Button("Blue"); // "Blue" 문자열이 입력된 버튼 객체 생성.
		
		// Button Component 위치 및 크기 설정.
		// 배치 관리자를 안쓰기 때문에 컴포넌트의 크기와 위치를 설정한다.
		rBtn.setBounds(0,150,150,150);
		bBtn.setBounds(150,150,150,150);
		// 이벤트 소스: red Button
		// addActionListener의 매개변수는 ActionListener Type 변수이어야 하는데 ActionListener에서 구현해야 하는 Method는
		// actionPerformed 한개 이므로 새롭게 Handler Class를 생성하는 것이 아니라, ActionListener Interface를 implements keyword로
		// 받은 후, 직접 actionPerformed Method를 구현하였다.
		// 그후 자기 자신을 의미하는 this keyword를 이용하면 별도의 Handler 변수를 사용할 필요 없이 addActionListener Method를 실행하게 되는데
		// addActionListener Method에서는,,,,,,,무슨 일이 일어나지??? -> 받은 인자 값으로 actionPerformed Method를 실행하는 것은 아닐까??
		
		// Event 처리.
		rBtn.addActionListener(this); // rBtn Button 객체가 눌렸을 때의 Event 처리.
		bBtn.addActionListener(this); // bBtn Button 객체가 눌렸을 때의 Event 처리.
		
		// 완성된 Button component들을 Window Conponent에 입력.
		add(rBtn);
		add(bBtn);
		// 완성된 Window Component를 보이도록 Visible 설정을 true로 변경.
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//String color = e.getActionCommand();
		// getActionCommand를 통해 입력 받는 것은...만약 좀 어려운 Command라면 값 자체를 인식 못할 수도 있기 때문에 
		// Object 객체를 반환하는 getSource Method를 사용한다.
		Object obj = e.getSource();
		if(obj == rBtn) // 받은 객체가 rBtn이라면 배경색을 빨강색으로 변경해라.
			this.setBackground(Color.red);
		else if(obj == bBtn) // 받은 객체가 bBtn이라면 배경색을 파랑색으로 변경해라.
			this.setBackground(Color.blue);
		
		//Color c = new Color(100,200,150);
		//this.setBackground(c);
	}
	public static void main(String[] args)
	{
		// 굳이 Stack 영역에 참조 변수를 할당해서 공간 낭비하지 않도록 Heap에 객체만 생성.
		new MyWin4();
	}
}
