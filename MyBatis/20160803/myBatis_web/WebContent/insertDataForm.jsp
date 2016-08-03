<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="insertDataOk.jsp">
	<table>
		<tr>
			<th>부서이름</th>
			<th>부서위치</th>
		</tr>
		<tr>
			<td colspan="2">
				<input type="text" name="dname" id="dname" />
				<input type="text" name="loc" id="loc" />
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="저장" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>