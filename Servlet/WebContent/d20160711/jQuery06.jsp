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
		padding:0;
	}
	#eventBox{
		width:690px;
		height:200px;
		background-color:#cccccc;
		margin-left:200px;
		margin-top:30px;
	}
	#postbox{
		margin-left:200px;
		margin-top:30px;
	}
	#box1{
		width:690px;
		height:190px;
		background-color:white;
		border:4px solid #aaaaaa;
		/* 자식 영역이 부모 영역보다 크면 오버된 영역 감추기 */
 		overflow:hidden;
		position:relative;
	}
	#box2{
		width:850px;
		height:190px;
		margin:0;
		padding:0;
		position:absolute;
		left:0;
	}
	#box2 ul li{
		list-style-type:none;
		float:left;
		margin:0;
		paddig:0;
	}
	#box2 ul li img{
		width:135px;
		margin-right:5px;
	}
	#box3{
		padding:30px;
	}
</style>

<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		// 1초에 한번씩 수행
		setInterval(function(){
			$("#box2").animate({"left":"-=10px"},100,
				function(){
					// 현재 left 속성 값 얻어오기
					var left = parseInt($("#box2").css("left"));
					if(left < -800){
						$("#box2").css("left","0px");
					}
			});
		},100)
	});
</script>
</head>
<body>
	<!-- div#postbox>h2+div#box1>div#box2>ul>(li>img[src='../images/movie$.jpg'])*8 -->
	<div id="postbox">
		<h2>C데박스</h2>
		<div id="box1">
			<div id="box2">
				<ul>
					<li><img src="../images/movie1.jpg" alt="" /></li>
					<li><img src="../images/movie2.jpg" alt="" /></li>
					<li><img src="../images/movie3.jpg" alt="" /></li>
					<li><img src="../images/movie4.jpg" alt="" /></li>
					<li><img src="../images/movie5.jpg" alt="" /></li>
					<li><img src="../images/movie6.jpg" alt="" /></li>
					<li><img src="../images/movie7.jpg" alt="" /></li>
					<li><img src="../images/movie8.jpg" alt="" /></li>
				</ul>
			</div>
		</div>
	</div>
	<!-- div#eventBox>div#box3>h3+ul>li*4 -->
	<div id="eventBox">
		<div id="box3">
			<h3>진행중인 이벤트</h3>
			<ul>
				<li>1. 1+1 이벤트</li>
				<li>2. 90%할인 쿠폰 이벤트</li>
				<li>3. 커플 입장 시 팝콘 무료</li>
				<li>4. 군인 할인</li>
			</ul>
		</div>
	</div>
</body>
</html>