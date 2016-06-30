<%@page import="java.util.ArrayList"%>
<%@page import="vo.ProductVO"%>
<%@page import="dao.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{ margin:0; padding:0;}
	#container{
		width:1000px;
		margin:auto;
	}
	img{
		width:150px;
		height:150px;
	}
	.wrap{
		width:150px;
		float:left;
		/* border:1px solid black; */
		padding:20px;
	}
	p{
		text-align:center;
	}
	.dc{
		text-decoration:line-through;
		color:red;
	}
</style>
</head>
<body>
	<div id="container">
		<%
			ProductDAO dao = new ProductDAO();
			ArrayList<ProductVO> list = dao.selectAll();
			for(ProductVO vo : list){
				
		%>
			<div class="wrap">
				<a href="productDetail.jsp?pno=<%= vo.getPno()%>">
					<img src="<%=vo.getImgfile() %>" alt="<%=vo.getPname() %>" />
				</a>
				<p><%=vo.getPname() %></p>
				<p class="dc"><%=(int)(vo.getPrice()) %></p>
				<p><%=(int)(vo.getPrice()*0.9) %></p>
			</div>
			
		<%
			}
		%>
	</div>

</body>
</html>