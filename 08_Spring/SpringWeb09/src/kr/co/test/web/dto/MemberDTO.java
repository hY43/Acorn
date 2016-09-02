package kr.co.test.web.dto;

public class MemberDTO {
	/*Member Variable*/
	private String id;
	private String pw;
	private String email;
	
	/*Constructor*/
	public MemberDTO(){}	
	public MemberDTO(String id, String pw, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.email = email;
	}
	
	/*Get/Set Method*/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
