<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script src="//cdn.ckeditor.com/4.5.10/basic/ckeditor.js"></script>
<script type="text/javascript">
   window.onload = function(){
      CKEDITOR.replace('contents');
   }
</script>
<style type="text/css">
   *{box-sizing: border-box;}
   textarea{resize: none; width: 100%;}
   .wrap{width: 60%; margin: 50px auto 0; border: 1px solid pink;}
   .writeTop{width: 100%; padding: 20px; border-bottom: 1px solid #eee;}
   .writeBottom{width: 100%; padding: 20px;}
   .writeBottom button{display: block; margin: 10px auto 0;}
</style>
</head>
<body>
	<h1>modifyForm.jsp</h1>
	<!--
   board.do?cmd=writeOk
   writer, title, contents 전송
   WriteOkCommand()에서 DB에 저장
   ListCommand()호출
   -->
	<div class="wrap">
		<form action="board.do" method="post">
			<div class="writeTop">
				<input type="hidden" name="cmd" value="writeOk" /> 
				<label for="writer">작성자</label> 
				<input type="text" name="writer" id="writer" value="${vo.writer }"/> 
				<label for="title">제목</label> 
				<input type="text" name="title" id="title" value="${vo.title }"/>
			</div>
			<div class="writeBottom">
				<textarea name="contents" id="contents" rows="10" cols="80">${vo.contents }</textarea>
				<button type=submit>수정</button>
			</div>
		</form>
	</div>
</body>
</html>