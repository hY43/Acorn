package vo;

public class BoardVO {
	private int bno; // 게시물 번호
	private String title; // 게시물 제목
	private String writer; // 게시물 작성자
	private String contents; // 게시물 내용
	private int hits; // 게시물 조회수
	private String regDate; // 게시물 게시 일자
	private int status; // 게시물 상태정보 1:정상 게시물, 2: 
	
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
