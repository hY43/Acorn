package d20160530;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NewMemoJJang extends JFrame implements ActionListener {
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu jmeFile;
	JMenu jmeHelp;
	JMenuItem jmiNew;
	JMenuItem jmiOpen;
	JMenuItem jmiSave;
	JMenuItem jmiExit;
	JMenuItem jmiHelp;

	public NewMemoJJang() {
		super("제목 없음");
		setBounds(150, 150, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jta = new JTextArea();
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// Frame과는 달리 JFrame은 Scroll을 따로 설정을 넣어 만들어주어야 한다.
		// TextArea에 입력할 글자 폰트 설정.
		Font f = new Font("Gothic", Font.BOLD, 30);
		// 변경된 폰트 적용.
		jta.setFont(f);
		
		// MenuBar Component 초기화
		jmb = new JMenuBar();
		
		// Menu Component 초기화
		jmeFile = new JMenu("File");
		jmeHelp = new JMenu("Help");

		// MenuItem Component 초기화.
		jmiNew = new JMenuItem("New");
		jmiOpen = new JMenuItem("Open");
		jmiSave = new JMenuItem("Save");
		jmiExit = new JMenuItem("Exit");
		jmiHelp = new JMenuItem("Help");

		add(jsp); // TextArea가 아니라 panel만 add하면 전부 적용된다.
		// MenuItem Component를 Menu component에 적용
		jmeFile.add(jmiNew);
		jmeFile.add(jmiOpen);
		jmeFile.add(jmiSave);
		jmeFile.addSeparator(); // MenuItem 사이에 구분선 넣기
		jmeFile.add(jmiExit);
		
		jmeHelp.add(jmiHelp);
		
		// Menu Component를 MenuBar Component에 적용
		jmb.add(jmeFile);
		jmb.add(jmeHelp);

		// MenuBar Component를 Window Component에 적용.
		setJMenuBar(jmb);
		setVisible(true);

		// 각 MenuItem에 대한 ActionListener 추가.
		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiHelp.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); // 현재 어떤 MenuItem Component가 선택되었는지 저장.
		
		if(obj == jmiExit){ // Exit 선택하는 경우.
			System.exit(0); // 프로그램 종료.
		}else if (obj == jmiNew){ // New 선택하는 경우.
			if(jta.getText().length() != 0)
			{
				int result = JOptionPane.showConfirmDialog(this, "저장하시겠습니까?", "확인", JOptionPane.YES_NO_OPTION);
				// System.out.println(result);
				// Yes를 누르면 0이, No를 누르면 1이 반환된다. 배열로 만들어져있다.
				if(result == 0)
				{
					// 저장
					jta.getText();jta.setText(""); // TextArea Clear.
				}else{
					jta.getText();jta.setText(""); // TextArea Clear.
				}
			}			
		}else if(obj == jmiSave){ // Save 선택하는 경우..
			JFileChooser jfc = new JFileChooser("c:\\");
			int value = jfc.showSaveDialog(this);
			// System.out.println("value: " + value);
			if(value == 0) // 열기를 누른 경우.
			{
				File f = jfc.getSelectedFile();
				// System.out.println(f.getAbsolutePath()); // 선택한 파일의 경로를 출력.
				/*FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				byte[] b = jta.getText().getBytes();
				try {
					fos = new FileOutputStream(f);
					bos = new BufferedOutputStream(fos);
					bos.write(b);
					bos.flush();
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException ie){
					ie.printStackTrace();
				}*/
				
				try {
					FileWriter fw = new FileWriter(f);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(jta.getText());
					bw.flush();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				String fileName = f.getName();
				setTitle(fileName.substring(0,f.getName().indexOf(".")) + " - 메모장");
			}
		
		}else if(obj == jmiOpen){ // Open 선택하는 경우.
			JFileChooser jfc = new JFileChooser("c:\\");
			int value = jfc.showOpenDialog(this);
			// System.out.println("value: " + value);
			if(value == 0) // 열기를 누른 경우.
			{
				File f = jfc.getSelectedFile();
				FileReader fr = null;
				BufferedReader br = null;
				String data = null;
				StringBuffer sb = new StringBuffer();
				// System.out.println(f.getAbsolutePath()); // 선택한 파일의 경로를 출력.
				try {
					fr = new FileReader(f);
					br = new BufferedReader(fr);
								
					while((data = br.readLine()) != null)
					{
						sb.append(data + "\n");
					}
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException ie)
				{
					ie.printStackTrace();
				}
				// setText Method는 String Type 변수를 매개 변수로 받기 때문에 toString Method를 이용한다.
				jta.setText(sb.toString());
				
			}
		}else if(obj == jmiHelp){ // Help 선택하는 경우.
			JOptionPane.showMessageDialog(this, "이 프로그램은 나만의 저작권이 있으니 무단으로 복제할 시 형사상 전혀 문제가 없고 단지 나의 저주가 있으리라", "메롱", JOptionPane.OK_OPTION);
		}
	}
	
	public static void main(String[] args) {
		new NewMemoJJang();
	}
}
