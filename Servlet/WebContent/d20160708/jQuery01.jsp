<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		// Method Chain 방식
		/* $("#box1").css("background-color","green").css("width","200px").css("height","200px"); */
		// JSon 방식
		$("#box1").css({
			"background-color":"green",
			"width":"200px",
			"height":"200px"
		});
		
		$("#btn1").on("click", function(){	
			var color = window.prompt("어떤색으로 변경하시겠습니까?","red");
			/* console.log(color); */
			$("#box1").css("background-color",color);
		});
		
		$("#btn2").on("click", function(){
			alert("너비는 " + $("#box1").width() + "입니다");
			// console.log($("#box1").css("width"));
		});
		
		$("#btn3").on("click",function(){
			/* console.dir($("#box1")); */
			$("div").addClass("myStyle");
		});
		
		$("#btn4").on("click",function(){
			$("div").removeClass("myStyle");
		});
		
		$("img").on("mouseenter", function(){
			$("img").css("border","5px solid red");	
		});
		
		$("img").on("mouseout", function(){
			$("img").css("border","none");	
		});
	});
</script>
<style type="text/css">
	.myStyle{
		color:white;
	}

</style>
</head>
<body>
	<!-- input:button#btn$*4 -->
	<!-- 
	box 배경: green width:200px, height:200px;
	1. 메서드 체인 방식
	2. JSON 방식 
	-->
	<!-- btn1: 버튼 클릭 시 어떤 색으로 변경할 것인지 물어보고 해당 색으로 변경 -->
	<!-- btn2: box1의 너비를 구해서 경고창으로 띄우기 -->
	<!-- btn3: 버튼을 누르면 myStyle 클래스 추가, myStyle은 CSS로 정의 -->
	<!-- btn4: 버튼을 누르면 myStyle 클래스 제거 -->
	<!-- 이미지에서 마우스가 나오면 빨간색 테두리 추가하기 -->
	<!-- 이미지에서 마우스가 나오면 빨간색 테두리 제거하기 -->
	<input type="button" value="btn1" id="btn1" />
	<input type="button" value="btn2" id="btn2" />
	<input type="button" value="btn3" id="btn3" />
	<input type="button" value="btn4" id="btn4" />
	<div id="box1">
	<p>BOX1</p>
	</div>
	<img src="../images/bo3.jpg" alt="" />
</body>
</html>