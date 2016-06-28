package vo;

public class EmpVO {
	/* Member Variable */
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private int hiredate;
	private float sal;
	private float comm;
	private int deptno;
	
	/* Constructor */
	public EmpVO(){}
	public EmpVO(int empno, String ename, String job, int mgr, int hiredate, float sal, float comm, int deptno) {
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
		
	public EmpVO(int empno, String ename, String job, float sal, int deptno) {
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
	public float getSal(){return sal;}
	public void setSal(float sal){this.sal = sal;}
	public float getComm(){return comm;}
	public void setComm(float comm){this.comm = comm;}
	public int getDeptno(){return deptno;}
	public void setDeptno(int deptno){this.deptno = deptno;}	
}
