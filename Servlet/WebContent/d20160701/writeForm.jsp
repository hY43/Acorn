<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,td{
		border: 1px solid black;
	}
	img{
		width:40px;
		height:40px;
	}
	table{
			width:800px;
			text-align:center;
	}

</style>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
</head>
<body>
	<form action="writeOk.jsp">
	<table>
		<tr>
			<td>작성자</td>
			<td colspan=4>
				<input type="text" name="writer" id="writer" />
			</td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan=4>
				<input type="text" name="title" id="title" />
			</td>
		</tr>
		<tr>
			<td>내용</td>
			<td colspan=4>
				<textarea name="contents" id="" cols="100" rows="20">
				</textarea>
			</td>
		</tr>
		<tr>
			<td colspan=4>
				<input type="submit" value="글쓰기" />
				<a href="boardList.jsp"><input type="button" value="돌아가기" /></a>
			</td>
		</tr>
	</table>
	</form>
</body>
</html>