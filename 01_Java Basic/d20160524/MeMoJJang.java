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
	TextArea ta; // TextField는 한줄 입력이기 때문에 여러줄을 입력 가능한 TextArea를 사용한다.
	// MenuBar - Menu - MenuItem 순으로 단위를 매긴다.
	MenuBar mb;
	Menu muFile;
	Menu muHelp;
	MenuItem miNew;
	MenuItem miOpen;
	MenuItem miSave;
	MenuItem miExit;
	MenuItem miHelp;
	
	public MeMoJJang() {
		setTitle("메모장"); // xkdlxmf tjfwjd.
		setBounds(100,100,800,600);
		
		// File이라는 Menu에 들어갈 MenuItem(New, Open, Save, Exit) 초기화
		miNew = new MenuItem("새로만들기");
		miOpen = new MenuItem("열기");
		miSave = new MenuItem("저장");
		miExit = new MenuItem("종료");
		
		// Help라는 Menu에 들어갈 MenuItem(Help) 초기화
		miHelp = new MenuItem("도움말보기");
		
		// Menu 초기화
		muFile = new Menu("파일(F)");
		muHelp = new Menu("도움말");
		
		// Menu를 넣을 MenuBar 초기화
		mb = new MenuBar();
		
		// Text를 입력할 text Area 초기화.
		ta = new TextArea();
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}); // Window 창 종료를 위한 WindowAdapter Class 사용.
		
		// MenuBar, Menu, MenuItem 입력
		// Menu중 file에 MenuItem 넣기
		muFile.add(miNew);
		muFile.add(miOpen);
		muFile.add(miSave);
		muFile.addSeparator();
		muFile.add(miExit);
		
		// Menu 중 Help에 MenuItem 넣기
		muHelp.add(miHelp);
		
		// MenuBar에 Menu 넣기
		mb.add(muFile);
		mb.add(muHelp);
		
		// MenuBar는 다른 것들과는 달리 setMenuBar라는 것을 사용한다.
		setMenuBar(mb);
		
		// 각각의 MenuItem에 대한 Event를 기다릴 ActionListener 설치
		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miExit.addActionListener(this);
		miHelp.addActionListener(this);
		
		// Text Area 설치.
		add(ta);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MeMoJJang();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		 // 받은 Object, 즉 Menu Item이 무엇인지 판단하기 위한 getSource와 조건문.
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
