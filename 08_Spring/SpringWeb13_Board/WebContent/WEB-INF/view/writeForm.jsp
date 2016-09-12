<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>2016. 9. 7. 오후 12:00:23</title>
<script src="https://code.jquery.com/jquery-3.1.0.js"
   integrity="sha256-slogkvB1K3VOkzAI8QITxV3VzpOnkeNVsKvtkYLMjfk="
   crossorigin="anonymous"></script>
<script src="//cdn.ckeditor.com/4.5.10/basic/ckeditor.js"></script>
<link rel="stylesheet" type="text/css"
   href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.2/css/bootstrap.min.css">
</head>
<body>
   <div class="container">
      <h2>writeForm.jsp</h2>
      <form action="writeOk.do" method="post">
         <table>
            <tr>
               <th>작성자</th>
               <td><input type="text" name="writer" id="" value="" /></td>
            </tr>
            <tr>
               <th>제목</th>
               <td><input type="text" name="title" id="" value="" /></td>
            </tr>
            <tr>
               <th>내용</th>
               <td><textarea name="contents" id="editor1" cols="30" rows="10"></textarea>
               </td>
            </tr>
            <script>
               // Replace the <textarea id="editor1"> with a CKEditor
               // instance, using default configuration.
               CKEDITOR.replace('editor1');
            </script>
         </table>
         <div>
         <input type="submit" class="btn btn-danger" value="작성" />
         <a href="boardList.do"><button
                        type="button" class="btn btn-info">뒤로</button></a>
         </div>
      </form>
   </div>

</body>
</html>