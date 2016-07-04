package vo;

public class GuestBookVO {
	private int gno;
	private String writer;
	private String contents;
	private String regDate;
	
	public GuestBookVO(){}
	public GuestBookVO(int gno, String writer, String contents, String regDate) {
		super();
		this.gno = gno;
		this.writer = writer;
		this.contents = contents;
		this.regDate = regDate;
	}

	public int getGno(){return gno;}
	public void setGno(int gno){this.gno = gno;}
	public String getWriter(){return writer;}
	public void setWriter(String writer){this.writer = writer;}
	public String getContents(){return contents;}
	public void setContents(String contents){this.contents = contents;}
	public String getRegDate(){return regDate;}
	public void setRegDate(String regDate){this.regDate = regDate;}
}
