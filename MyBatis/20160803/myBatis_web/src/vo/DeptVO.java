package vo;

public class DeptVO {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptVO(){} 
	// FrameWork의 경우엔 객체의 매개변수에 어떤 값을 전달할지 알 수 없는 경우가 많다.
	// 그래서 Framework은 기본 생성자를 호출하는 경우가 많기 때문에 기본 생성자를 반드시 만들어야 한다.
	
	public DeptVO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}

	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
