package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.EmpVO;

public class EmpDAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@192.168.0.72:1521:orcl";
	private String user = "scott";
	private String password = "tiger";
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private StringBuffer sb = new StringBuffer();
	
	public EmpDAO(){
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			System.out.println(conn);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException se) {
			System.out.println("DB 연결 실패");
		}
	}
	
	public ArrayList<EmpVO> selectAll(){
		EmpVO vo;
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		sb.setLength(0);
		sb.append("SELECT empno, ename, sal, job, deptno FROM emp");
		
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				float sal = rs.getFloat("sal");
				String job = rs.getString("job");
				int deptno = rs.getInt("deptno");
				vo = new EmpVO(empno, ename, job, sal, deptno);
				list.add(vo);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public EmpVO selectOne(int no){
		EmpVO vo = null;
		sb.setLength(0);
		sb.append("SELECT empno, ename, sal, job, deptno FROM emp ");
		sb.append("WHERE empno = ?");
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, no);
			rs = pstmt.executeQuery();
			
			rs.next();
			String ename = rs.getString("ename");
			float sal = rs.getFloat("sal");
			String job = rs.getString("job");
			int deptno = rs.getInt("deptno");
			
			vo = new EmpVO(no, ename, job, sal, deptno);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo;
	}
	public void insertOne(EmpVO vo){
		sb.setLength(0);
		sb.append("INSERT INTO EMP(empno, ename, job, deptno) ");
		sb.append("VALUES(EMP_SEQ_EMPNO.NEXTVAL,?,?,?)");
		
		try {
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getEname());
			pstmt.setString(2, vo.getJob());
			pstmt.setInt(3, vo.getDeptno());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
