<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/main.css" />
</head>
<body>
	<div id="container">
		<%
			String fname = request.getParameter("fname");
			/* parameter의 유무에 따라 기본페이지를 보여줄지, nav에서 선택한 메뉴의 페이지를 보여줄지 확인하기 위해
			fname이라는 이름을 이용하여 값을 넘겨 받는다. */
		%>
		include directive: 경로에 있는 소스코드
		<%@ include file = "header.jsp" %> <!-- header.jsp의 소스코드를 읽어와서 이 자리에 붙여넣는다. -->
		<%@ include file = "nav.jsp" %>
		<%
			if(fname == null || fname.equals("")){
		%>
			<!-- 파라미터가 null이면 기본 값을 보여줘 -->
			<!-- include 지시자 사용법1)include directive: 해당 파일의 소스를 복사/붙여넣기 한 효과(정적) -->
			<%@ include file="leftContents.jsp" %>

		<%
		}else{
			/* 있으면 fname 즉 news에 jsp를 붙여 */
			fname += ".jsp";
		%>
		<!-- include 지시자 사용법2)jsp Action Tag 중 include를 사용하면 뒤의 include 문장을 실행한 결과를 넣어줌.(동적) -->
		<jsp:include page="<%=fname %>" />
		<%
		}
		%>
		<%@ include file="sideBar.jsp" %>
		<%@ include file="footer.jsp" %>
		
	</div>
</body>
</html>