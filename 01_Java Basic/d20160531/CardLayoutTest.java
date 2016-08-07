package d20160531;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutTest extends Frame implements MouseListener{
	CardLayout layout;
	Panel p1, p2; // 다른 컨포넌트를 붙여서 사용하는 컨테이너.
	// Window Component에도 붙여서 사용할 수 있다.
	
	public CardLayoutTest()
	{
		setTitle("카드 레이아웃 테스트"); // Window Component의 Title 설정.
		// 레이아웃 변경
		layout = new CardLayout(); // Card Layout을 사용하기 위한 layout 객체 생성.
		setLayout(layout); // CardLayout 객체를 setLayout에 
		setBounds(50,50,500,400);
		// 컴포넌트 초기화
		p1 = new Panel();
		p2 = new Panel();
		
		p1.setBackground(Color.RED);
		p2.setBackground(Color.BLUE);
		
		add("redPanel", p1); // add([panelName], [참조변수])
		add("bluePanel", p2);
	
		layout.show(this, "redPanel");	
		
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		setVisible(true);
	}
	public static void main(String[] args) {
		new CardLayoutTest();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		Object obj = e.getSource();
		if(obj == p1)
		{
			layout.show(this, "bluePanel");	
		}else{
			layout.show(this, "redPanel");
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
