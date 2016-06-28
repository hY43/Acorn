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
	table{
		text-align:center;
	}
	button{
		width:100%;
	}
</style>
</head>
<body>
	<%
		if(request.getParameter("dno")==null || request.getParameter("dno").equals("")){
			response.sendRedirect("deptListCheckBox.jsp");
		}else{
		DeptDAO dao = new DeptDAO(); // selectOne Method 호출을 위한 DeptDAO 객체 생성.
		DeptVO vo = dao.selectOne(Integer.parseInt(request.getParameter("dno")));
		// 전달 받은 파라미터 값을 이용하여 selectOne Method 호출.
	%>
	<h3>부서 정보</h3>
	<!-- deptListCheckBox 에서 수정 버튼을 누른 후 해당 dno와 매칭되는 row 출력. -->
	<!-- 수정 버튼을 누르면 입력된 수정 값을 갖고 modifyOk.jsp로 이동. -->
	<form action="modifyOk.jsp">
	<table>
		<tr>
			<th>부서번호</th>
			<th>부서명</th>
			<th>부서위치</th>
		</tr>
		<tr>
			<td>
			<input type="text" name="no" id="" value="<%=vo.getDeptno() %>"/>
			</td>
			<td>
			<input type="text" name="name" id="" value="<%=vo.getDname() %>"/>
			</td>
			<td>
			<input type="text" name="loc" id="" value="<%=vo.getLoc() %>"/>
			</td>
		</tr>
		<tr>
			<td colspan=3><input type="submit" value="수정" /></td>
		</tr>
	</table>
	</form>
	<%
		}
	%>
</body>
</html>