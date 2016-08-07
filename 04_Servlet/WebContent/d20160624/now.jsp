<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- now.jsp 파일에 현재 날짜, 현재 시간을 출력하세요
ex) 2016년 6월 24일 20시 50분 50초 -->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Date date = new Date();
		String currentDate = "";
		currentDate += (String.valueOf(date.getYear()+1900) + "년 " + String.valueOf(date.getMonth()+1) + "월 " + String.valueOf(date.getDay()+19) + "일 " + String.valueOf(date.getHours()) + "시 " + String.valueOf(date.getMinutes()) + "분 " + String.valueOf(date.getSeconds()) + "초 "); 
		out.print(currentDate);
		
		
				
	
	%>
</body>
</html>