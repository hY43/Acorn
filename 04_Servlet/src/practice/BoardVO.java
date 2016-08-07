package practice;

public class BoardVO {
	private int bno;
	private String title;
	private String writer;
	private String contents;
	private int hits;
	private String regDate;
	private int status;
	
	public BoardVO(){}
	public BoardVO(int bno, String title, String writer, String contents, int hits, String regDate, int status) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.hits = hits;
		this.regDate = regDate;
		this.status = status;
	}
	
	public int getBno(){return bno;}
	public void setBno(int bno){this.bno = bno;}
	public String getTitle(){return title;}
	public void setTitle(String title){this.title = title;}
	public String getWriter(){return writer;}
	public void setWriter(String writer){this.writer = writer;}
	public String getContents(){return contents;}
	public void setContents(String contents){this.contents = contents;}
	public int getHits(){return hits;}
	public void setHits(int hits){this.hits = hits;}
	public String getRegDate(){return regDate;}
	public void setRegDate(String regDate){this.regDate = regDate;}
	public int getStatus(){return status;}
	public void setStatus(int status){this.status = status;}
	
}
