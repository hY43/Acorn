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
		super("���� ����");
		setBounds(150, 150, 600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jta = new JTextArea();
		jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		// Frame���� �޸� JFrame�� Scroll�� ���� ������ �־� ������־�� �Ѵ�.
		// TextArea�� �Է��� ���� ��Ʈ ����.
		Font f = new Font("Gothic", Font.BOLD, 30);
		// ����� ��Ʈ ����.
		jta.setFont(f);
		
		// MenuBar Component �ʱ�ȭ
		jmb = new JMenuBar();
		
		// Menu Component �ʱ�ȭ
		jmeFile = new JMenu("File");
		jmeHelp = new JMenu("Help");

		// MenuItem Component �ʱ�ȭ.
		jmiNew = new JMenuItem("New");
		jmiOpen = new JMenuItem("Open");
		jmiSave = new JMenuItem("Save");
		jmiExit = new JMenuItem("Exit");
		jmiHelp = new JMenuItem("Help");

		add(jsp); // TextArea�� �ƴ϶� panel�� add�ϸ� ���� ����ȴ�.
		// MenuItem Component�� Menu component�� ����
		jmeFile.add(jmiNew);
		jmeFile.add(jmiOpen);
		jmeFile.add(jmiSave);
		jmeFile.addSeparator(); // MenuItem ���̿� ���м� �ֱ�
		jmeFile.add(jmiExit);
		
		jmeHelp.add(jmiHelp);
		
		// Menu Component�� MenuBar Component�� ����
		jmb.add(jmeFile);
		jmb.add(jmeHelp);

		// MenuBar Component�� Window Component�� ����.
		setJMenuBar(jmb);
		setVisible(true);

		// �� MenuItem�� ���� ActionListener �߰�.
		jmiNew.addActionListener(this);
		jmiOpen.addActionListener(this);
		jmiSave.addActionListener(this);
		jmiExit.addActionListener(this);
		jmiHelp.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); // ���� � MenuItem Component�� ���õǾ����� ����.
		
		if(obj == jmiExit){ // Exit �����ϴ� ���.
			System.exit(0); // ���α׷� ����.
		}else if (obj == jmiNew){ // New �����ϴ� ���.
			if(jta.getText().length() != 0)
			{
				int result = JOptionPane.showConfirmDialog(this, "�����Ͻðڽ��ϱ�?", "Ȯ��", JOptionPane.YES_NO_OPTION);
				// System.out.println(result);
				// Yes�� ������ 0��, No�� ������ 1�� ��ȯ�ȴ�. �迭�� ��������ִ�.
				if(result == 0)
				{
					// ����
					jta.getText();jta.setText(""); // TextArea Clear.
				}else{
					jta.getText();jta.setText(""); // TextArea Clear.
				}
			}			
		}else if(obj == jmiSave){ // Save �����ϴ� ���..
			JFileChooser jfc = new JFileChooser("c:\\");
			int value = jfc.showSaveDialog(this);
			// System.out.println("value: " + value);
			if(value == 0) // ���⸦ ���� ���.
			{
				File f = jfc.getSelectedFile();
				// System.out.println(f.getAbsolutePath()); // ������ ������ ��θ� ���.
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
				setTitle(fileName.substring(0,f.getName().indexOf(".")) + " - �޸���");
			}
		
		}else if(obj == jmiOpen){ // Open �����ϴ� ���.
			JFileChooser jfc = new JFileChooser("c:\\");
			int value = jfc.showOpenDialog(this);
			// System.out.println("value: " + value);
			if(value == 0) // ���⸦ ���� ���.
			{
				File f = jfc.getSelectedFile();
				FileReader fr = null;
				BufferedReader br = null;
				String data = null;
				StringBuffer sb = new StringBuffer();
				// System.out.println(f.getAbsolutePath()); // ������ ������ ��θ� ���.
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
				// setText Method�� String Type ������ �Ű� ������ �ޱ� ������ toString Method�� �̿��Ѵ�.
				jta.setText(sb.toString());
				
			}
		}else if(obj == jmiHelp){ // Help �����ϴ� ���.
			JOptionPane.showMessageDialog(this, "�� ���α׷��� ������ ���۱��� ������ �������� ������ �� ����� ���� ������ ���� ���� ���� ���ְ� ��������", "�޷�", JOptionPane.OK_OPTION);
		}
	}
	
	public static void main(String[] args) {
		new NewMemoJJang();
	}
}
