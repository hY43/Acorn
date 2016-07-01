<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table, th, td{
		border:1px solid black;
		border-collapse: collapse;
	}
	table{
		width:800px;
		margin: 0 auto;
		text-align:center;	
	}
	tr{
		height:50px;
	}
</style>
</head>
<body>
	<form action="writeOk.jsp">
		<table>
			<caption>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer" id="" /></td>
				</tr>
				<tr>
					<th>제목</th>
					<td><input type="text" name="title" id="" size="50px"/></td>
				</tr>
				<tr>
					<th>내용</th>
					<td><textarea name="contents" id="" cols="90" rows="20"></textarea></td>
				</tr>
				<tr>
					<td colspan=2>
					<input type="submit" value="글쓰기" />
					<input type="button" value="되돌아가기" />
					</td>
				</tr>
			</caption>
		</table>
	</form>
</body>
</html>