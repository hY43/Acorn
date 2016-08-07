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
	*{margin:0px; padding:0px;}
	#productImg{
		width:400px;
		height:400px;
		float:left;
	}
	#productInfo{
		float:right;
	}
	
	
</style>
</head>
<body>
	<%
		ProductDAO dao = new ProductDAO();
		ProductVO vo = dao.selectOne(Integer.parseInt(request.getParameter("pno")));
	
	%>
	<div id="productImg">
	<img src="<%=vo.getImgfile() %>" alt="상품사진" />
	</div>
	<div id="prodcutInfo">
	<h2><%=vo.getPname() %></h2>
	<table>
		<tr>
			<td>상품가격</td>
			<td colspan=2><%=vo.getPrice() %></td>
		</tr>
		<tr>
			<td>적립금</td>
			<td colspan=2><%=vo.getPrice()/100 %></td>
		</tr>
		<tr>
			<td>상품수량</td>
			<td colspan=2>
				<select name="quantity" id="">
					<option value="0">-</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
				</select>
			
			</td>
		</tr>
		<tr>
			<td><input type="button" value="구매" /></td>
			<td><input type="button" value="장바구니" /></td>
			<td><input type="button" value="돌아가기" /></td>
		</tr>
	</table>		
	</div>
	<div>
	<p><%=vo.getPDesc() %></p>
	</div>
</body>
</html>