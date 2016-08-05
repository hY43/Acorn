<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>선택한 취미는</h1>
<!-- jsp 사용 -->
<%-- <%
	String[] sel = request.getParameterValues("hobby");
	for(String one : sel){
%>
	<h3><%=one %></h3>
<% 
	}
%> --%>
<!-- Expression 사용 -->
	<h3>${paramValues.hobby[0]}</h3>
	<h3>${paramValues.hobby[1]}</h3>
	<h3>${paramValues.hobby[2]}</h3>
	<h3>${paramValues.hobby[3]}</h3>
</body>
</html>
