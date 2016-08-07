<%@page import="vo.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%
	ArrayList<BoardVO> list = (ArrayList<BoardVO>)(session.getAttribute("list"));
	String test1 = request.getParameter("test1");
	String test2 = request.getParameter("test2");
	out.println(test1);
	out.println(test2);
%> --%>
<c:forEach items="${list}" var="vo" >
	<h1>${vo.bno} ${vo.title}</h1>
</c:forEach>



</body>
</html>