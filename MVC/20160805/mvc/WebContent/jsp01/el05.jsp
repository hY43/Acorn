<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		/* 내장 객체 */
/* 		pageContext.setAttribute("id1", "aaaa"); // 현재 페이지를 벗어나면 사라짐
		request.setAttribute("id2", "bbbb"); // 요청 객체가 사라지기 전까지 유지
		session.setAttribute("id3", "cccc"); // 브라우저가 종료되면 사라짐.
		application.setAttribute("id4", "dddd"); // WAS가 종료되면 사라짐. */
		
		pageContext.setAttribute("id1", "aaaa"); // 현재 페이지를 벗어나면 사라짐
		request.setAttribute("id1", "bbbb"); // 요청 객체가 사라지기 전까지 유지
		session.setAttribute("id1", "cccc"); // 브라우저가 종료되면 사라짐.
		application.setAttribute("id1", "dddd"); // WAS가 종료되면 사라짐.
	%>
	
	<a href="el06.jsp">이동하기</a>
</body>
</html>