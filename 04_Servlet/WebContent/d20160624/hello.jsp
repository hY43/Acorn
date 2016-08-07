<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- 페이지 지시자: 이 페이지가 어떤 방식으로 작성되었는지 작성됨. -->
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% // Scriptlet: 자바 코드 작성
		for(int i=0;i<5;i++)
			out.println("<h3>Hello JSP world</h3>");
	
		/*
			멀티 라인 주석
		*/
	%>
</body>
</html>