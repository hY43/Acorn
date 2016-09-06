<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.do" method="post">
		<table>
			<tr>
				<th>사원번호</th>
				<td><input type="text" name="empno" id="empno" /></td>
			</tr>
			<tr>
				<th>사원명</th>
				<td><input type="text" name="ename" id="ename" /></td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="deptno" id="deptno" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="추가" /></td>
			</tr>
		</table>
	</form>
</body>
</html>