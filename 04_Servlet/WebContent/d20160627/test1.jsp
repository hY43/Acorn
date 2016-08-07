<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Test1.jsp 페이지입니다!!</h2>
	<%
		String msg = request.getParameter("msg");
	%>
	<h4>전달 받은 값: <%=msg %></h4>
</body>
</html>