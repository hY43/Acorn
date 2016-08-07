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
		// 내장 객체
		// pageContext: 현재 JSP 페이지의 컨텍스트를 나타내는 객체로서, 내장 객체를 얻어오거나, 페이지의 흐름제어, 에러 데이터를 얻어올때 주로 사용되는 객체.
		
		// 내장 객체 속성 값 사용하기.
		pageContext.setAttribute("id1", "aaa"); // pageContext의 속성으로 저장시킨다.
		request.setAttribute("id2", "bbb"); // 요청객체
		session.setAttribute("id3", "ccc"); // 브라우저와 서버간의 연결 회선으로 끊기기 전까지는 값이 유지된다.
		application.setAttribute("id4", "ddd"); // 서버가 종료되기 전까지 값이 유지된다.
		
		// 내장 객체 속성 값 가져오기.
		// 현재 페이지가 지나면 값을 잊는다.
		out.println("pageContext: " + pageContext.getAttribute("id1"));
		// 요청으로 따로 값이 들어오지 않으면 값을 가질 수 없다.
		out.println("request: " + request.getAttribute("id2"));
		// 다음 페이지까지 값이 유지된다.
		out.println("session: " + session.getAttribute("id3"));
		out.println("application: " + application.getAttribute("id4"));
		
		RequestDispatcher rd = request.getRequestDispatcher("page2.jsp");
		rd.forward(request,response);
		// 요청 객체를 갖고 이동하기 때문에 값을 갖고 이동해야하는 결제 페이지 등과 같은 곳에서 사용할 수 있다.
	%>
	<a href="page2.jsp">page 2로 이동</a>
</body>
</html>