<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src = "../js/httpRequest.js"></script>
<script type="text/javascript">
/* 1. 그림 명 입력하고 버튼을 누르면 그 그림이 화면에 출력되도록.
2. 색깔 박스에 마우스를 올리면 각 색깔 박스에 할당된 그림이 화면에 출력되도록. */


	$(function(){
		// step 1.
		/* $("#btn").on("click", function(){
			var data = $("#txt1").val();
			var params = "name=" + data;
			sendRequest("datasearch.jsp",params,showImg,"GET");
		});
		
		function dataSearch(){
			var data = $("#txt1").val();
			var params = "name=" + data;
			sendRequest("datasearch.jsp",params,showImg,"GET");
		} */
		
		// step 2.
		$("#div2").on("mouseenter",function(){
			/* mouseover를 사용해도 무방. */
			var name = "park2";
			dataSearch(name);
		});
		$("#div3").on("mouseenter",function(){
			var name = "iron";
			dataSearch(name);
		});
	});
		
	function dataSearch(name){
		var params = "name=" + name;
		sendRequest("datasearch.jsp",params,showImg,"GET");
	}

	function showImg(){
		if(xhr.readyState==4 && xhr.status==200){
			// console.log(xhr.responseText);
			var data = xhr.responseText;
			// 공백 제거
			data = data.trim();
			$("#img1").attr("src",data);
		}
	}
	
</script>

<style type="text/css">
#div2 {
	width: 150px;
	height: 150px;
	background-color: red;
	position: absolute;
	top: 250px;
	left: 100px;
}

#div3 {
	width: 150px;
	height: 150px;
	background-color: blue;
	position: absolute;
	top: 250px;
	left: 260px;
}

#div1 {
	width: 330px;
	height: 350px;
	position: absolute;
	top: 420px;
	left: 100px;
}

img {
	width: 310px;
	height: 350px;
}
</style>
</head>
<body>
	<!-- 검색 버튼을 누르면 datasearch.jsp 가서 해당 키워드로 db 검색해서 이미지 경로를 얻어온다. -->
	<!-- 얻어온 이미지 경로는 하단에 있는 img tag의 src 값으로 사용한다. -->
	<h2>사진검색</h2>
	<input type="text" name="name" id="txt1" />
	<input type="button" value="검색" id="btn"/>
	<div id="div1">
		<img src="" alt="" id="img1"/>
	</div>
	<div id="div2"></div>
	<div id="div3"></div>
</body>
</html>