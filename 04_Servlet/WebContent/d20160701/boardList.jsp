
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
		border: 1px solid black;
	}
	h2{
		text-align:center;
		margin: 0 auto;
	}
	table{
		margin: 0 auto;
		text-align:center;
	}
	th,td{
		width:200px;
	}
	img{
		width:40px;
		height:40px;
	}
</style>
</head>
<body>
<h2>게시물 보기</h2>
<table>
	<tr>
		<th>게시물번호</th>
		<th>작성자</th>
		<th>제목</th>
		<th>작성일시</th>
		<th>조회수</th>
	</tr>
<%-- 	<%
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO> list = dao.selectAll(startNo, endNo);
		for(BoardVO vo : list){
	%>
	<tr>
		<td><%=vo.getBno() %></td>
		<td><%=vo.getWriter() %></td>
		<td><a href="boardDetail.jsp?bno=<%=vo.getBno()%>"><%=vo.getTitle() %></a></td>
		<td><%=vo.getRegDate() %></td>
		<td><%=vo.getHits() %></td>
	</tr>
	<%
		}
	%> --%>
	<tr>
		<td colspan=5>
		<a href="writeForm.jsp">
			<img src="../images/pencil.png" alt="" />
		</a>
		<a href="deleteOk.jsp">
			<img src="../images/jiwoogae.png" alt="" />
		</a>
		</td>
	</tr>
</table>
</body>
</html>