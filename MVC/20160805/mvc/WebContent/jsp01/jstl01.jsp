<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- JSTL 사용을 위한 taglib 지시자 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL(Java Standard Tag Library)</h1>
	<!-- 
	사용자 정의형 Tag의 생성이 가능하다. 즉 특정 기능을 하는 Tag를 생성할 수 있다.
	예를 들어 if 문의 역할을 하는 Tag를 생성할 수도 있다. 
	이러한 Tag들 중에서  유용하고 많이 알려진 Tag들을 묶어서 표준으로 발표하는데, 이를 JSTL이라고 한다.
	라이브러리 다운경로: http://tomcat.apache.org/download-taglibs.cgi
	1. 간단한 프로그램 로직 구사
	2. for문 if문 태그 지원
	3. 날짜, 시간, 숫자 형식
	4. 데이터 베이스의 입출력
	5. xml 문서의 처리
	6. 문자열을 처리하는 함수 호출
	일반적으로 #1과 #2를 가장 많이 사용한다.
	-->
	<!-- request.setAttribute("num1","100") 과 동일한 문장 -->
	<!-- 디자이너 가독성..... -->
	<c:set var="num1" value="100" scope="request"></c:set>
	<c:set var="num2" value="200" scope="request"></c:set>
	<jsp:forward page="jstl02.jsp"></jsp:forward>
</body>
</html>