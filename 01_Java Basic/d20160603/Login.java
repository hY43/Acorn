package d20160603;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
	JButton btnlog,btnrs;
	JLabel id,pw;
	JTextField tid;
	JPasswordField tpw;
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@192.168.0.42:1521:orcl";
	String user = "scott";
	String password = "tiger";
	String sql = "";
	Statement stmt = null;
	ResultSet rs = null;
	Connection conn = null;
	
	
	public Login(){
		// ������Ʈ ����
		btnlog = new JButton("�α���");
		btnrs = new JButton("Reset");
		id = new JLabel("ID");
		pw = new JLabel("PW");
		tid = new JTextField();
		tpw = new JPasswordField();
		tpw.setEchoChar('*');

		// ������ ��ġ, ������
		setBounds(550,250,500,300);
		setLayout(null); // ���� ���̾ƿ� ����
		setTitle("�α���");
		// ������Ʈ ��ġ, ������
		id.setBounds(120, 50, 50, 50);				// �� ����
		pw.setBounds(120, 100, 50, 50);
		tid.setBounds(170, 50, 200, 45);			// �ؽ�Ʈ�ʵ� ����
		tpw.setBounds(170, 100, 200, 45);
		btnlog.setBounds(120, 200, 100, 50);		// ��ư ����
		btnrs.setBounds(270, 200, 100, 50);
		Color c = new Color(103,205,103);
		//btnlog.setBackground(c);					// ��ư ���� ����
		Color c1 = new Color(200,205,77);
		//btnrs.setBackground(c1);					// ��ư2 ���� ����
		// �� ������Ʈ �߰�
		add(btnlog);
		add(btnrs);
		add(id);
		add(pw);
		add(tid);
		add(tpw);
		// ��ư ������ ����
		btnlog.addActionListener(this);
		btnrs.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// �����ֱ�
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getActionCommand() : �� ����
		// e.getSource() : ������ü
		
		Object obj = e.getSource();				// ������ü �̾ƿ���
		System.out.println(obj);
		System.out.println("id : "+tid.getText()+", pw : "+tpw.getText());
		if(obj == btnlog){			// �α��ι�ư�̸�
			
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("conn : "+conn);
			} catch (ClassNotFoundException e1) {
				System.out.println("����̹� �ε� ����");
			} catch (SQLException e1) {
				System.out.println("���� ����");
			}
			
			sql = "SELECT name FROM member WHERE id = '"+tid.getText()+"' and pw = '"+tpw.getText()+"'";
			System.out.println("����� sql�� : " +sql);
			
			
			try {
				// 4. ���� ��ü
				stmt = conn.createStatement();
				// 5. ����
				rs = stmt.executeQuery(sql);
				if(rs.next()){
					System.out.println("�α��εǾ����ϴ�.");	
				}
				else{
					System.out.println("���̵� �Ǵ� �н����尡 �ٸ��ϴ�.");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
			
		}else if(obj == btnrs){												// reset ��ư
			System.out.println("�ٽ��Է��ϼ���.");
			tid.getText();
			tid.setText("");
			tpw.getText();                                                                      
			tpw.setText("");
		}
	}
}
