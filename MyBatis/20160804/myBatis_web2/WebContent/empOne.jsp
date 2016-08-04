<%@page import="kr.co.kitcoop.vo.EmpVO"%>
<%@page import="java.util.List"%>
<%@page import="kr.co.kitcoop.dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h2>사원번호를 입력하세요</h2>
<form action="#">
	<input type="text" name="empno" id="empno"/>
	<input type="submit" value="검색" />
</form>
<br />

<%
	EmpDAO dao = new EmpDAO();
	EmpVO vo=null;
	if(request.getParameter("empno")!=null){
		vo = dao.selectOne(Integer.parseInt(request.getParameter("empno")));
	
%>

	<table class="table">
			<tr>
				<th>사번</th>
				<th>이름</th>
				<th>급여</th>
				<th>입사일</th>
			</tr>

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