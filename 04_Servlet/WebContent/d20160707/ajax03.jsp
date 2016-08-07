<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="../js/httpRequest.js"></script>
<script type="text/javascript">
	function helloToServer() {
		var name = document.getElementById("name").value;
		// hello.jsp?name=abc -> ?뒤의 내용을 QueryString이라고 한다.
		// QueryString 생성
		var params = "name=" + name;
		/* sendRequest(주소, 전달할 파라미터, 콜백함수명, GET) */
		sendRequest("hello.jsp", params, callback, "GET");
	}
	
	function callback(){
		if(xhr.readyState==4 && xhr.status==200){
			// console.log(xhr.responseText);
			var data = xhr.responseText;
			// 공백 제거
			data = data.trim();
			var div = document.getElementById("div1");
			console.log(data);
			if(data == 'true'){
				div.innerHTML = "존재하는 아이디입니다.";
			}else{
				div.innerHTML = "사용가능한 아이디입니다.";
			}
		}
	}
</script>
</head>
<body>
	<!-- 입력 버튼을 누르면 hello.jsp에 있는 내용을 가져와서 div1 영역에 출력하세요 -->
	<form action="" method="get" name="frm">
		<input type="text" name="name" id="name" onkeyup="helloToServer()"/>
		<input type="button" value="입력" onclick="helloToServer()" />
		
		<!-- span tag VS div tag -->
		<!-- 한개 row를 통째로 차지하는 div와는 달리 span은 사용할만큼만 딱 사용한다. -->
		<span id="div1"></span>
		<!-- <span id="div1"></span> -->
	</form>
</body>
</html>