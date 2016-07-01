<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table,th,td{
	border:1px solid black;
	border-collapse:collapse;
}
table{
	width:1000px;
	margin:0 auto;
	text-align:center;
}

#col1{
	width:25%;
}
#col2{
	width:25%;
}
#col3{
	width:25%;
}
#col4{
	width:25%;
}
caption{
	font-weight:bold;
}

th{
	background-color:gray;
}
img{
	width:50px;
	height:50px;
	cursor:pointer;
}
</style>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("img[src='../images/cry.png']").on("click",function(){
			$("form")
			
			
		});
	});
</script>
</head>
<body>
<%
	BoardDAO dao = new BoardDAO();
	BoardVO vo = dao.selectOne(Integer.parseInt(request.getParameter("bno")));
%>
<form action="modifyOk.jsp">
	<table>
		<caption>상세보기</caption>
		<tr>
			<th id="col1">작성일시</th>
			<td id="col2"><%=vo.getRegDate() %></td>
			<th id="col3">조회수</th>
			<td id="col4"><%=vo.getHits() %></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td colspan="3">
				<input type="text" name="writer" id="" value="<%=vo.getWriter() %>" />
			</td>
		</tr>
		<tr>
			<th>제목</th>
			<td colspan="3">
				<input type="text" name="title" id="" value="<%=vo.getTitle() %>"/>
			</td>
		</tr>
		<tr>
			<th>내용</th>
			<td colspan="3"><textarea name="contents" id="" cols="100" rows="20" value="<%=vo.getContents() %>"></textarea></td>
		</tr>
		<tr>
			<td colspan="4">
				<img src="../images/cry.png" alt="수정하기" />
				<img src="../images/docu.png" alt="목록보기" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>