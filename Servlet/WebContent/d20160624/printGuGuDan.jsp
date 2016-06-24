<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- optionSelect.jsp 에서 select 태그를 이용하여 구구단 메뉴를 선택하면  (자바스크립트 사용 해서) printGuGuDan.jsp 이동해서 해당 단을 출력하세요 -->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int dan = Integer.parseInt(request.getParameter("gugudan"));
		for(int i=1;i<10;i++){
			out.print(dan + " * " + i + " = " + (dan*i) + "<br>");
		}
	%>
</body>
</html>