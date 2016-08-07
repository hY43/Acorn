<%@page import="java.net.URLEncoder"%>
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
		// userInput.jsp로부터 파라미터 값을 받아서 화면에 출력
		String txt = request.getParameter("txt");
		// 한글 처리를 위한 인코딩
		String data = URLEncoder.encode(txt);
		Cookie c = new Cookie("txt" , data); // new Cookie(찾을 이름, 담을 객체)
		c.setMaxAge(60*60*24); // 초단위로 쿠키 유통기한을 줌(60초가 1분이므로, 60*60*24: 1일)
		response.addCookie(c); // 사용자 브라우저로 쿠키 값을 전달.
		
		/*** Chrome에서의 쿠키 확인 방법 ***/
		// Chrome - 설정 - 고급 설정 표시 - 콘텐츠 설정 - 모든 쿠키 및 사이트 데이터 - loaclhost 검색 - txt 클릭 
		
	%>
	<a href="userCookieList.jsp">쿠키 목록 보기</a>
</body>
</html>