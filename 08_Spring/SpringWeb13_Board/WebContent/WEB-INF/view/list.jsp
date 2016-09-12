<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${total }
	${startNo }
	${endNo }
	${totalPage }
	${startPage }
	${endPage }
	<table class="table">
		<tr>
			<th></th>
			<th>게시물번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>내용</th>
			<th>조회수</th>
			<th>작성일자</th>
			<th>상태</th>
		</tr>
		<form action="deleteAll.do">
			<c:forEach var="dto" items="${list }">
				<tr>
					<td><input type="checkbox" name="no" id="" value="${dto.no }" /></td>
					<td>${dto.no }</td>
					<td>${dto.writer }</td>
					<td><a href="detail.do?no=${dto.no }">${dto.title }</a></td>
					<td>${dto.contents }</td>
					<td>${dto.hits }</td>
					<td>${dto.wdate }</td>
					<td>${dto.status }</td>
				</tr>
			</c:forEach>
		<tr>
			<td colspan="5"><a href="writeForm.do" class="btn btn-default">글쓰기</a></td>
			<td><input type="submit" value="삭제" class="btn btn-danger" /></td>
		</tr>
		<tr>
			<td colspan="6">
				<c:forEach var="i" begin="${startPage }" end="${endPage }">
					<a class="btn btn-default" href="list.do?currentPage=${i }">${i }</a>
				</c:forEach>
			</td>
		</tr>
		</form>
	</table>
</body>
</html>