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
		// 현재 페이지의 상태를 번호로 저장.
		// 404: 페이지를 찾을 수 없음.
		// 500: 서버 에러.
		// 405: get/post 방식 중에 지원하지 않는 방식으로 요청을 했을때.
		// 200: 정상 페이지.
		int status = response.getStatus();
		out.println("<h1> 정상적인 페이지: " + status + " </h1>");
		
		// 다른 페이지로 이동.
		response.sendRedirect("test1.jsp");
		// 기존의 요청 값을 없애고 직접 새로운 페이지로 접근한다.
		/* RequestDispatcher rd = request.getRequestDispatcher("test1.jsp");
		rd.forward(request, response); */
		// 기존의 요청 값을 유지하면서 기존 페이지에서 새로운 페이지로 연결해준다.
	%>
</body>
</html>