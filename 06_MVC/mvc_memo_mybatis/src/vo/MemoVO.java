package vo;

public class MemoVO {
	/*Member Variable*/
	private int no;
	private String writer;
	private String contents;
	private String wdate;
	private int status;
	private String pw;
	
	/*Constructor*/
	public MemoVO(){}
	public MemoVO(int no, String writer, String contents, String wdate, int status, String pw) {
		super();
		this.no = no;
		this.writer = writer;
		this.contents = contents;
		this.wdate = wdate;
		this.status = status;
		this.pw = pw;
	}

	/*Get/Set Method*/
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getWdate() {
		return wdate;
	}

	public void setWdate(String wdate) {
		this.wdate = wdate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
