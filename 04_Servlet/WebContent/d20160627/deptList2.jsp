<%@page import="vo.DeptVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,th,td{
		border:1px solid;
	}
</style>
</head>
<body>
<%
	DeptDAO dao = new DeptDAO();

	// Testing selectAll Method
	ArrayList<DeptVO> list = dao.selectAll();
%>
<h1>부서 정보</h1>
<!-- table>(tr>th*3)+(tr>td*3) -->
<table>
	<tr>
		<th>부서번호</th>
		<th>부서이름</th>
		<th>부서위치</th>
	</tr>
<%
	for(DeptVO vo : list){
%>
	<tr>
		<td><%=vo.getDeptno() %></td>
		<td><%=vo.getDname() %></td>
		<td><%=vo.getLoc() %></td>
	</tr>
<%
	}
%>
</table>

</body>
</html>