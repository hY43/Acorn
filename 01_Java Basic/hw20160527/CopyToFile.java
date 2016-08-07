package h20160527;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CopyToFile extends JFrame implements ActionListener{
	/* Member Method */
	JButton srcBtn;
	JButton desBtn;
	JButton copyBtn;
	JButton exitBtn;
	JTextField srcText;
	JTextField desText;
	
	/* Constructor */
	CopyToFile()
	{
		setTitle("파일 복사기");
		setLayout(null);
		setBounds(100,100,450,200);
		
		srcBtn = new JButton("Source");
		desBtn = new JButton("Destination");
		copyBtn = new JButton("Copy");
		exitBtn = new JButton("Exit");
		srcText = new JTextField();
		desText = new JTextField();
		
		srcBtn.setBounds(50,30,100,20);
		desBtn.setBounds(50,30+40,100,20);
		srcText.setBounds(50+100+10, 30, 200, 20);
		desText.setBounds(50+100+10, 30+40, 200, 20);
		copyBtn.setBounds(50,50+40+30,150,20);
		exitBtn.setBounds(210,50+40+30,150,20);
		
		add(srcBtn);
		add(desBtn);
		add(srcText);
		add(desText);
		add(copyBtn);
		add(exitBtn);
		
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		srcBtn.addActionListener(this);
		desBtn.addActionListener(this);
		copyBtn.addActionListener(this);
		exitBtn.addActionListener(this);
		srcText.addActionListener(this);
		desText.addActionListener(this);
	}
	
	/* Member Method */
	@Override
	public void actionPerformed(ActionEvent e){
		Object obj = e.getSource();
		
		if(obj == exitBtn)
		{
			System.exit(0);
		}else if(obj == srcBtn){
			JFileChooser jfc = new JFileChooser("c:\\");
			int value = jfc.showOpenDialog(this);
			if(value==0)
			{
				File f = jfc.getSelectedFile();
				srcText.setText(f.getAbsolutePath());
			}
		}else if(obj == desBtn){
			JFileChooser jfc = new JFileChooser("c:\\");
			int value = jfc.showSaveDialog(this);
			if(value == 0)
			{
				File f = jfc.getSelectedFile();
				desText.setText(f.getAbsolutePath());
			}
		}else if(obj == copyBtn){
			File src = new File(srcText.getText());
			File des = new File(desText.getText());
			
			try {
				copy(src,des);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			srcText.getText();srcText.setText("");
			desText.getText();desText.setText("");
			
			JOptionPane.showMessageDialog(this, "복사 완료!!", "복사 완료", JOptionPane.OK_OPTION);
		}
	}
	
	public void copy(File src, File des) throws IOException
	{
		FileInputStream srcStream = new FileInputStream(src);
		FileOutputStream desStream = new FileOutputStream(des);

		int value = 0;
		while((value = srcStream.read())!=-1)
		{
			desStream.write(value);
		}
	}
	
	public static void main(String[] args) {
		new CopyToFile();
	}
}
