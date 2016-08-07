package d20160526;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Cal extends Frame implements ActionListener
{
	Button bt[] = new Button[16];
	TextField cal;
	Label sign;
	int firstNumber, secondNumber;
	String oper;
	public Cal()
	{
		//Window layout
		setTitle("계산기");
		setLayout(null);
		setBounds(200,100,405,450);
		setBackground(Color.LIGHT_GRAY);
		
		//초기화
		//버튼
		for(int i=0; i<bt.length; i++)
		{
			bt[i] = new Button();
		}
		
		//라벨
		sign = new Label("By Hanney");
		
		//텍스트필드
		cal = new TextField();
		
		//값입력
		bt[0].setLabel("7");
		bt[1].setLabel("4");
		bt[2].setLabel("1");
		bt[3].setLabel("0");
		
		bt[4].setLabel("8");
		bt[5].setLabel("5");
		bt[6].setLabel("2");
		bt[7].setLabel("00");
		
		bt[8].setLabel("9");
		bt[9].setLabel("6");
		bt[10].setLabel("3");
		bt[11].setLabel("=");
		
		bt[12].setLabel("+");
		bt[13].setLabel("-");
		bt[14].setLabel("*");
		bt[15].setLabel("/");
		
		//button bounds
		cal.setBounds(25, 60, 355, 50);
		
		//label bounds
		sign.setBounds(325, 400, 75, 50);
		
		//text field bounds
		bt[0].setBounds(25, 150, 83, 60);
		bt[1].setBounds(25, 216, 83, 60);
		bt[2].setBounds(25, 216+66, 83, 60);
		bt[3].setBounds(25, 216+66+66, 83, 60);
		
		bt[4].setBounds(25+91, 150, 83, 60);
		bt[5].setBounds(25+91, 216, 83, 60);
		bt[6].setBounds(25+91, 216+66, 83, 60);
		bt[7].setBounds(25+91, 216+66+66, 83, 60);
		
		bt[8].setBounds(25+91+91, 150, 83, 60);
		bt[9].setBounds(25+91+91, 150+66, 83, 60);
		bt[10].setBounds(25+91+91, 150+66+66, 83, 60);
		bt[11].setBounds(25+91+91, 150+66+66+66, 83, 60);
		
		bt[12].setBounds(25+91+91+91, 150, 83, 60);
		bt[13].setBounds(25+91+91+91, 150+66, 83, 60);
		bt[14].setBounds(25+91+91+91, 150+66+66, 83, 60);
		bt[15].setBounds(25+91+91+91, 150+66+66+66, 83, 60);

		
		//add
		//버튼
		for(int i=0; i<bt.length; i++)
		{
			add(bt[i]);
		}
		//텍스트필드
		add(cal);
		
		// 초기화
		// 버튼
		for(int i=0;i<bt.length;i++)
			bt[i].addActionListener(this);
		
		//라벨
		add(sign);
		
		
		//윈도우창 종료
		addWindowListener(new WindowAdapter()
		{					
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			};
		});
		
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand(); // 해당 Source의 Label(내용)을 가져온다.
		Object obj = e.getSource();
		
		if(obj == bt[12]){ // + 
			// 지금까지 입력한 숫자가 계산을 위한 첫 번재 숫자.
			// trim(): String Class의 Member Method로 앞뒤에 공백이 있다면 공백을 제거해서 문자열을 반환.
			/* **
			firstNumber = Integer.parseInt(cal.getText().trim());
			cal.getText();cal.setText("");
			oper = cmd;
			//-> getFirstNumber() Method로 Refactoring
			** */
			getFirstNumber(cmd);
		}else if(obj == bt[13]){ // -
			getFirstNumber(cmd);
		}else if(obj == bt[14]){ // *
			getFirstNumber(cmd);
		}else if(obj == bt[15]){ // /
			getFirstNumber(cmd);
		}else if(obj == bt[11]){ // =
			secondNumber = Integer.parseInt(cal.getText().trim());
			
			int result = 0;
			if(oper.equals("+"))
				result = firstNumber + secondNumber;
			else if(oper.equals("-"))
				result = firstNumber - secondNumber;
			else if(oper.equals("*"))
				result = firstNumber * secondNumber;
			else if(oper.equals("/"))
				result = firstNumber / secondNumber;
			cal.setText("" + result);
		}else{
			String data = cal.getText()+cmd;
			cal.setText(data);
		}
	}

	private void getFirstNumber(String cmd) {
		// Refactoring Method
		firstNumber = Integer.parseInt(cal.getText().trim());
		cal.getText();cal.setText("");
		oper = cmd;
	}
	
	public static void main(String[] args) 
	{
		new Cal();
	}
}
