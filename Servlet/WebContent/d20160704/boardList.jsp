
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
		int cnt = dao.getTotalCount(); // 전체 데이터 수를 얻어와 int type 변수 cnt에 저장.
		int totalPage = (cnt%10==0) ? (cnt/10) : (cnt/10+1); // 한 페이지에 10개 항목을 보이게 하기 위해, 전체 데이터 수를 10으로 나눔.
		int startPage = pageNo-4; // 시작 페이지 설정(현재 페이지로 부터 이전 4개의 페이지는 선택할 수 있게 하기 위해 현재 페이지 번호(pageNo)에서 4를 뺌.)
		int endPage = pageNo+5; // 끝 페이지 설정(현재 페이지로 부터 다음 5개의 페이지는 선택할 수 있게 하기 위해 현재 페이지 번호(pageNo)에 5를 더함.)
		
		if(startPage <= 0){
			// 현재 페이지에서 -4를 했을때 시작 페이지가 음수 값이 나오는 경우에 대비하여 0보다 작을 경우 페이지 번호를 1부터 시작하도록 설정
			startPage = 1;	
			if(endPage < 10)
				// 맨 처음 시작할때 1페이지부터 10 페이지까지 선택할 수 있도록 하기 위해 끝 페이지를 10 이하일때는 무조건 10이 되도록 설정.
				endPage = 10;
		}else if(endPage >= totalPage){
			// 끝 페이지가 전체 페이지 수보다 많다면 그 이상의 페이지는 보여줄 필요가 없기 때문에 무조건 마지막 페이지를 전체 페이지 수로 설정.
			endPage = totalPage;
		}
		
		boolean beforeFlag = false; // 이전 페이지가 있는지 확인하기 위한 Flag
		boolean afterFlag = false; // 이후 페이지가 있는지 확인하기 위한 Flag
		if(pageNo-5 >= 0) beforeFlag = true; // 현재 페이지보다 이전에 5 이상의 페이지가 존재하는지 확인하고 존재하는 경우에만 true로 바꿔 5개의 페이지 항목을 보여준다.
		if(pageNo+5 <= totalPage) afterFlag = true; // 현재 페이지 이후 5 이상의 페이지가 존재하는지 확인하고 존재하는 경우에만 true로 바꿔 5개의 페이지 항목을 보여준다.
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
		<!-- 5페이지를 보여줄 수 있을 때에만 이전 버튼을 활성화 시킨다. -->
		<%if(beforeFlag){ %>
		<a href="boardList.jsp?page=<%=(pageNo-5) %>"><input type="button" value="[이전]" /></a>
		<%
			} 
		%>
		<%
			for(int i=startPage;i<endPage;i++)
			{
		%>
			<!-- 한 페이지에 10개 게시물을 보여주기 위한 반복문 -->
			<a href="boardList.jsp?page=<%=i %>">[<%=i %>]</a>
		<%
			}
		%>
		<!-- 5페이지를 보여줄 수 있을 때에만 다음 버튼을 활성화 시킨다. -->
		<%if(afterFlag){%>
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