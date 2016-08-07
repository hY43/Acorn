<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%@ include file = "a1.jsp" %>
	<%
		int k = a + b;
	%> --%>
	<!-- jsp action Tag -->
	<!-- 컴파일 된 버전, 즉 결과를 가져와서 붙여넣기 때문에 a와 b를 알지 못한다. -->
	<jsp:include page="a1.jsp"></jsp:include>
	
</body>
</html>