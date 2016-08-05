<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%
	String params = request.getParameter("no");
%>
	<h1><%=params %></h1> --%>
	<h2>${param.no }</h2><!-- 이 방식으로 하면 request를 통해 받을 필요도 없다. -->
</body>
</html>