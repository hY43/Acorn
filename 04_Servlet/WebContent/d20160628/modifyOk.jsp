<%@page import="vo.DeptVO"%>
<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 입력 받은 값으로 update문을 실행하기 위한 페이지 -->
	<%
	if(request.getParameter("dno")==null || request.getParameter("dno").equals("")){
	%>
	<h3>비정상적인 경로의 접근입니다.</h3>
	<a href="deptListCheckBox.jsp">목록가기</a>
	<%
	}else{
		DeptDAO dao = new DeptDAO();
		DeptVO vo = new DeptVO();
	
		vo.setDeptno(Integer.parseInt(request.getParameter("dno"))); // name이 "dno"인 값을 받아 DeptVO 객체의 deptno에 대입
		vo.setDname(request.getParameter("name")); // name이 "name"인 값을 받아 DeptVO 객체의 name에 대입
		vo.setLoc(request.getParameter("loc")); // name이 "loc"인 값을 받아 DeptVO 객체의 loc에 대입
		dao.updateOne(vo); // updateOne Method 호출
		response.sendRedirect("deptListCheckBox.jsp");
	}
	%>

</body>
</html>