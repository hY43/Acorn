<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, th, td {
	border: 1px solid black;
}

h2 {
	text-align: center;
	margin: 0 auto;
}

table {
	margin: 0 auto;
	text-align: center;
}

th, td {
	width: 100px;
}

#select {
	width: 50px;
}
</style>

</head>
<body>
	<form action="writeOk.jsp">
	<table>
		
		<tr>
			<th>작성자</th>
			<td><input type="text" name="writer" id="" /></td>
			<th>작성일자</th>
			<td></td>
		</tr>
		<tr>
			<td colspan=4>
				<textarea name="contents" id="" cols="100px" rows="40px" ></textarea>
			</td>
		</tr>
		<tr>
			<td colspan=4>
				<input type="submit" value="save" />
				<input type="button" value="list" />
			</td>
		</tr>
	</table>
	</form>
</body>
</html>