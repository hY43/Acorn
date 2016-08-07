<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	window.onload = function(){
		btn2.onclick = 	function(){
			var addrs1 = document.getElementById("txt1").value;
			var addrs2 = document.getElementById("txt2").value;
			
			opener.document.getElementById("txt1").value = addrs1;
			opener.document.getElementById("txt2").value = addrs2;
			window.close();
		}
	}
</script>
</head>
<body>
	<!-- btn2 클릭하면 메세지 출력 -->
	<h3>우편번호 검색</h3>
	<input type="text" name="addrs1" id="txt1" size="5" />-
	<input type="text" name="addrs1" id="txt2" size="5" />
	<input type="button" value="완료" id="btn2" />
</body>
</html>