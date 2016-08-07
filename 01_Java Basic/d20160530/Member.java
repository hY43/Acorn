package d20160530;

import java.io.Serializable;

public class Member implements Serializable{
	/* Member Variable */
	private int memNo;
	private String name;
	private String id;
	private transient String pw; // transient keyword는 객체 저장시에 저장하고 싶지 않은 정보 앞에 붙인다.
	private String tel;
	
	/* Constructor */
	public Member(){}
	public Member(int memNo, String name, String id, String pw, String tel) {
		super();
		setMemNo(memNo);
		setName(name);
		setId(id);
		setPw(pw);
		setTel(tel);
	}
	
	/* Getter/Setter */
	public int getMemNo() {return memNo;}
	public void setMemNo(int memNo) {this.memNo = memNo;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel = tel;}
	
	
}
