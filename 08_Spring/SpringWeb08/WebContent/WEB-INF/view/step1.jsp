<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script>

	$(function(){
		$("#btn").on("click", function(){
			if($("#agree").prop("checked") == true){
				location.href = "step2.do";
			}else{
				alert("약관동의에 체크하세요");
			}
		})
	})

</script>

</head>
<body>
	<h1>회원가입</h1>
	<h3>약관동의</h3>
	<textarea name="" id="" cols="30" rows="10">
		당신의 소중한 개인정보는 우리 회사의 이익을 위해서 마음대로 사용하겠습니다. 하하하.
		개인정보 냠냠 감사합니다.		
	</textarea>
	
	<form action="frm">
		<input type="checkbox" name="ck" id="agree" value="true"/>약관동의
		<input type="button" id="btn" value="다음"/>
	</form>
</body>
</html>