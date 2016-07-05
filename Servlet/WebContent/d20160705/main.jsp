
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	// 현재 창 로드 후 익명 함수 실행.
	window.onload = function(){
		
		<%
		Cookie[] cList = request.getCookies();
		boolean isShow = true; // 팝업 창을 띄울지 여부
		if(cList != null){
			for(Cookie c : cList){
				if(c.getName().equals("popup") && c.getValue().equals("no")){
					isShow = false;
					break;
				}
			}
		}	
		if(isShow){
		%>
		window.open("popup.jsp","공지사항", "width=320px, height=600px");
		<%
		}
		%>
		
	}
</script>
</head>
<body>
	<!-- 쿠키 목록 가져오기 -->

	<p>메인 페이지 입니다.</p>
	<p>공지사항을 보세요</p>

</body>
</html>