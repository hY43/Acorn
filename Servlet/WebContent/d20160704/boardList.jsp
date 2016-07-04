
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
	<%
		int pageNo = 0; // 페이지 번호
		String p = request.getParameter("page"); // 
		if(p == null || p.equals(""))
			pageNo = 1; // 별도의 페이지 번호 입력이 없다면 1~10번 게시물을 볼 수 있는 1번 페이지로 설정.
		else
			pageNo = Integer.parseInt(p);
		// Page 1: 1~10 게시글, Page 2: 11~20 게시글....
		int startNo = (pageNo-1) * 10 + 1; // 1, 11, 21...
		int endNo = pageNo*10; // 10, 20, 30...
		
/* 		out.println("pageNo: " + pageNo + "<br>");
		out.println("startNo: " + startNo + "<br>");
		out.println("endNo: " + endNo + "<br>"); */
		BoardDAO dao = new BoardDAO(); // selectAll Method 실행을 위한 BoardDAO 객체 생성.
		ArrayList<BoardVO> list = dao.selectAll(startNo,endNo); // select 문의 모든 결과를 row 단위로 저장하기 위한 BoardVO Type ArrayList 생성.
		int cnt = dao.getTotalCount();
		int totalPage = (cnt%10==0) ? (cnt/10) : (cnt/10+1);
		int startPage = pageNo-4;
		int endPage = pageNo+5;
		
		if(startPage <= 0){
			startPage = 1;	
			if(endPage < 10)
				endPage = 10;
		}else if(endPage >= totalPage){
			endPage = totalPage;
		}
		
		boolean beforeFlag = false;
		boolean afterFlag = false;
		if(pageNo-5 >= 0) beforeFlag = true;
		if(pageNo+5 <= totalPage) afterFlag = true;
/* 		out.println("totalPage: " + totalPage + "<br>");			
		out.println("startPage: " + startPage + "<br>");			
		out.println("endPage: " + endPage + "<br>");	 */		
		for(BoardVO vo : list){
	%>
	<tr>
		<td><%=vo.getBno() %></td>
		<td><%=vo.getWriter() %></td>
		<!-- 게시글 제목을 클릭하면 해당 게시글의 상세 내용 확인 -->
		<td><a href="boardDetail.jsp?bno=<%=vo.getBno()%>"><%=vo.getTitle() %></a></td>
		<td><%=vo.getRegDate() %></td>
		<td><%=vo.getHits() %></td>
	</tr>
	<%
		}
	%>
	<tr>
		<td colspan=5>
		<%if(beforeFlag){ %>
		<a href="boardList.jsp?page=<%=(pageNo-5) %>"><input type="button" value="[이전]" /></a>
		<%
			} 
		%>
		<%
			for(int i=startPage;i<endPage;i++)
			{
		%>
			<a href="boardList.jsp?page=<%=i %>">[<%=i %>]</a>
		<%
			}
		%>
		<%
			if(afterFlag){
		%>
		<a href="boardList.jsp?page=<%=(pageNo+5) %>"><input type="button" value="[다음]" /></a>
		<%
			} 
		%>
		</td>
	</tr>
	
	<tr>
		<td colspan=5>
		<!-- pencil.png image를 클릭하면 writeForm.jsp 로 이동 -->
		<a href="writeForm.jsp">
			<img src="../images/pencil.png" alt="" />
		</a>
		<!-- jiwoogae.png image를 클릭하면 deleteAll.jsp로 이동 -->
		<a href="deleteAll.jsp">
			<img src="../images/jiwoogae.png" alt="" />
		</a>
		</td>
	</tr>
</table>
</body>
</html>