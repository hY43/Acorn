<%@page import="kr.co.kitcoop.vo.EmpVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.kitcoop.dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<%
	EmpDAO dao = new EmpDAO();
	List<EmpVO> list = dao.searchByName(request.getParameter("ename"),Integer.parseInt(request.getParameter("sal")));
	out.println(list);
%>
<div class="container">
	<table class="table">
		<tr>
			<th>사번</th>
			<th>이름</th>
			<th>급여</th>
			<th>입사일</th>
		</tr>
		<%
			for (EmpVO vo : list) {
		%>
		<meta charset="UTF-8">
		<title>Insert title here</title>
</head>
<body>
			<tr>
				<td><%= vo.getEmpno()%></td>
				<td><%= vo.getEname() %></td>
				<td><%= vo.getSal() %></td>
				<td><%= vo.getHiredate() %></td>
			</tr>
		</table>
	</div>
<%
	}
%>
</body>
</html>