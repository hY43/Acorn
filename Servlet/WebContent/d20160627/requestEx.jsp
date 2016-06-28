<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- _jspService(): 미리 선언되어 있는 객체 -->
	<!-- request -->
	<%
		// get ? post ?
		String method = request.getMethod();
		// 파라미터 value 얻어오기
		String name = request.getParameter("name");
		// 리모트 주소(Client) 가져오기
		String ip = request.getRemoteAddr();
		// ?의 뒤에 있는 전달 값.
		String queryString = request.getQueryString();
		out.println("접속 방법: " + method);
		out.println("name 파라미터값: " + name);
		out.println("클라이언트 IP: " + ip);
		out.println("? 전달 값: " + queryString);
	%>
</body>
</html>