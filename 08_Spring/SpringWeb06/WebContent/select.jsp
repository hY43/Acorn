<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 사용자로부터 취미를 선택한 후에 이 값을 selectHobby.do로 -->
	<form action="selectHobby.do">
		<h1>취미 선택</h1>
		<input type="checkbox" name="hobby" value="코딩하기" />코딩하기 
		<input type="checkbox" name="hobby" value="사이클" />사이클 
		<input type="checkbox" name="hobby" value="친구따라 찜질방가기" />친구따라 찜질방가기 
		<input type="checkbox" name="hobby" value="독서" />독서 
		<input type="checkbox" name="hobby" value="사이버낚시" />사이버낚시 
		<input type="submit" value="전송" />
	</form>
</body>
</html>