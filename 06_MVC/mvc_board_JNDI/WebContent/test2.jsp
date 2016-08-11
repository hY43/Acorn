<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<sql:query var="rs" dataSource="jdbc/myoracle1">
	SELECT * FROM dept where deptno in(10,20)
</sql:query>
<table>
	<tr>
		<th>부서번호</th>
		<th>부서이름</th>
		<th>부서위치</th>
	</tr>
	<c:forEach var="row" items="${rs.rows }">
	<tr>
		<td>${row.deptno }</td>
		<td>${row.dname }</td>
		<td>${row.loc }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>