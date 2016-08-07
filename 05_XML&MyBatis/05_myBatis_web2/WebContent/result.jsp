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
	String keyword = request.getParameter("keyword").toUpperCase();

	if(keyword == null || keyword.equals("")){
		response.sendRedirect("search.jsp");
	}else{
		EmpDAO dao = new EmpDAO();
		List<EmpVO> list = dao.search(keyword);
		
%>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
	<table class="table">
			<tr>
			<th>사번</th>
			<th>이름</th>
			<th>급여</th>
			<th>업무</th>
			<th>부서번호</th>
					</tr>
		<%
			for (EmpVO vo : list) {
		%>

		<tr>
			<td><a href="modify.jsp?empno=<%=vo.getEmpno()%>"><%= vo.getEmpno()%></a></td>
			<td><%= vo.getEname() %></td>
			<td><%= vo.getSal() %></td>
			<td><%= vo.getJob() %></td>
			<td><%= vo.getDeptno() %></td>
		</tr>
		<%
			}
		%>
	</table>
	</div>
</body>
</html>
<%
	}
%>