<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.println("pageContext: " + pageContext.getAttribute("id1")); // 현재 페이지가 지나면 값을 잊는다.
		out.println("request: " + request.getAttribute("id2")); // 요청을 
		out.println("session: " + session.getAttribute("id3"));
		out.println("application: " + application.getAttribute("id4"));
		 %>
</body>
</html>