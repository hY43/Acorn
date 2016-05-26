package d20160524;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MeMoJJang extends Frame implements ActionListener{
	TextArea ta; // TextField�� ���� �Է��̱� ������ �������� �Է� ������ TextArea�� ����Ѵ�.
	// MenuBar - Menu - MenuItem ������ ������ �ű��.
	MenuBar mb;
	Menu muFile;
	Menu muHelp;
	MenuItem miNew;
	MenuItem miOpen;
	MenuItem miSave;
	MenuItem miExit;
	MenuItem miHelp;
	
	public MeMoJJang() {
		setTitle("�޸���"); // xkdlxmf tjfwjd.
		setBounds(100,100,800,600);
		
		// File�̶�� Menu�� �� MenuItem(New, Open, Save, Exit) �ʱ�ȭ
		miNew = new MenuItem("���θ����");
		miOpen = new MenuItem("����");
		miSave = new MenuItem("����");
		miExit = new MenuItem("����");
		
		// Help��� Menu�� �� MenuItem(Help) �ʱ�ȭ
		miHelp = new MenuItem("���򸻺���");
		
		// Menu �ʱ�ȭ
		muFile = new Menu("����(F)");
		muHelp = new Menu("����");
		
		// Menu�� ���� MenuBar �ʱ�ȭ
		mb = new MenuBar();
		
		// Text�� �Է��� text Area �ʱ�ȭ.
		ta = new TextArea();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // Window â ���Ḧ ���� WindowAdapter Class ���.
		
		// MenuBar, Menu, MenuItem �Է�
		// Menu�� file�� MenuItem �ֱ�
		muFile.add(miNew);
		muFile.add(miOpen);
		muFile.add(miSave);
		muFile.addSeparator();
		muFile.add(miExit);
		
		// Menu �� Help�� MenuItem �ֱ�
		muHelp.add(miHelp);
		
		// MenuBar�� Menu �ֱ�
		mb.add(muFile);
		mb.add(muHelp);
		
		// MenuBar�� �ٸ� �͵���� �޸� setMenuBar��� ���� ����Ѵ�.
		setMenuBar(mb);
		
		// ������ MenuItem�� ���� Event�� ��ٸ� ActionListener ��ġ
		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miExit.addActionListener(this);
		miHelp.addActionListener(this);
		
		// Text Area ��ġ.
		add(ta);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MeMoJJang();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		 // ���� Object, �� Menu Item�� �������� �Ǵ��ϱ� ���� getSource�� ���ǹ�.
		if(obj == miExit)
		{
			System.out.println("�����մϴ�.");
			System.exit(0);
		}
		else if(obj == miNew)
		{
			ta.getText();ta.setText("");
		}
	}
}
