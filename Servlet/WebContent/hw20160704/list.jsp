<%@page import="vo.GuestBookVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.GuestBookDAO"%>
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
	#writer{
		width:100px;
	}
	#contents{
		width:400px;
	}
	#regdate{
		width:100px;
	}
	
</style>
</head>
<body>

	<h2>Guest Book</h2>
	<form action="deleteAll.jsp">
	<table>
		<tr>
			<th>선택</th>
			<th>작성번호</th>
			<th>작성자</th>
			<th>작성내용</th>
			<th>작성일시</th>
		</tr>

	<%
		
		int pageNo = 0;
		if(request.getParameter("page")==null || request.getParameter("page").equals("")){
			pageNo = 1;
		}else{
			pageNo = Integer.parseInt(request.getParameter("page"));
		}
		
		int startNo = (pageNo-1)*10+1;
		int endNo = pageNo*10;
		GuestBookDAO dao = new GuestBookDAO();
		ArrayList<GuestBookVO> list = dao.selectAll(startNo, endNo);
		
		int startPage = pageNo - 4;
		int endPage = pageNo + 5;
		int totalCnt = dao.getTotalCnt();
		int totalPage = (totalCnt%10==0) ? (totalCnt/10) : (totalCnt/10+1);
		if(startPage - 4 <= 0){
			startPage = 1;
			if(endPage + 5 <= 10){
				endPage = 10;
			}
		}
		if(endPage + 5 >= totalPage){
			endPage = totalPage;
		}
		
		
		for(GuestBookVO vo : list){
	%>
			<tr>
			<td>
				<input type="checkbox" name="check" id="select" value=<%=vo.getGno() %> />
			</td>
			<td id="gno"><a href="listDetail.jsp?gno=<%=vo.getGno()%>"><%=vo.getGno() %></a></td>
			<td id="writer"><%=vo.getWriter() %></td>
			<td id="contents"><%=vo.getContents() %></td>
			<td id="regdate"><%=vo.getRegDate() %></td>
		</tr>
	<%
		}	
	%>
		<tr>
			<td colspan=5>			
			<%
				for(int i=startPage;i<=endPage;i++){
			%>
			<a href="list.jsp?page=<%=i%>"><<%=i %>></a>
			<%
				}
			%>
			</td>
		</tr>
		<tr>
			<td colspan=5>
				<a href="writeForm.jsp"><input type="button" value="write" /></a>
				<input type="submit" value="delete" />
			</td>
		</tr>
	</table>
	</form>
</body>
</html>