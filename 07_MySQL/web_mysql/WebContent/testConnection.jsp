<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String driver = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://192.168.0.74:3306/testdb";
		String user = "scott";
		String password = "tiger";
		Connection conn = null;
		StringBuffer sb = new StringBuffer();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Class.forName(driver);
		conn = DriverManager.getConnection(url, user, password);
		
		sb.setLength(0);
		sb.append("INSERT INTO dept(dname, loc) ");
		sb.append("VALUES(?,?)");
		pstmt = conn.prepareStatement(sb.toString());
		pstmt.setString(1, "sangwon");
		pstmt.setString(2, "집");
		pstmt.executeUpdate();
		
		sb.setLength(0);
		sb.append("SELECT * FROM dept");
		pstmt = conn.prepareStatement(sb.toString());
		rs = pstmt.executeQuery();
		while(rs.next()){
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
			out.println(deptno + " " + dname + " " + loc + "</br>");
		}		
		
	%>
</body>
</html>