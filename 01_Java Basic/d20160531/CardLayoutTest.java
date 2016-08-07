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
	Panel p1, p2; // �ٸ� ������Ʈ�� �ٿ��� ����ϴ� �����̳�.
	// Window Component���� �ٿ��� ����� �� �ִ�.
	
	public CardLayoutTest()
	{
		setTitle("ī�� ���̾ƿ� �׽�Ʈ"); // Window Component�� Title ����.
		// ���̾ƿ� ����
		layout = new CardLayout(); // Card Layout�� ����ϱ� ���� layout ��ü ����.
		setLayout(layout); // CardLayout ��ü�� setLayout�� 
		setBounds(50,50,500,400);
		// ������Ʈ �ʱ�ȭ
		p1 = new Panel();
		p2 = new Panel();
		
		p1.setBackground(Color.RED);
		p2.setBackground(Color.BLUE);
		
		add("redPanel", p1); // add([panelName], [��������])
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
