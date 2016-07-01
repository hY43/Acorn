<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
/* 	div{
		width:200px;
		height:200px;
		text-align:center;
	} */
	table,th,td{
		border:1px solid;
	}
	table{
		text-align:center;
	}
	img{
		width:200px;
		height:200px;
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
	<%
		Object obj = session.getAttribute("id");
		if (obj == null) {
	%>
	<form action="http://www.cgv.co.kr/user/login/?returnURL=http%3a%2f%2fwww.cgv.co.kr%2fDefault.aspx" method="post">
		<div>
			<table>
				<tr>
					<td>ID</td>
					<td><input type="text" name="txtUserId" id="" /></td>
				</tr>
				<tr>
					<td>PW</td>
					<td><input type="password" name="txtPassword" id="" /></td>
				</tr>
				<tr>
					<td colspan=2><input type="submit" value="로그인" /> <input
						type="button" value="회원가입" /></td>

				</tr>
			</table>
		</div>
	</form>
	<%
		}else{
			String id = (String)obj;
			String name = (String) session.getAttribute("name");
	%>
	<div>
		<a href="logout.jsp"><%=name %>님 로그아웃</a>
	</div>
	<img src="../images/movie2.jpg" alt="" />
	<%
		}
	%>
</body>
</html>