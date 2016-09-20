<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		// 이메일 검증
		$("input[type='button']").on("click", function(){
			var email = $("#email").val();
			var pattern = /^[a-zA-z0-9_\-\.]+@[a-zA-z0-9_\-]+\.[a-zA-z0-9]{2,}/;
			var result = email.match(pattern);
			if(!result){
				console.log("올바른 형식의 이메일이 아닙니다.");
				$("#warnEmail").show().css("color","red");
				$("#confirmEmail").css("display","none");
				return ;
			}
			console.log(email + " 올바른 형식의 이메일 입니다.");
			$("#confirmEmail").show();
			$("#warnEmail").css("display","none");
		})


	})
	
	// 태그 지우기
	function removeTags(input){
		return input.replace(/<[^>]+>/g, "");
	}
	var test = "<h1>test</h1>";
	var result = removeTags(test);
	console.log(result);
	
	// 공백 제거
	String.prototype.trim = function(){
		return this.replace(/\s+|\s+$/g, "");
	};
	var test = "     aaa    bbb    ccc ";

	console.log(test);
	test = test.trim();
	console.log(test);
</script>

</head>
<body>
	email: <input type="text" name="email" id="email" /><br />
	<input type="button" value="확인" />
	<div id="warnEmail" style="display:none">
		<h3>잘못된 이메일 형식입니다.</h3>
	</div>
	<div id="confirmEmail" style="display:none">
		<h3>올바른 이메일 형식입니다.</h3>
	</div>
	
</body>
</html>