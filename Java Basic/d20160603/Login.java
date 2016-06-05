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
		// 컴포넌트 생성
		btnlog = new JButton("로그인");
		btnrs = new JButton("Reset");
		id = new JLabel("ID");
		pw = new JLabel("PW");
		tid = new JTextField();
		tpw = new JPasswordField();
		tpw.setEchoChar('*');

		// 프레임 위치, 사이즈
		setBounds(550,250,500,300);
		setLayout(null); // 보더 레이아웃 없앰
		setTitle("로그인");
		// 컴포넌트 위치, 사이즈
		id.setBounds(120, 50, 50, 50);				// 라벨 설정
		pw.setBounds(120, 100, 50, 50);
		tid.setBounds(170, 50, 200, 45);			// 텍스트필드 설정
		tpw.setBounds(170, 100, 200, 45);
		btnlog.setBounds(120, 200, 100, 50);		// 버튼 설정
		btnrs.setBounds(270, 200, 100, 50);
		Color c = new Color(103,205,103);
		//btnlog.setBackground(c);					// 버튼 색깔 설정
		Color c1 = new Color(200,205,77);
		//btnrs.setBackground(c1);					// 버튼2 색깔 설정
		// 각 컴포넌트 추가
		add(btnlog);
		add(btnrs);
		add(id);
		add(pw);
		add(tid);
		add(tpw);
		// 버튼 리스너 부착
		btnlog.addActionListener(this);
		btnrs.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 보여주기
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getActionCommand() : 라벨 글자
		// e.getSource() : 참조객체
		
		Object obj = e.getSource();				// 참조객체 뽑아오기
		System.out.println(obj);
		System.out.println("id : "+tid.getText()+", pw : "+tpw.getText());
		if(obj == btnlog){			// 로그인버튼이면
			
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("conn : "+conn);
			} catch (ClassNotFoundException e1) {
				System.out.println("드라이버 로딩 실패");
			} catch (SQLException e1) {
				System.out.println("연결 실패");
			}
			
			sql = "SELECT name FROM member WHERE id = '"+tid.getText()+"' and pw = '"+tpw.getText()+"'";
			System.out.println("사용할 sql문 : " +sql);
			
			
			try {
				// 4. 문장 객체
				stmt = conn.createStatement();
				// 5. 실행
				rs = stmt.executeQuery(sql);
				if(rs.next()){
					System.out.println("로그인되었습니다.");	
				}
				else{
					System.out.println("아이디 또는 패스워드가 다릅니다.");
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
			
		}else if(obj == btnrs){												// reset 버튼
			System.out.println("다시입력하세요.");
			tid.getText();
			tid.setText("");
			tpw.getText();                                                                      
			tpw.setText("");
		}
	}
}
