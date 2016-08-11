<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	.commentBox{width: 70%; border: 1px solid #ccc; border-top: none; margin: 30px auto;}
	.commentBox textarea, .commenteWriteForm textarea{resize: none; width: 90%; height: 60px; padding: 5px; border: 1px solid #d9d9d9;}
	.commentBox ul{}
	.commentBox ul li{width: 100%; border-top: 1px solid #ccc;}
	.commentBox ul li .commentTop{overflow: hidden; padding: 10px 20px;}
	.commentBox ul li .commentTop .name{font-size: 14px;}
	.commentBox ul li .commentTop .date{font-size: 12px; margin-left: 10px;}
	.commentBox ul li .comment{padding: 20px 20px 35px; line-height: 1.5; border-top: 1px solid #ccc; font-size: 14px;}
	
	.button{display: inline-block; float: right;}
	.button .btn_blue{display: inline-block; float: left; line-height: 1; padding: 5px 5px; font-size: 12px; color: #1689e2; background: #fff; border: 1px solid #ccc;}
	.button .btn_blue:hover{color: #fff; background: #1689e2; border: 1px solid #1689e2;}
	.button .btn_red{display: inline-block; float: left; line-height: 1; margin-left: -1px; padding: 5px 5px; font-size: 12px; color: #e61717; background: #fff; border: 1px solid #ccc;}
	.button .btn_red:hover{color: #fff; background: #e61717; border: 1px solid #e61717;}
	
	.writeBtn{display: inline-block; width: 9%; height: 60px; border: none; background: #ff8c8c; color: #fff; cursor: pointer; position:absolute; right:240px;float: right}
	 #btn_s{overflow:hidden; width:70%;margin:auto;height: 50px;}
	
</style>
</head>
<body>
	<div id=btn_s>
		<a href="memo.do?cmd=writeForm"><button type="button" class="writeBtn">새글 작성</button></a>
	</div>
	<div class="commentBox">
		<ul>
			<c:forEach var="vo" items="${list}">
				<li>
					<div class="commentTop">
						<strong class="name">${vo.writer }</strong> <span class="date">${vo.wdate }</span>
						<div class="button">
							<a href="memo.do?cmd=modifyForm"></a><button class="modifyBtn btn_blue">수정</button>
							<button class="deleteBtn btn_red">삭제</button>
						</div>
					</div>

					<div class="comment">${vo.contents }</div>
				</li>
			</c:forEach>
		</ul>
	</div>

</body>
</html>