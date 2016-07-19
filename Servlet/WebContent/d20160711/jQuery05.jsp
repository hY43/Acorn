<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	*{
		margin:0;
	}
	img{
		width:200px;
		height:200px;
	}
</style>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#btn1").on("click", function() {
			// 오른쪽으로 이동 시키는 함수
			/* 특정 동작을 시작차를 두어 부드럽게 동작시킴 */
			$("img").animate({
				// 오른쪽으로 이동 시키는 효과를 주기 위해 왼쪽에 margin을 줌.
				"marginLeft" : parseInt($("img").css("marginLeft")) + 100
			}, 1000);
		});

		$("#btn2").on("click", function() {
			// 아래쪽으로 이동 시키는 함수
			$("img").animate({
				// 아래쪽으로 이동 시키는 효과를 주기 위해 윗쪽에 margin을 줌.
				"marginTop" : parseInt($("img").css("marginTop")) + 100
			}, 1000);
		});

		$("#btn3").on("click", function() {
			// 오른쪽 대각선 아래로 이동 시키는 함수
			$("img").animate({
				// 오른쪽 대각선 아래로 이동 시키는 효과를 주기 위해 윗쪽과, 왼쪽에 margin을 줌.
				"marginLeft" : parseInt($("img").css("marginLeft")) + 100,
				"marginTop" : parseInt($("img").css("marginTop")) + 100
			}, 1000);
		});
		
		$("#btn4").on("click", function() {
			// 오른쪽과 아래쪽으로 순차적으로 이동 시키는 함수.(이를 위해 Method Chain 방식 사용)
			$("img").animate({"marginLeft" : parseInt($("img").css("marginLeft")) + 100}, 1000).
					 animate({"marginTop" : parseInt($("img").css("marginTop")) + 100}, 1000);
		});
		
		$("#btn5").on("click", function() {
			// 크기를 2배로 증가시키는 함수
			$("img").animate({
				// 현재의 width와 height 값을 받아와서 두배로 증가시킴.
				"width":parseInt($("img").css("width"))*2,
				"height":parseInt($("img").css("height"))*2
			}, 1000);
		});
	});
</script>
</head>
<body>
	<input type="button" value="right" id="btn1" />
	<input type="button" value="down" id="btn2" />
	<input type="button" value="대각선" id="btn3" />
	<input type="button" value="오른쪽아래" id="btn4" />
	<input type="button" value="2배확대" id="btn5" />
	<br />
	<img src="../images/bo3.jpg" alt="" />
</body>
</html>