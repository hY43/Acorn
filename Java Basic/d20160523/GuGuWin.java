package d20160523;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuGuWin extends Frame implements ActionListener{
	Button btn = new Button("���");
	TextField tf = new TextField("",10);
	Label lb = new Label("��", Label.CENTER);
	
	public GuGuWin()
	{
		/* Component �ʱ�ȭ */
		// Window Component �ʱ�ȭ.
		this.setTitle("������");
		this.setBounds(150,150,500,400);
		this.setLayout(null);
		//TableField Component �ʱ�ȭ.
		tf.setBounds(100,150,200,50);
		// Label Component �ʱ�ȭ.
		lb.setBounds(310,150,100,50);
		// Button Component �ʱ�ȭ.
		btn.setBounds(100,300,300,50);

		/* Listener �߰� */
		btn.addActionListener(this);
		
		/* Component ���� */
		add(btn);
		add(lb);
		add(tf);

		/* �ϼ��� Component ���̵��� ���� ���� */
		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		// ������ �׽�Ʈ�̹Ƿ� Ŭ������ �ٷ� Main Method �߰��Ͽ� �׽�Ʈ.
		new GuGuWin();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Text Field�� �Էµ� Text�� int Type���� �����Ͽ� int Type ���� dan�� ����.
		int dan = Integer.parseInt(tf.getText()); // getText Method�� �̿��Ͽ� tf TextField ��ü�� ������ �޾ƿ� ��,
												  // Integer.parseInt Method�� �̿��Ͽ� String Type�� int Type�� ����.
		
		for(int i=1;i<10;i++) // ������ ���
			System.out.println(dan + " * " + i + " = " + (dan*i));
		
		tf.setText(""); // TextField Clear
		//System.exit(0);
	}
}


