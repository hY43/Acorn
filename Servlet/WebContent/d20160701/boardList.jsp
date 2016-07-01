<%@page import="vo.BoardVO"%>
<%@page import="java.util.ArrayList"%>
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
	}
	table{
		width:1000px;
		text-align: center;
		margin:0 auto;
	}
	h2{
		margin:0, auto;
		text-align:center;
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
		
	});
</script>
</head>
<body>
	<%
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO> list = dao.selectAll();
	%>
	<h2>게시판</h2>
	<table>
		<tr>
			<th>게시물번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일시</th>
			<th>조회수</th>
		</tr>
		<%
			for(BoardVO vo: list){
		%>
		<tr>
			<td><%=vo.getbNo() %></td>
			<td><%=vo.getWriter() %></td>
			<td><a href="boardDetail.jsp?bno=<%=vo.getbNo()%>"><%=vo.getTitle() %></a></td>
			<td><%=vo.getRegDate() %></td>
			<td><%=vo.getHits() %></td>
		</tr>
		<%
			}
		%>
		<tr>
			<td colspan="5">
				<a href="writeForm.jsp"><img src="../images/pencil.png" alt="글쓰기" /></a>
			</td>
		</tr>
	</table>
</body>
</html>