<%@page import="vo.GuestBookVO"%>
<%@page import="dao.GuestBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}

h2 {
	text-align: center;
	margin: 0 auto;
}

table {
	margin: 0 auto;
	text-align: center;
}

th, td {
	width: 100px;
}

#select {
	width: 50px;
}
</style>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script><%  %>
<script type="text/javascript">
	$(function(){
		$("#save").on("click", function(){
			$("form").submit();
		});
	});
</script>
</head>
<body>
	<%
		GuestBookDAO dao = new GuestBookDAO();
		GuestBookVO vo = dao.selectOne(Integer.parseInt(request.getParameter("gno")));
	%>
	<form action="modifyOk.jsp">
	<table>
		
		<tr>
			<th>작성자</th>
			<td>
			<input type="text" name="writer" id="" value=<%=vo.getWriter() %>/>
			<input type="hidden" name="gno" value=<%=vo.getGno() %> />
			</td>

			<th>작성일자</th>
			<td><%=vo.getRegDate() %></td>
		</tr>
		<tr>
			<td colspan=4>
				<textarea name="contents" id="" cols="100px" rows="40px" ><%=vo.getContents() %></textarea>
			</td>
		</tr>
		<tr>
			<td colspan=4>
				<input type="button" value="save" id="save"/>
				<input type="button" value="list" />
			</td>
		</tr>
	</table>
	</form>
</body>
</html>