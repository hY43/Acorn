
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
table, td {
	border: 1px solid black;
}

img {
	width: 40px;
	height: 40px;
}

table {
	width: 800px;
	text-align: center;
}
</style>
<script type="text/javascript"
	src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
</head>
<body>
		<table>
			<%
				int bno = Integer.parseInt(request.getParameter("bno"));
				BoardDAO dao = new BoardDAO();
				BoardVO vo = dao.selectOne(bno);
			%>

			<tr>
				<td>작성자</td>
				<td colspan=4><%=vo.getWriter() %></td>
			</tr>
			<tr>
				<td>제목</td>
				<td colspan=4><%=vo.getTitle() %></td>
			</tr>
			<tr>
				<td>내용</td>
				<td colspan=4><textarea name="contents" id="" cols="100"
						rows="20"><%=vo.getContents() %>
				</textarea></td>
			</tr>
			<tr>
				<td colspan=4>
				<a href="modifyForm.jsp?bno=<%=vo.getBno()%>"><img src="../images/cry.png" alt="modify" /></a>
				<a href="deleteOk.jsp?bno=<%=vo.getBno() %>">
					<img src="../images/jiwoogae.png" alt="del" />
				</a>
				<a href="boardList.jsp"><img src="../images/docu.png" alt="docList" /></a>
				</td>
			</tr>
		</table>
</body>
</html>