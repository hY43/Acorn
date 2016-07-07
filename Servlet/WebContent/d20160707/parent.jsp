<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload=function(){
		var btn1 = document.getElementById("btn1");
		btn1.onclick = function(){
			var popupwin = window.open("sub.jsp", "chile", "width=300,height=300,left300,top=300");
			
		}
	}
</script>
</head>
<body>
<!-- btn1을 누르면 sub.jsp를 popup으로 띄우기 -->
	<input type="text" name="data1" id="txt1" size="5" />
	<input type="text" name="data2" id="txt2" size="5" />
	<input type="button" value="popup" id="btn1" />
</body>
</html>