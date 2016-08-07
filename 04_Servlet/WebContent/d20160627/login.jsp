<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	div{
		width:200px;
		height:200px;
		text-align:center;
	}
</style>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("input[type='button']").on("click",function(){
			location.href = "./register.jsp";

		});
	});
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- id pw 입력 후, 로그인 버튼을 누르면 그 값을 logOk.jsp로 넘기는 코드를 작성할 것.
		  전달된 값은 loginOk.jsp에서 출력.
		 회원 가입 버튼을 누르면 register.jsp 이동.
	 -->
	<form action="loginOk.jsp">
		<div>
			<table>
				<tr>
					<td>ID</td>
					<td>
						<input type="text" name="id" id="" />
					</td>
				</tr>
				<tr>
					<td>PW</td>
					<td><input type="password" name="pw" id="" /></td>
				</tr>
				<tr>
					<td colspan=2>
						<input type="submit" value="로그인" />
						<input type="button" value="회원가입" />
					</td>
					
				</tr>
			</table>
		</div>
	</form>
</body>
</html>