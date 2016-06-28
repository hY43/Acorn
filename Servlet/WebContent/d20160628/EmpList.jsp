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
	<form action="deleteAllEmp.jsp">
	<table>
		<tr>
			<th>선택</th>
			<th>순번</th>
			<th>사원번호</th>
			<th>사원명</th>
			<th>연봉</th>
			<th>직무</th>
			<th>부서번호</th>
			<th>삭제 버튼</th>
		</tr>
		<% 
			int count = 0;
			for(EmpVO vo : list){
				count++;
		%>
		<tr>
			<td><input type="checkbox" name="check" id="" value="<%=vo.getEmpno() %>"/></td>
			<td><%=count %></td>
			<td><%=vo.getEmpno() %></td>
			<td><%=vo.getEname() %></td>
			<td><%=vo.getSal() %></td>
			<td><%=vo.getJob() %></td>
			<td><%=vo.getDeptno() %></td>
			<td><a href="deleteEmp.jsp?eno=<%=vo.getEmpno() %>"><input type="button" value="삭제" /></a></td>
		</tr>
		<%
			}
		%>
		<tr><td colspan=8><input type="submit" value="선택 삭제" /></td></tr>
	</table>
	</form>
</body>
</html>