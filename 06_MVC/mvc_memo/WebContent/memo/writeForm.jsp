<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<style type="text/css">
	*{margin: 0; padding: 0; box-sizing: border-box; text-decoration: none; color: #a1a2a3;}
	legend{display: none;}
	fieldset{border: none;}
	strong{font-size: 14px; color: #a1a2a3;}
	textarea{resize: none; width: 90%; height: 60px; padding: 5px; border: 1px solid #d9d9d9;}
	/* commentWrite */
	.commenteWriteForm{width: 70%; margin: 30px auto; padding: 5px 20px 20px; border: 1px solid #e9e9e9; background-color: #fbfafa; color: #353535;}
	.commenteWriteForm .commentWriteTop1{width: 100%; padding: 10px 0;}
	.commenteWriteForm .commentWriteTop2{width: 100%; padding: 10px 0;}
	.commenteWriteForm .commentWriteTop2 input{width: 140px; padding: 4px 5px; margin-right: 15px; border: 1px solid #d9d9d9;}
	.commenteWriteForm .writeBtn{display: inline-block; width: 9%; height: 60px; float: right; border: none; background: #ff8c8c; color: #fff; cursor: pointer;}
	.commenteWriteForm .writeBtn:hover{background: #ff6f6f;}
	.button{display: inline-block; float: right;}
	.button .btn_blue{display: inline-block; float: left; line-height: 1; padding: 5px 5px; font-size: 12px; color: #1689e2; background: #fff; border: 1px solid #ccc;}
	.button .btn_blue:hover{color: #fff; background: #1689e2; border: 1px solid #1689e2;}
	.button .btn_red{display: inline-block; float: left; line-height: 1; margin-left: -1px; padding: 5px 5px; font-size: 12px; color: #e61717; background: #fff; border: 1px solid #ccc;}
	.button .btn_red:hover{color: #fff; background: #e61717; border: 1px solid #e61717;}
</style>
</head>
<body>

	<form id="commentWriteForm" class="commenteWriteForm" name="" action="memo.do" method="post">
		<!-- 댓글권한 있음 -->
		<div class="">
			<fieldset>
				<legend>댓글 입력</legend>
				<div>
					<div class="commentWriteTop1">
						<strong>댓글달기</strong>
					</div>
					<div class="commentWriteTop2">
					<input type="hidden" name="cmd" value="writeOk"/>
	
						<strong>이름 :</strong>
						<input id="comment_name" name="writer" class="inputTypeText" value="" type="text" />
						<strong>비밀번호 :</strong>
						<input id="comment_password" name="pw" value="" type="password" />
					</div>
				</div>
				<div class="view">
					<textarea id="comment" name="contents"></textarea>
					<button type="submit" class="writeBtn">글쓰기</button>
				</div>
			</fieldset>
		</div>
	</form>

</body>
</html>