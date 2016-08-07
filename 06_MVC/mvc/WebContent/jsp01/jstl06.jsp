<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- JSTL을 사용해서 1부터 1000사이의 3의 배수만 출력 -->
	<c:forEach begin="1" end="1000" var="i" step="1">
		<c:if test="${i%3==0}">${i}</c:if>
	</c:forEach>

	<!-- JSTL을 사용해서 1부터 1000사이의 3의 배수만 누적값 -->
	<c:forEach begin="0" end="1000" var="i" step="3">
		<c:if test="${i%3==0}">
			<c:set var="jSum" value="${jSum = jSum+ i}"></c:set>
		</c:if>
	</c:forEach>
	<h3>${jSum}</h3>
</body>
</html>