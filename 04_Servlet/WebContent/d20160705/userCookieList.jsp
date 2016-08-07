<%@page import="java.net.URLDecoder"%>
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
		Cookie[] cList = request.getCookies(); // 브라우저의 cookie 목록들을 가져와서 Cookie Type Array에 저장.
		for(Cookie c: cList){
		String data = URLDecoder.decode(c.getValue());
			out.println(c.getName() + " : " + data + "<br />");
		}
	%>
</body>
</html>