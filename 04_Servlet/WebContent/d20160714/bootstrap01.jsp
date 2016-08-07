<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!----------------------------------- bootstrap을 사용하기 위해 선언. ----------------------------------->
<!-- http://getbootstrap.com/ -->
<link rel="stylesheet" href="../css/bootstrap.css" />
<link rel="stylesheet" href="../css/bootstrap-theme.css" />
<!-- bootstrap는 jquery 기반으로 동작하기 때문에 반드시 jquery cdn을 추가해야 한다. -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript" src = "../js/bootstrap.js"></script>
<!------------------------------------------------------------------------------------------------------->
<style type="text/css">
	.col-md-1{
		background-color:#aaaaaa;
	}
</style>
</head>
<body>
<!--
	부트스트랩 그리드 시스템
	부트 스트랩은 격자 모양의 레이아웃을 갖는다.
	총 12개의 작은 컬럼으로 구성되어 있는데,
	
	클래스 명은
	xs: extra small: 작은 모바일 폰.
	sm: small : tablet
	md: middle : desktop
	lg: large : large desktop
-->
	<!-- 
		Body Tag의 기본 문자는 14px, 
		라인의 높이 1.428px, 
		p Tag는 라인 높이가 절반이면 문자는 10px 
	-->
	<div class="container">
		<div class="row">
			<!-- div.col-mid-1*12 -->
			<!-- 전체 12칸중 1칸차지 -->
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
			<div class="col-md-1">col-md-1</div>
		</div>
		<div class="row">
			<!-- 전체 12칸중 8칸차지 -->
			<div class="col-md-8">8칸</div>
			<!-- 전체 12칸중 4칸차지 -->
			<div class="col-md-4">4칸</div>
		</div>
		
		<!-- 6:6 크기로 2개의 영역을 추가 -->
		<div class="row">
			<div class="col-md-6">6칸</div>
			<div class="col-md-6">6칸</div>
		</div>
	</div>
</body>
</html>