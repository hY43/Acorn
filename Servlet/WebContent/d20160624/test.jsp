<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>좋아하는 걸그룹</h2>
	<form action="resultView.jsp" method="get">
	<!-- <form action="resultView.jsp" method="post"> -->
		<!-- name이 그룹인 checkbox Tag 중, 실제로 선택한 checkbox의 value가 전달된다. -->
		<input type="checkbox" name="group" id="" value="씨스타" />1. 씨스타 <input
			type="checkbox" name="group" id="" value="소녀시대" />2. 소녀시대 <input
			type="checkbox" name="group" id="" value="원더걸스" />3. 원더걸스 <input
			type="checkbox" name="group" id="" value="샤크라" />4. 샤크라 <input
			type="checkbox" name="group" id="" value="핑클" />5. 핑클 <input
			type="submit" value="전송" />
			
	</form>
</body>
</html>