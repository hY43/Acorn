<%@page import="vo.EmpVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.EmpDAO"%>
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
	table{
		text-align:center;
	}
</style>
</head>
<body>
	<%
		EmpDAO dao = new EmpDAO();
		ArrayList<EmpVO> list = dao.selectAll();
	%>
	<h1>사원 정보</h1>
	<!-- table>(tr>th*5)+(tr>td*5) -->
	<table>
		<tr>
			<th>순번</th>
			<th>사원번호</th>
			<th>사원명</th>
			<th>연봉</th>
			<th>직무</th>
			<th>부서번호</th>
		</tr>
		<% 
			int count = 0;
			for(EmpVO vo : list){
				count++;
		%>
		<tr>
			<td><%=count %></td>
			<td><%=vo.getEmpno() %></td>
			<td><%=vo.getEname() %></td>
			<td><%=vo.getSal() %></td>
			<td><%=vo.getJob() %></td>
			<td><%=vo.getDeptno() %></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>