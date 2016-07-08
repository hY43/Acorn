<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.mainmenu{
		float:left;
		width:220px;
		list-style-type:none;
	}
	
	li.mainmenu ul{
		margin:0;
		list-style-type:none;
		padding:0;
	}
	
	.mainmenu a{
		width:200px;
		/* inline 요소를 block 요소로 변경 */
		display:block;
		background-color:#a50000;
		color:white;
		text-decoration:none;
		padding:10px;
		border-bottom:1px solid #ffffff;
	}
	
	ul#dropdownmenu li a:hover{
		background-color:#aaaaaa;
	}
</style>

<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("li.mainmenu ul").hide();
		
		$("li.mainmenu").on("mouseover", function(){
			// 자신의 자식 요소 중 ul 요소 화면에 보이게
			$("ul",this).stop().slideDown(500);
		});
		$("li.mainmenu").on("mouseout", function(){
			// 자신의 자식 요소 중 ul 요소 화면에 보이게
			$("ul",this).slideUp(500);
		});
	});
</script>
</head>
<body>
	<ul id="dropdownmenu">
		<li class="mainmenu">
			<a href="#">도서</a>
			<ul>
				<li><a href="#">JAVA</a></li>
				<li><a href="#">Oracle</a></li>
				<li><a href="#">JSP</a></li>
			</ul>
		</li>
		<li class="mainmenu">
			<a href="#">힐</a>
			<ul>
				<li><a href="#">스틸레토힐</a></li>
				<li><a href="#">웨지힐</a></li>
				<li><a href="#">플랫폼힐</a></li>
			</ul>
		</li>
	</ul>
</body>
</html>