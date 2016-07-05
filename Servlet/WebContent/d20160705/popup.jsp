<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	function closeWindow(){ 
		document.frm.submit();
		/* 		
		if($("#popupNo")[0].checked == true){
			console.log("checked");
		}else{
			console.log("not checked");
		} 
		*/
	}
</script>
<style type="text/css">
	img{
		margin: 0 auto;
		padding: 0;
	}
</style>
</head>
<body>
<%
	// 파라미터 값을 읽어오기
	String chk = request.getParameter("chk"); // chk라는 name을 갖는 속성의 값을 가져와서 String Type 변수 chk에 대입
	String flag = request.getParameter("flag");
	System.out.println("flag: " + flag);
	// if checkbox is checked
	if(chk != null){
		// 팝업창을 띄우기를 원하지 않는다면 쿠키를 생성해서 심어 놓는다.
		Cookie c = new Cookie("popup", "no");
		// 1분짜리
		c.setMaxAge(60);
		response.addCookie(c);
	
%>
<script type="text/javascript">
	/* self.close(); */
</script>
<%
	}
%>
	<img src="../images/movie1.jpg" alt="" width="300" height="350px"/><br />
	<p>이 영화 재밋어요</p>
	<form action="popup.jsp" name="frm">
		<input type="checkbox" name="chk" id="popupNo" />오늘하루 보지 않기 <br />
		<input type="hidden" name="flag" value="false"/>
		<!-- 링크에도 자바스크립트를 작성할 수 있다. -->
		<a href="javascript:closeWindow()">닫기</a>
	</form> 
</body>
</html>