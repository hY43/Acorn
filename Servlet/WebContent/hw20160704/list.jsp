<%@page import="vo.GuestBookVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.GuestBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,th,td{
		border: 1px solid black;
	}
	h2{
		text-align:center;
		margin: 0 auto;
	}
	table{
		margin: 0 auto;
		text-align:center;
	}
	th,td{
		width:200px;
	}
	#select{
		width:50px;
	}
</style>
</head>
<body>

	<h2>Guest Book</h2>
	<form action="deleteAll.jsp">
	<table>
		<tr>
			<th>선택</th>
			<th>작성번호</th>
			<th>작성자</th>
			<th>작성일시</th>
		</tr>

	<%
		GuestBookDAO dao = new GuestBookDAO();
		ArrayList<GuestBookVO> list = dao.selectAll();
		
		for(GuestBookVO vo : list){		
	%>
			<tr>
			<td>
				<input type="checkbox" name="check" id="select" value=<%=vo.getGno() %> />
			</td>
			<td><a href="listDetail.jsp?gno=<%=vo.getGno()%>"><%=vo.getGno() %></a></td>
			<td><%=vo.getWriter() %></td>
			<td><%=vo.getRegDate() %></td>
		</tr>

	<%
		}	
	%>
		<tr>
			<td colspan=4>
				<a href="writeForm.jsp"><input type="button" value="write" /></a>
				<input type="submit" value="delete" />
			</td>
		</tr>
	</table>
	</form>
</body>
</html>