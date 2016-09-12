package kr.co.test.web.dto;

public class StartEnd {
	private int startNo;
	private int endNo;
	
	public StartEnd(){}
	public StartEnd(int startNo, int endNo) {
		super();
		this.startNo = startNo;
		this.endNo = endNo;
	}
	
	public int getStartNo() {
		return startNo;
	}
	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}
	public int getEndNo() {
		return endNo;
	}
	public void setEndNo(int endNo) {
		this.endNo = endNo;
	}
}
