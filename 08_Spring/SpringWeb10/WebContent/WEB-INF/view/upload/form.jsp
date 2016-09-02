<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<!-- get방식 사용불가
	 get방식은 225byte까지만 전송할 수 있기 때문에 post방식 사용해야 함 -->
	<h1>form.jsp</h1>
	<!-- 내부의 값들을 객체로 묶어서 uploadFile라는 이름으로 전송(단, 그런 객체가 있어야함) -->
	<form:form method="post" action="upload.do" commandName="uploadFile" enctype="multipart/form-data">
		<input type="file" name="file" id="" />
		<form:errors path="file" />
		<input type="submit" value="전송" />
	</form:form>
</body>
</html>