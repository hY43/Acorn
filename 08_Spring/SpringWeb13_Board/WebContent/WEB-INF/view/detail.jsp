<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>

      <table class="table">
         <tr>
            <th>작성자</th>
            <td>${dto.writer}</td>
         </tr>
         <tr>
            <th>제목</th>
            <td>${dto.title }</td>
         </tr>
         <tr>
            <th>내용</th>
            <td id = "ir1" colspan="3">${dto.contents }</td>
         </tr>
         <tr>
            <td colspan="4">
            <a href="list.do" class="btn btn-defalt">목록</a>
            <a href="modify.do?no=${dto.no }" class="button">수정</a>
            <a href="delete.do?no=${dto.no }"><input type="button" value="삭제" /></a>
            </td>
                     
         </tr>
      </table>

</body>
</html>