<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>현재 페이지는 jstl02.jsp 파일입니다.</h1>
	<!-- Expression Language-->
	<h1>Expression</h1>
	<h2>${num1}</h2>
	<h2>${num2}</h2>
	<h2>${num1+num2}</h2>
	<h2>${num1>num2 ? num1 : num2}</h2>
	
	<!-- JSP -->
	<h1>JSP</h1>
	<%
		int num1 = Integer.parseInt(String.valueOf(request.getAttribute("num1")));
		int num2 = Integer.parseInt(String.valueOf(request.getAttribute("num2")));
		int num3 = num1>num2?num1:num2;
	%>
	<h2><%=num3 %></h2>
	
	<!-- jstl -->
	<h1>JSTL</h1>
	<c:if test="${num1 > num2}">
		<h2>${num1}</h2>
	</c:if>
	<c:if test="${num1 < num2}">
		<h2>${num2}</h2>
	</c:if>
</body>
</html>