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
	TextArea ta;
	MenuBar mb;
	Menu muFile;
	Menu muHelp;
	MenuItem miNew;
	MenuItem miOpen;
	MenuItem miSave;
	MenuItem miExit;
	MenuItem miHelp;
	
	public MeMoJJang() {
		setTitle("메모장");
		setBounds(100,100,800,600);
		
		miNew = new MenuItem("새로만들기");
		miOpen = new MenuItem("열기");
		miSave = new MenuItem("저장");
		miExit = new MenuItem("종료");
		miHelp = new MenuItem("도움말보기");
		
		muFile = new Menu("파일(F)");
		muHelp = new Menu("도움말");
		mb = new MenuBar();
		ta = new TextArea();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		muFile.add(miNew);
		muFile.add(miOpen);
		muFile.add(miSave);
		muFile.addSeparator();
		muFile.add(miExit);
		muHelp.add(miHelp);
		mb.add(muFile);
		mb.add(muHelp);
		setMenuBar(mb);
		
		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miExit.addActionListener(this);
		miHelp.addActionListener(this);
		add(ta);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MeMoJJang();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj == miExit)
		{
			System.out.println("종료합니다.");
			System.exit(0);
		}
		else if(obj == miNew)
		{
			ta.getText();ta.setText("");
		}
	}
}
