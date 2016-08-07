package vo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class EmpVO {
	private BigDecimal empno;
	private String ename;
	private String job;
	private BigDecimal mgr;
	private Timestamp hiredate;
	private BigDecimal sal;
	private BigDecimal comm;
	private BigDecimal deptno;
	
	public EmpVO(BigDecimal empno, String ename, String job){
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	
	public EmpVO(BigDecimal empno, String ename, String job, BigDecimal mgr, Timestamp hiredate, BigDecimal sal, BigDecimal comm, BigDecimal deptno) {
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

	
	public BigDecimal getEmpno() {
		return empno;
	}
	public void setEmpno(BigDecimal empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public BigDecimal getMgr() {
		return mgr;
	}
	public void setMgr(BigDecimal mgr) {
		this.mgr = mgr;
	}
	public Timestamp getHiredate() {
		return hiredate;
	}
	public void setHiredate(Timestamp hiredate) {
		this.hiredate = hiredate;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal sal) {
		this.sal = sal;
	}
	public BigDecimal getComm() {
		return comm;
	}
	public void setComm(BigDecimal comm) {
		this.comm = comm;
	}
	public BigDecimal getDeptno() {
		return deptno;
	}
	public void setDeptno(BigDecimal deptno) {
		this.deptno = deptno;
	}
	
	
}
