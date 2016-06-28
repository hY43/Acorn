<%@page import="vo.EmpVO"%>
<%@page import="dao.EmpDAO"%>
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
	table, th, td{
		border:1px solid;
	}
	table{
		text-align:center;
	}

</style>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String sal = request.getParameter("sal");
		String job = request.getParameter("job");
		String deptno = request.getParameter("deptno");
		
		if(name==null || job == null || deptno == null){
	%>
	<h2>부서 정보 입력</h2>
	<form action="">
	<table>
			<tr>
				<th>사원명</th>
				<td><input type="text" name="name" id="" /></td>
			</tr>
			<tr>
				<th>직무</th>
				<td><input type="text" name="job" id="" /></td>
			</tr>
			<tr>
				<th>연봉</th>
				<td><input type="text" name="sal" id="" /></td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="deptno" id="" /></td>
			</tr>
			<tr>
			<td colspan=2>
				<input type="submit" name="입력" id="" />
			</td>
		</tr>
	</table>
	</form>
	<%
		}else{
			EmpDAO dao = new EmpDAO();
			EmpVO vo = new EmpVO();
			vo.setEname(name);
			vo.setSal(Integer.parseInt(sal));
			vo.setJob(job);
			vo.setDeptno(Integer.parseInt(deptno));
			dao.insertOne(vo);
		}
	%>
</body>
</html>