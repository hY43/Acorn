<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<script>
$(function(){
	var $chkAllBtn = $('#selCheckAll');
		$chkAllBtn.on('click', function() {
			if ($chkAllBtn.is(':checked')) {
			// is: true/false 반환해줌.
				$('input[name="selCheck"]').prop("checked", true);
			} else {
				$('input[name="selCheck"]').prop("checked", false);
			}
		});
	})
</script>
</head>
<body>
	<div class="container">
	<form action="board.do">
		<table class="table">
			<colgroup>
				<col width="5%"/>
				<col width="5%"/>
				<col width="10%"/>
				<col width="20%"/>
				<col width="25%"/>
				<col width="15%"/>
				<col width="10%"/>
				<col width="10%"/>
			</colgroup>
			<tr>
				<th><input type="checkbox" name="selCheckAll" id="selCheckAll"/></th>
				<th>번호</th>
				<th>작성자</th>
				<th>제목</th>
				<th>조회수</th>
				<th>작성일</th>
				<th>수정</th>
				<th>삭제</th>
				
			</tr>
			<input type="hidden" name="cmd" value="deleteAll" />
			<c:forEach var="vo" items="${list}">
				<tr>	
					<th><input type="checkbox" name="selCheck" id="selCheck" value="${vo.bno }"/></th>
					<td>${vo.bno}</td>
					<td>${vo.writer}</td>
					<!-- 해당 게시물의 제목을 클릭하면 parameter로 "detail"이라는 cmd값과 게시물에 해당되는 bno값을 넘긴다. -->
					<td><a href="board.do?cmd=detail&bno=${vo.bno}">${vo.title}</a></td>
					<td>${vo.hits}</td>
					<td>${vo.regDate}</td>
					<td><a href="board.do?cmd=modifyForm&bno=${vo.bno }"><input type="button" value="수정" /></a></td>
					<td><a href="board.do?cmd=deleteOk&bno=${vo.bno }"><input type="button" value="삭제" /></a></td>
					<!-- 조건을 사용하여 아래와 같이 관리자 계정만 수정/삭제 버튼을 사용할 수 있게 한다. -->
					<%-- <c:if test="${userid }==admin">
					<td><a href="board.do?cmd=modifyForm&bno=${vo.bno }"><input type="button" value="수정" /></a></td>
					<td><a href="board.do?cmd=deleteOk&bno=${vo.bno }"><input type="button" value="삭제" /></a></td>
					</c:if> --%>
				</tr>
<%-- 				<tr>
					<%@ include file="detail.jsp" %>
				</tr> --%>
			</c:forEach>
			<tr>
				<td colspan="7">
				<a href="board.do?cmd=writeForm"><input type="button" value="글쓰기" /></a>
				<input type="submit" value="삭제" />
				</td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>