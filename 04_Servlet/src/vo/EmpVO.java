package vo;

public class EmpVO {
	/* Member Variable */
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private int hiredate;
	private int sal;
	private int comm;
	private int deptno;
	
	/* Constructor */
	public EmpVO(){}
	public EmpVO(int empno, String ename, String job, int mgr, int hiredate, int sal, int comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
		
	public EmpVO(int empno, String ename, String job, int sal, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.deptno = deptno;
	}


	/* Get/Set Method */
	public int getEmpno(){return empno;}
	public void setEmpno(int empno){this.empno = empno;}
	public String getEname(){return ename;}
	public void setEname(String ename){this.ename = ename;}
	public String getJob(){return job;}
	public void setJob(String job){this.job = job;}
	public int getMgr(){return mgr;}
	public void setMgr(int mgr){this.mgr = mgr;}
	public int getHiredate(){return hiredate;}
	public void setHiredate(int hiredate){this.hiredate = hiredate;}
	public int getSal(){return sal;}
	public void setSal(int sal){this.sal = sal;}
	public int getComm(){return comm;}
	public void setComm(int comm){this.comm = comm;}
	public int getDeptno(){return deptno;}
	public void setDeptno(int deptno){this.deptno = deptno;}	
}
