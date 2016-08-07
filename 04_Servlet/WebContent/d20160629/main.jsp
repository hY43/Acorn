<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/main.css" />
</head>
<body>
	<div id="container">
	<div id="header">
		<img src="../images/logo.gif" alt="로고" />
	</div>
	<div id="nav">
		<!-- 이 페이지는 간단해보이지만, 뉴스, 연예 등의 링크를 클릭할때마다 똑같은 형태의 Page에서 leftContents만 바뀌게 되므로 
		너무 많은 코드 중복과 유지 보수시 어려움이 따른다.
		그러므로 layout.jsp에서 구현한 방식이 많이 사용된다.-->
		<a href="news.jsp">뉴스</a>
		<a href="enter.jsp">연예</a>
		<a href="shopping.jsp">쇼핑</a>
		<a href="movie.jsp">영화</a>
		<a href="cook.jsp">요리</a>
	</div>
	<div id="leftContents">
		<ul>
			<li>팔찌 살려줘!</li>
			<li>재주토끼 사망</li>
			<li>리눅스 시험으로 인한 대량 결석</li>
			<li>현장에 있는 이슬씨의 참담한 현실</li>
		</ul>
	</div>
	<div id="sideBar">
	<div id="loginForm">
		<form action="loginOk.jsp">
		<table>
			<caption>로그인</caption>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" id="" /></td>
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
		</form>
		</div>
		<div id="rightDown">
			<ul>
				<li>하단 기사1</li>
				<li>하단 기사2</li>
				<li>하단 기사3</li>
				<li>하단 기사4</li>
			</ul>
		</div>
		</div>
		<div id="footer">
		<hr color="black"/>
			<span>아영쇼핑몰</span>
			없는거 빼고 다 있음
			copyright &copy; <br/>
			1992~2016 all rights reserved.
		</div>

	</div>
</body>
</html>