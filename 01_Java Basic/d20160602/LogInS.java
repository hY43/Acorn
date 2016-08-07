package d20160602;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LogInS extends JFrame implements ActionListener{

		JButton btnLogin;
		JButton btnReset;
		JTextField tfId;
		JTextField tfPw;
		JPasswordField pwf; // *ó���� ���� JPasswordField Class ���.
		JLabel lbId;
		JLabel lbPw;
		
		/* Variable for connection to database */
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
		String user = "scott";
		String password = "tiger";
		String sql = "";
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;		
		
		public LogInS()
		{
			/* Component �ʱ�ȭ */
			// Window Component
			setTitle("�α���"); // Window Component Title �� ����
			setLayout(null); // ��ġ ������ ��� X
			setBounds(500,300,500,300); // Window Component ��ġ �� ũ�� ����
			
			// Button Component
			btnLogin = new JButton("�α���");
			btnLogin.setBounds(150,200,80,50);
			Color c = new Color(180,205,230);
			btnLogin.setBackground(c);
			btnReset = new JButton("Reset");
			btnReset.setBounds(250,200,80,50);
			c = new Color(224,229,245);
			btnLogin.setBackground(c);
			
			// Label Component
			lbId = new JLabel("ID", JLabel.CENTER);
			lbId.setBounds(150,80, 20,20);
			lbPw = new JLabel("PW", JLabel.CENTER);
			lbPw.setBounds(150,120, 20,20);
			
			// TextField Component
			tfId = new JTextField();
			tfId.setBounds(180, 75, 150, 30);
			pwf = new JPasswordField();
			pwf.setBounds(180, 115, 150, 30);
						
			/* Component �߰� */
			add(pwf);
			add(tfId);
			add(lbId);
			add(lbPw);
			add(btnLogin);
			add(btnReset);
			setVisible(true);
			
			/* Listener �߰� �� ���� */
			btnLogin.addActionListener(this);
			btnReset.addActionListener(this);
			
			addWindowListener(new WindowAdapter() {
				@Override
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// ��ư�� ���� �� �񱳸� ���� getSource Method
			if(e.getSource() == btnLogin) // �α��� ��ư�� ������ ���.
			{
				String id = tfId.getText();
				String pw = String.valueOf(pwf.getPassword());
				
				try {
					Class.forName(driver);
					conn = DriverManager.getConnection(url, user, password);
					sql = "SELECT name from member where id = '" + id + "' and pw = '" + pw + "'";
					System.out.println(sql);
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					
					if(rs.next())
						System.out.println(rs.getString("name") + " ���� �α����ϼ̽��ϴ�.");
					else
						System.out.println("�α��� ����");
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException se){
					se.printStackTrace();
				} finally {
					try {
						rs.close();
						stmt.close();
						conn.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			else if(e.getSource() == btnReset) // Reset ��ư�� ���� ���.
			{
				tfId.getText();tfId.setText("");
				pwf.getPassword();pwf.setText("");
			}
		}
		
		public static void main(String[] args)
		{
			new LogInS();
		}

}
