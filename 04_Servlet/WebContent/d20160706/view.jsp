<%@page import="vo.PhotoBoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.PhotoBoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
}

#container {
	margin:0 auto;
	width: 1000px;
	height: 150px;
}

img {
	width: 150px;
	height: 200px;
}

.wrap {
	width: 150px;
	float: left;
	border: 1px solid black;
	padding: 20px;
}
</style>
</head>
<body>
	<div id="container">
		<%
   PhotoBoardDAO dao = new PhotoBoardDAO();
   ArrayList<PhotoBoardVO> list = dao.selectAll();
   for(PhotoBoardVO vo : list){
      %>
		<div class="wrap">
			<a href="productDetail.jsp?pno=<%=vo.getPno()%>"> <img
				alt="<%=vo.getTitle()%>" src="<%=vo.getFilename() %>">
			</a>
			<p><%=vo.getTitle() %></p>
		</div>
		<%
   }
%>
	</div>
</body>
</html>