<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Expression Language</h1>
	<h2>${param.no1>param.no2?param.no1:param.no2}</h2>
	
	<h1>JSTL</h1>
	<c:if test="${param.no1 > param.no2}">
		<h2>${param.no1}</h2>
	</c:if>
	<c:if test="${param.no1 < param.no2}">
		<h2>${param.no2}</h2>
	</c:if>
</body>
</html>