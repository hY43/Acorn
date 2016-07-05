<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
/*
	test3.jsp 이동하기
	1. a Tag
	2. forward
	3. Redirect
*/

	// forward: 요청 객체를 가져간다.
	/* 
	RequestDispatcher rd = request.getRequestDispatcher("test3.jsp");
	rd.forward(request, response);
	 */
	// Redirect
	/* response.sendRedirect("test3.jsp"); */
%>
	<!-- jsp action Tag를 활용한 page forward -->
	<jsp:forward page="test3.jsp"></jsp:forward>


	
</body>
</html>