<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원 가입</h1>
	<!-- 상대 경로로 적어주어야한다. -->
	<form action="registerOk.do">
		<table>
			<tr>
				<th>id</th>
				<td><input type="text" name="id" id="id" /></td>
			</tr>
			<tr>
				<th>pw</th>
				<td><input type="text" name="pw" id="pw" /></td>
			</tr>
			<tr>
				<th>confirm</th>
				<td><input type="text" name="confirm" id="confirm" /></td>
			</tr>
			<tr>
				<th>email</th>
				<td><input type="text" name="email" id="email" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="가입" />
					<input type="button" value="돌아가기" />
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>