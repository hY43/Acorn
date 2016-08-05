<%@page import="vo.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://mxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<table class="table">
			<tr>
			<th>게시번호</th>
			<th>제목</th>
			<th>작성자</th>
					</tr>
<%
	BoardDAO dao = new BoardDAO();
	ArrayList<BoardVO> list = dao.selectAll(1, 10);
	session.setAttribute("list", list);
	/* RequestDispatcher rd = request.getRequestDispatcher("jstl08.jsp");
	rd.forward(request, response); */
	/* response.sendRedirect("jstl08.jsp"); */
	%>
	
	<%-- <jsp:forward page="jstl08.jsp">
		<jsp:param value="hello" name="test1"/>
		<jsp:param value="world" name="test2"/>
	</jsp:forward> --%>
	<c:redirect url="jstl08.jsp">
		<c:param value="hello" name="test1"></c:param>
		<c:param value="world" name="test2"></c:param>
	</c:redirect>
	
	<%
	for(BoardVO vo : list){
	%>

		<tr>
			<td><%= vo.getBno() %></td>
			<td><%= vo.getTitle() %></td>
			<td><%= vo.getWriter() %></td>
		</tr>
		<%
			}
		%>
	</table>

	</div>
</body>
</html>