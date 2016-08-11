<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="dao.JNDIConnection"%>
<%@page import="javax.sql.DataSource"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>부서번호</th>
		<th>부서이름</th>
		<th>부서위치</th>
	</tr>
	<%
		DataSource ds = JNDIConnection.getJNDIConnection();
		Connection conn = ds.getConnection();
		out.println("conn: " + conn);
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM dept");
		
		PreparedStatement pstmt = conn.prepareStatement(sb.toString());
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){
			int deptno = rs.getInt("deptno");
			String dname = rs.getString("dname");
			String loc = rs.getString("loc");
	%>
	
	<tr>
		<td><%=deptno %></td>
		<td><%=dname %></td>
		<td><%=loc %></td>
	</tr>
		<%
	
	
	
		}
	
	%>
	</table>

</body>
</html>