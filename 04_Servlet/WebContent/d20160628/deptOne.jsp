<%@page import="vo.DeptVO"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table,th,td{
		border:1px solid;
	}
</style>
</head>
<body>
	<%
		/* no parameter의 값 출력 */
		if(request.getParameter("no") == null){
	%>

	<form action="">
		<h3>부서정보 검색</h3>
		<input type="text" name="no" id="" />
		<input type="submit" value="검색하기" />
	</form>
	<%
		}else{
			int deptno = Integer.parseInt(request.getParameter("no")); // name이 "no"인 parameter의 값을 받아 int로 변환, 변수 deptno에 대입.
			DeptDAO dao = new DeptDAO(); // selectOne Method 호출을 위한 DeptDAO 객체 생성.
			DeptVO vo = dao.selectOne(deptno); // selectOne Method 호출.
		
	%>
		<table>
			<tr>
				<th>부서번호</th>
				<th>부서명</th>
				<th>부서위치</th>
			</tr>
			<tr>
				<td><%=vo.getDeptno() %></td>
				<td><%=vo.getDname() %></td>
				<td><%=vo.getLoc() %></td>
			</tr>
		</table>
	
	<%
		}
	%>
</body>
</html>