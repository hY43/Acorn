<%@page import="vo.EmpVO"%>
<%@page import="dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,td,th{
		border:1px solid;
	}
	table{
			text-align:center;
	}
</style>
</head>
<body>
	<%
		if (request.getParameter("no") == null) {
	%>
	<h2>사원 정보</h2>
	<form action="">
		<input type="text" name="no" id="" />
		<input type="submit" value="사원 검색" />
	</form>
	<%
		}else{
			EmpDAO dao = new EmpDAO();
			int empno = Integer.parseInt(request.getParameter("no"));
			EmpVO vo = dao.selectOne(empno);

	%>
	<table>
		<tr>
			<th>사원번호</th>
			<th>사원명</th>
			<th>직무</th>
			<th>연봉</th>
			<th>부서번호</th>
		</tr>
		<tr>
			<td><%=vo.getEmpno() %></td>
			<td><%=vo.getEname() %></td>
			<td><%=vo.getJob() %></td>
			<td><%=vo.getSal() %></td>
			<td><%=vo.getDeptno() %></td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>