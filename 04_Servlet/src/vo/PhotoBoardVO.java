package vo;

public class PhotoBoardVO {
	private int pno;
	private String title;
	private String contents;
	private String writer;
	private String filename;
	private String regDate;
	
	public PhotoBoardVO(){}
	public PhotoBoardVO(int pno, String title, String contents, String writer, String filename, String regDate) {
		super();
		this.pno = pno;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.filename = filename;
		this.regDate = regDate;
	}
	
	public String getRegDate() {
		return regDate;
	}
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
}
