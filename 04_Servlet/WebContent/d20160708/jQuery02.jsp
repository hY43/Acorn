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
		$("#btn1").on("click", function() {
			$("#box1").hide(2000);
		});
		$("#btn2").on("click", function() {
			$("#box1").show(2000);
		});
		$("#btn3").on("click", function() {
			$("#box1").toggle(2000);
		});
		$("#btn4").on("click", function() {
			$("#box1").fadeOut(500);
		});
		$("#btn5").on("click", function() {
			$("#box1").fadeIn(500);
		});
		$("#btn6").on("click", function() {
			$("#box1").slideToggle(500,function(){
				location.href="http://www.naver.com";
			});
		});
	});

</script>
<style type="text/css">
	#box1{
		width;100px;
		height:100px;
		background-color:green;
	}
</style>


</head>
<body>
	<input type="button" value="숨기기" id="btn1" />
	<input type="button" value="보이기" id="btn2" />
	<input type="button" value="번갈아 수행하기" id="btn3" />
	<input type="button" value="점점사라지게" id="btn4" />
	<input type="button" value="점점보이게" id="btn5" />
	<input type="button" value="효과주기" id="btn6" />
	<div id="box1">
		오늘은 불금
	</div>
</body>
</html>