package d20160523;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuGuWin extends Frame implements ActionListener{
	Button btn = new Button("출력");
	TextField tf = new TextField("",10);
	Label lb = new Label("단", Label.CENTER);
	
	public GuGuWin()
	{
		/* Component 초기화 */
		// Window Component 초기화.
		this.setTitle("구구단");
		this.setBounds(150,150,500,400);
		this.setLayout(null);
		//TableField Component 초기화.
		tf.setBounds(100,150,200,50);
		// Label Component 초기화.
		lb.setBounds(310,150,100,50);
		// Button Component 초기화.
		btn.setBounds(100,300,300,50);

		/* Listener 추가 */
		btn.addActionListener(this);
		
		/* Component 결합 */
		add(btn);
		add(lb);
		add(tf);

		/* 완성된 Component 보이도록 설정 변경 */
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		// 간단한 테스트이므로 클래스에 바로 Main Method 추가하여 테스트.
		new GuGuWin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Text Field에 입력된 Text를 int Type으로 변경하여 int Type 변수 dan에 대입.
		int dan = Integer.parseInt(tf.getText()); // getText Method를 이용하여 tf TextField 객체의 내용을 받아온 후,
												  // Integer.parseInt Method를 이용하여 String Type을 int Type로 변경.
		
		for(int i=1;i<10;i++) // 구구단 출력
			System.out.println(dan + " * " + i + " = " + (dan*i));
		
		tf.setText(""); // TextField Clear
		//System.exit(0);
	}
}


