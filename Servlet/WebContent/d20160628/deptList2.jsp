<%@page import="vo.DeptVO"%>
<%@page import="java.util.ArrayList"%>
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
		border:1px solid black;
		border-collapse: collapse;
	}
	table{
		text-align:center;
	}
</style>
</head>
<body>
<%
	DeptDAO dao = new DeptDAO(); // selectAll Method 사용을 위한 DeptDAO 객체 생성.

	// Testing selectAll Method
	ArrayList<DeptVO> list = dao.selectAll(); // selectAll Method 호출 후, 반환된 DeptVO Type의 ArrayList 저장.
%>
<h1>부서 정보</h1>
<!-- table>(tr>th*3)+(tr>td*3) -->
<table>
	<tr>
		<th>부서번호</th>
		<th>부서이름</th>
		<th>부서위치</th>
		<th>삭제버튼</th>
		<th>수정버튼</th>
	</tr>
<%
	for(DeptVO vo : list){
		// selectAll Method의 결과를 향상된 for문을 사용하여 각각의 row별로 Table로 출력.
%>
	<tr>
		<td><%=vo.getDeptno() %></td>
		<td><%=vo.getDname() %></td>
		<td><%=vo.getLoc() %></td>
		<td>
		<!-- 삭제 버튼을 클릭하면 parameter로 해당 row의 dno값을 갖고 href에 기록된 경로로 이동 -->
		<a href="./deleteDept.jsp?dno=<%=vo.getDeptno() %>">
		<input type="button" value="삭제" />
		</a>
		</td>
		<td>
		<!-- 수정 버튼을 클릭하면 parameter로 해당 row의 dno값을 갖고 href에 기록된 경로로 이동 -->
		<a href="./modifyDept.jsp?dno=<%=vo.getDeptno() %>">
		<input type="button" value="수정" />
		</a>
		</td>
	</tr>
<%
	}
%>
</table>

</body>
</html>