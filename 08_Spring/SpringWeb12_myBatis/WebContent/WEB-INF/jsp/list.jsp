<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>
	$(function(){
		$("input:button").on("click", function(){
			location.href = "add.do";
		});
	})
</script>
</head>
<body>
	<div class="container">
	<table>
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>부서번호</th>
		</tr>
		<c:forEach var="vo" items="${list }">
			<tr>
				<td>${vo.empno }</td>
				<td>${vo.ename }</td>
				<td>${vo.deptno }</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="2">
				<input type="button" value="사원 추가" />
			</td>
		</tr>
	</table>
	</div>

</body>
</html>