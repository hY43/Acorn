<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script>
	$(function(){
		$("#register").on("click", function(){
			window.location.replace("register/step1.do");
			/* location.href="register/step1.do"; */
		});	
	})
</script>
</head>
<body>
	<h1>login page</h1>
	<form action="loginOk.do">
		<table>
			<tr>
				<td>ID</td>
				<td>
					<input type="text" name="id" id="" />
				</td>
			</tr>
			<tr>
				<td>PW</td>
				<td>
					<input type="password" name="pw" id="" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="로그인" />
					<input type="button" id="register" value="회원가입" />
				</td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>