<%@page import="vo.DeptVO"%>
<%@page import="java.util.List"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<table class="table">
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>부서위치</th>
		</tr>
	
	<%
		DeptDAO dao = new  DeptDAO();
		List<DeptVO> list = dao.selectAll();
		for(DeptVO vo : list){
	%>
		<tr>
			<td><%=vo.getDeptno()%></td>
			<td><%=vo.getDname()%></td>
			<td><%=vo.getLoc()%></td>
		</tr>		
	<%
		}
	%>
	<tr>
		<td colspan="3">
			<a href="insertDataForm.jsp">
			<input type="button" value="입력" />
			</a>
			<a href="deleteDataForm.jsp">
			<input type="button" value="삭제" />
			</a>
		</td>
	</tr>
	</table>
	</div>
</body>
</html>