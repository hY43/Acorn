package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.DeptVO;

public class DeptDAO {
	// 환경 변수를 private한 멤버 변수로 생성
	private String driver = "oracle.jdbc.driver.OracleDriver"; // 드라이버 로딩을 위한 드라이버 값 입력(oracle.jdbc.driver Package 내에 있는 OracleDriver Class 사용)
	private String url = "jdbc:oracle:thin:@172.30.1.2:1521:orcl"; // 접속을 위한 url 정보 입력, Oracle Server의 IP와 DB Name(orcl) 필요
	private String user = "scott"; // Oracle의 사용자 ID
	private String password = "tiger"; // Oracle의 사용자 ID에 대한 비밀번호
	private Connection conn; // Connection 객체 생성을 위한 참조 변수 선언.
	private PreparedStatement pstmt; // Database에게 Query 문을 전달하기 위한 PreparedStatement 참조 변수 선언.
	private ResultSet rs; // Select 문의 경우 결과를 반환하여 출력해야하므로 그 결과를 담기 위한 ResultSet 객체가 필요.
	private StringBuffer sb = new StringBuffer(); // SQL 문장을 담기 위한 StringBuffer 객체 생성, String이 아닌 StringBuffer를 사용하는 이유는 메모리 절약과 수정의 편의성 때문에.
	// 기본 생성자에 의해서 Connection 객체를 생성
	public DeptDAO(){
		try {
			/* 1. 드라이버 로딩 */
			Class.forName(driver); // driver 변수 내의 문자열을 이용하여 드라이버를 로딩한다.
			/* 2. Connection 객체 생성 */
			conn = DriverManager.getConnection(url, user, password); // 입력받은 DB 정보를 이용하여 DB에 접속한 후 그 상태 정보를 얻어와서 Connection 객체에 대입.
			// System.out.println("conn: " + conn); // 연결 확인
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
		} catch (SQLException se) {
			System.out.println("DB 연결 실패");
		}
	}
	
	public ArrayList<DeptVO> selectAll(){
		// Table의 전체 내용을 DeptVO Type의 ArrayList로 반환하는 Method.
		DeptVO vo = null;
		ArrayList<DeptVO> list = new ArrayList<DeptVO>(); 
		sb.setLength(0); // StringBuffer 객체에 담긴 문자열 정보 리셋.
		sb.append("SELECT deptno, dname, loc FROM DEPT"); // StringBuffer 객체에 SQL 문장 입력
		try {
			pstmt = conn.prepareStatement(sb.toString()); // StringBuffer 객체에 입력된 SQL 문장의 실행을 위해 PreparedStatement 객체에 SQL 문장을 대입(문장 객체 생성)
			rs = pstmt.executeQuery(); // SQL문장 실행/Select 문이므로 resultSet 객체에 결과 대입
			System.out.println();
			while(rs.next()){ // Select 문의 결과를 확인하기 위해 rs.next Method를 사용하여 순서대로 값을 받아온다. 
				int deptno = rs.getInt("deptno"); // Query문 실행 결과 중, 컬럼명이 deptno인 것을 가져와 deptno에 대입.
				String dname = rs.getString("dname"); // Query문 실행 결과 중, 컬럼명이 dname인 것을 가져와 dname에 대입.
				String loc = rs.getString("loc"); // Query문 실행 결과 중, 컬럼명이 loc인 것을 가져와 loc에 대입.
				vo = new DeptVO(deptno, dname, loc); // 검색 결과 값 반환을 위해 1개 row에 대한 결과로 DeptVO 객체 생성.
				list.add(vo); // 생성된 DeptVO 객체를 DeptVO Type의 ArrayList에 대입.
			}	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list; // 생성된 ArrayList 반환.
	}
	
	public DeptVO selectOne(int no){
		// 부서번호를 매개변수로 받아 매칭되는 부서 정보를 얻어오기 위한 selectOne Method.
		DeptVO vo = null; // vo 객체 생성을 위한 변수
		sb.setLength(0); // StringBuffer 객체에 문자열을 담기 위한 초기화.(다른 문자열이 담겨 있을 때를 대비)
		sb.append("SELECT deptno, dname, loc FROM dept ");
		sb.append("WHERE deptno = ? ");
		// StringBuffer 객체에 SQL 문장을 담는데, 입력 받은 매개 변수와 매칭되는 deptno를 찾아야하므로 Where절을 사용하며, ?문자로 두어 차후 바인딩한다.

		try {
			pstmt = conn.prepareStatement(sb.toString()); // StringBuffer에 입력된 SQL 문장을 문장 객체로 생성.
			pstmt.setInt(1, no); // 문장 내 변수인 deptno의 값에 대해 매개변수 no로 binding.
			rs = pstmt.executeQuery(); // SQL문을 실행한 후, (select문이기 때문에) 결과를 resultSet 객체에 저장. 
			rs.next(); // 결과값을 row 순서대로 불러오기 위한 next Method 사용, 여기에서는 한개 row만 불러왔으므로 while문은 사용하지 않음. 
			String dname = rs.getString("dname"); // 불러온 row의 값들 중 dname 컬럼의 값을 가져와서 dname에 저장.
			String loc = rs.getString("loc"); // 불러온 row의 값들 중 loc 컬럼의 값을 가져와서 loc에 저장.
			vo = new DeptVO(no, dname, loc); // 검색 결과가 들어있는 DeptVO 객체를 반환하기 위해 입력 받은 값으로 객체 생성.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vo; // 결과 값을 DeptVO 객체로 반환.
	}
	
	public void insertOne(DeptVO vo){
		sb.setLength(0); // 문자열 초기화
		sb.append("INSERT INTO dept ");
		sb.append("VALUES(DEPT_SEQUENCE_DEPTNO.NEXTVAL,?,?)");
		// 문장 객체 생성을 위해 Query를 작성하여 StringBuffer 객체에 대입.
		
		try {
			pstmt = conn.prepareStatement(sb.toString()); // StringBuffer 객체에 입력된 Query를 사용하여 문장 객체 생성.
			pstmt.setString(1, vo.getDname()); // Query 내의 변수(?)를 Method 호출 시 입력 받은 DeptVO 객체에서 매칭 되는 값으로 Binding.
			pstmt.setString(2, vo.getLoc()); // Query 내의 변수(?)를 Method 호출 시 입력 받은 DeptVO 객체에서 매칭 되는 값으로 Binding.
			
			pstmt.executeUpdate(); // Query 실행(Select와는 달리 executeUpdate Method를 사용)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteOne(int no){
		sb.setLength(0); // StringBuffer 객체 초기화.
		sb.append("DELETE FROM dept ");
		sb.append("WHERE deptno = ?");
		// Query 실행을 위해 StringBuffer 객체에 Query를 저장한다.
		
		try {
			pstmt = conn.prepareStatement(sb.toString()); // StringBuffer 객체에 저장된 Query를 사용하여 문장 객체 생성.
			pstmt.setInt(1, no); // 문장 객체 내의 변수(?)와 deleteOne Method 호출 시 입력 받은 no와 Binding.
			
			pstmt.executeUpdate(); // 문장 객체의 Query 실행.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updateOne(DeptVO vo){
		sb.setLength(0); // Query를 담을 StringBuffer 객체 초기화.
		sb.append("UPDATE dept ");
		sb.append("SET dname=?,loc=? ");
		sb.append("WHERE deptno = ?");
		// Query 실행을 위해 StringBuffer 객체에 문장을 작성.
		
		try {
			pstmt = conn.prepareStatement(sb.toString()); // StrinBuffer 객체에 담긴 문장을 사용하여 문장 객체 생성. 
			pstmt.setString(1, vo.getDname());
			pstmt.setString(2, vo.getLoc());
			pstmt.setInt(3, vo.getDeptno());
			// 문장 객체 내의 바인딩 변수들과 그와 매칭되는 updateOne Method 호출 시 입력받은 DeptVO 객체내의 변수들의 Binding 
			pstmt.executeUpdate(); // Query 실행.
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void close(){
		// 자원 반납을 위한 close Method
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
