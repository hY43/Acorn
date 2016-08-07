<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, th, td, #sub {
	border: 1px solid;
	width: 400px;
	margin: auto;
	text-align: center;
}

th {
	background-color: gray;
	width: 100%;
}

td {
	width: 100%;
}
</style>
<script type="text/javascript">
	function checkValue(obj) {
		//console.dir(obj);
		var id = obj.id.value;
		var passwd = obj.pw.value;
		var passwd2 = obj.repw.value;
		var email = obj.email.value;
		var tel = obj.tel.value;
		var name = obj.name.value;
		console.log(name + " " + passwd + " " + passwd2 + " " + email);
		if (id == '') {
			alert("아이디를 입력하세요");
			obj.id.focus();
			return;
		}
		if (passwd == '') {
			alert("비밀번호를 입력하세요");
			obj.pw.focus();
			return;
		}
		if (passwd2 == '') {
			alert("비밀번호를 한번더 입력하세요");
			obj.repw.focus();
			return;
		}
		if (email == '') {
			alert("이메일을 입력하세요");
			obj.email.focus();
			return;
		}
		if (passwd != passwd2) {
			alert("두 개의 패스워드가 동일해야 합니다.");
			obj.pw.value = "";
			obj.repw.value = "";
			obj.pw.focus();
			return;
		}
		if (email.indexOf('@') == -1) {
			alert("올바른 형식의 이메일을 입력하세요");
			obj.email.value = "";
			obj.email.focus();
			return;
		}
		// 페이지 이동
/* 		obj.action = "registerOk.jsp";
		obj.method = "get"
		obj.submit(); */
		// 모든 조건을 만족했을 때만 페이지를 이동 시키기 위해 input(submit) 을 사용하지 않고, submit Method를 사용한다. 
	}
</script>
</head>
<body>
	<form action="registerOk.jsp">
		<table>
			<tr>
				<th>아이디</th>
				<td><input type="text" name="id" id=""></td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td><input type="text" name="pw" id=""></td>
			</tr>
			<tr>
				<th>패스워드 확인</th>
				<td><input type="text" name="repw" id=""></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" id=""></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="text" name="tel" id=""></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email" id=""></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" id="btn"></td>
			</tr>
		</table>
	</form>
</body>
</html>