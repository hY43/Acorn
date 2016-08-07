<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>전달 받은 값</h2>
	<ul>
<%-- 		<li><%=pageContext.getAttribute("id1")%></li>
		<li><%=request.getAttribute("id2")%></li>
		<li><%=session.getAttribute("id3")%></li>
		<li><%=application.getAttribute("id4")%></li>
		<br>
		<li>${id1}</li>
		<li>${id2}</li>
		<li>${id3}</li>
		<li>${id4}</li> --%>
		<li>${sessionScope.id1}</li>
		<li>${requestScope.id1}</li>
		<li>${requestScope.id1}</li>
		<li>${applicationScope.id1}</li>
	</ul>
</body>
</html>