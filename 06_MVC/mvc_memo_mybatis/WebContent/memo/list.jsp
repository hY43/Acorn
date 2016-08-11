<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
   
   $(document).ready(function(){
/*       $('.modifyBtn').on('click', function(){
         $('.commentForm').toggle();
      }); */
      
   });
   function modifyFun(obj){
	   console.dir(obj);
   }
</script>
<style type="text/css">
   *{margin: 0; padding: 0; box-sizing: border-box; text-decoration: none; color: #a1a2a3;}
   legend{display: none;}
   fieldset{border: none;}
   strong{font-size: 14px; color: #a1a2a3;}
   .commentBox{width: 70%; border: 1px solid #ccc; border-top: none; margin: 5% auto 0;}
   .commentBox textarea, .commenteWriteForm textarea{resize: none; width: 90%; height: 60px; padding: 5px; border: 1px solid #d9d9d9;}
   .commentBox ul{}
   .commentBox ul li{width: 100%; border-top: 1px solid #ccc;}
   .commentBox ul li .commentTop{overflow: hidden; padding: 10px 20px;}
   .commentBox ul li .commentTop .no{font-size: 10px; margin-right: 15px;}
   .commentBox ul li .commentTop .name{font-size: 14px;}
   .commentBox ul li .commentTop .date{font-size: 12px; margin-left: 10px;}
   .commentBox ul li .commentForm{display: none; padding: 10px 20px 20px; border: 1px solid #e9e9e9; border-bottom: none; background: #fbfafa;}
   .commentBox ul li .commentForm .commentFormTop{padding: 10px 0;}
   .commentBox ul li .commentForm input{width: 140px; padding: 4px 5px; margin-right: 15px; border: 1px solid #d9d9d9;}
   .commentBox ul li .commentForm .view{}
   .commentBox ul li .commentForm .view textarea{width: 80%; float: left;}
   .commentBox ul li .commentForm .view .submit{width: 20%; float: left; text-align: right;}
   .commentBox ul li .commentForm .view .submit button{width: 45%; height: 60px; color: #fff; border: none; cursor: pointer;}
   .commentBox ul li .commentForm .view .submit button.modifyOkBtn{background: #fa8072;}
   .commentBox ul li .commentForm .view .submit button.modifyOkBtn:hover{background: #ff5050;}
   .commentBox ul li .commentForm .view .submit button.cancelBtn{background: #a9a9a9;}
   .commentBox ul li .commentForm .view .submit button.cancelBtn:hover{background: #6f6f6f;}
   
   .commentBox ul li .comment{padding: 20px 20px 60px; line-height: 1.5; border-top: 1px solid #ccc; font-size: 14px;}
   
   /* commentWrite */
   .commenteWriteForm{padding: 5px 20px 20px; border: 1px solid #e9e9e9; background-color: #fbfafa; color: #353535;}
   .commenteWriteForm .commentWriteTop1{width: 100%; padding: 10px 0;}
   .commenteWriteForm .commentWriteTop2{width: 100%; padding: 10px 0;}
   .commenteWriteForm .commentWriteTop2 input{width: 140px; padding: 4px 5px; margin-right: 15px; border: 1px solid #d9d9d9;}
   
   .commenteWriteForm .writeBtn{display: inline-block; width: 9%; height: 60px; float: right; border: none; background: #fa8072; color: #fff; cursor: pointer;}
   .commenteWriteForm .writeBtn:hover{background: #ff5050;}

   .button{display: inline-block; float: right;}
   .button .btn_blue{display: inline-block; float: left; line-height: 1; padding: 5px 5px; font-size: 12px; color: #1689e2; background: #fff; border: 1px solid #ccc;}
   .button .btn_blue:hover{color: #fff; background: #1689e2; border: 1px solid #1689e2;}
   .button .btn_red{display: inline-block; float: left; line-height: 1; margin-left: -1px; padding: 5px 5px; font-size: 12px; color: #e61717; background: #fff; border: 1px solid #ccc;}
   .button .btn_red:hover{color: #fff; background: #e61717; border: 1px solid #e61717;}
</style>
</head>
<body>
<div class="commentBox">
   <ul>
      <c:forEach var="vo" items="${list}">
      <li>
         <div class="commentTop">
            <span class="no">${vo.no}</span>
            <strong class="name">${vo.writer}</strong>
            <span class="date">${vo.wdate}</span>
            <div class="button">
               <button class="modifyBtn btn_blue">수정</button>
               <button class="deleteBtn btn_red">삭제</button>
            </div>
         </div>
         <!-- 댓글 수정 Start -->
         <form id="commentForm" class="commentForm" name="" action="" method="post" enctype="multipart/form-data">
            <input id="board_no" name="board_no" value="" type="hidden">
            <input id="member_id" name="member_id" value="" type="hidden">
            <div id="${vo.no }">
               <fieldset>
                  <legend>댓글 수정</legend>
                  <div class="commentFormTop">
                     <strong>비밀번호 :</strong>
                     <input id="comment_password" name="comment_password" value="" type="password">
                  </div>
                  <div class="view">
                     <textarea id="comment_modify" name="comment_modify"></textarea>
                     <div class="submit">
                        <button type="button" class="modifyOkBtn btn_blue" onclick="modifyFun(this)">수정</button>
                        <button type="button" class="cancelBtn btn_red">취소</button>
                     </div>
                  </div>               
               </fieldset>
            </div>
         </form>
  			<!-- 댓글 수정 End -->
         <div class="comment">
            ${vo.contents}
         </div>
      </li>
      </c:forEach>
   </ul>
   
   <form id="commentWriteForm" class="commenteWriteForm" name="" action="" method="post">
      <!-- 댓글권한 있음 -->
      <div class="">
         <fieldset>
            <legend>댓글 입력</legend>
            <div>
               <div class="commentWriteTop1">
                  <strong>댓글달기</strong>
               </div>
               <div class="commentWriteTop2">
                  <strong>이름 :</strong>
                  <input id="comment_name" name="comment_name" class="inputTypeText" value="" type="text" />
                  <strong>비밀번호 :</strong>
                  <input id="comment_password" name="comment_password" value="" type="password" />
               </div>
            </div>
            <div class="view">
               <textarea id="comment" name="comment"></textarea>
               <button type="button" class="writeBtn">글쓰기</button>
            </div>
         </fieldset>
      </div>
   </form>
</div>
</body>
</html>