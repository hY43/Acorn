<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 쿠키: 사용자 브라우저에 저장하는 작은 정보의 조각 -->
	<!-- Cookie VS Session
	Cookie: 브라우저가 종료되어도 Cookie에 저장되어 있다면 해당 데이터 사용이 가능하다.(단 만료시간이 된다면 삭제된다.)
	Session: 내장 객체이며, 브라우저가 종료되면 데이터는 삭제된다. -->
	<form action="userInputOk.jsp">
		<input type="text" name="txt" id="" /> <input type="submit"
			value="쿠키에 저장" />
	</form>

</body>
</html>