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

<%
	String[] dno = request.getParameterValues("check"); // checkbox에 check된 항목들의 deptno를 전달 받아 string 배열에 각 항목을 저장.
	DeptDAO dao = new DeptDAO(); // deleteOne Method 사용을 위한 DeptDAO 객체 생성. 
	for(String d: dno){ // 각 deptno의 삭제를 위해 향상된 for문 사용.
		dao.deleteOne(Integer.parseInt(d)); // getParameter류의 Method는 반환형이 String이기 때문에 int형으로의 변환하여 deleteOne Method 호출.
	}
	dao.close(); // 자원 반납.
	response.sendRedirect("deptListCheckBox.jsp"); // 작업이 끝나면, 아무런 값도 전달하지 않고 deptListCheckBox.jsp로 이동
%>

</body>
</html>