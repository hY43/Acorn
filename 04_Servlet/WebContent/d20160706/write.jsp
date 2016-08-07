<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table,td,th{
			border:1px solid black;
		}
		table{
			width:400px;
			text-align:center;
		}
		th{
			width:200px;
		}
	</style>
</head>
<body>
	<!-- http://www.servlets.com/cos -->
	<!-- cos-26Dec2008\lib\cos.jar -> WebContent\WEB-INF\lib 로 복사-->
	<form action="result.jsp" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<th>제목</th>
				<td>
					<input type="text" name="title" id="" />
				</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" id="" /></td>
			</tr>
			<tr>
				<th>내용</th>
				<td>
					<textarea name="contents" id="" cols="30" rows="10"></textarea>
				</td>
			</tr>
			<tr>
				<th>첨부파일</th>
				<td>
					<input type="file" name="filename" id="" />
				</td>
			</tr>
			<tr>
				<td colspan=2>
					<input type="submit" value="글쓰기" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>