<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
	<div class="container">
		<table class="table">
			<colgroup>
				<col width="5%"/>
				<col width="15%"/>
				<col width="30%"/>
				<col width="5%"/>
				<col width="15%"/>
			</colgroup>
			<tr>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>조회수</th>
				<th>작성일</th>
			</tr>
			<c:forEach var="vo" items="${list}">
				<tr>
					<td>${vo.bno}</td>
					<td>${vo.writer}</td>
					<td><a href="board.do?cmd=detail&bno=${vo.bno}">${vo.title}</a></td>
					<td>${vo.hits}</td>
					<td>${vo.regDate}</td>
				</tr>
				<tr>
					<%@ include file="detail.jsp" %>
				</tr>
			</c:forEach>
			<tr>
				<td colspan="5"><a href="board.do?cmd=writeForm"> <input
						type="button" value="글쓰기" />
				</a></td>
			</tr>
		</table>
	</div>
</body>
</html>