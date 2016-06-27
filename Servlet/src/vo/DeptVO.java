package vo;

// VO(Value Object), DTO, JavaBean
public class DeptVO {
	
	/* Member Variable */
	private int deptno;
	private String dname;
	private String loc;
	
	/* Constructor */
	public DeptVO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	/* Get/Set Method */
	public int getDeptno(){return deptno;}
	public void setDeptno(int deptno){this.deptno = deptno;}
	public String getDname(){return dname;}
	public void setDname(String dname){this.dname = dname;}
	public String getLoc(){return loc;}
	public void setLoc(String loc){this.loc = loc;}
		
}
