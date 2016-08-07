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
	/* dno 라는 파리미터의 값을 숫자로 가져오기. */
	if (request.getParameter("dno") != null || !request.getParameter("dno").equals("")) {
		int dno = Integer.parseInt(request.getParameter("dno")); // name이 "dno"인 Parameter의 값을 받아 int Type으로 변환하고, 변수에 대입.
		DeptDAO dao = new DeptDAO(); // deleteOne Method 사용을 위한 DeptDAO 객체 생성.
		dao.deleteOne(dno); // 전달 받은 deptno를 이용하여 deleteOne Method 호출.
		dao.close(); // 자원 반납.
	}
	/* RequestDispatcher rd = request.getRequestDispatcher("deptList2.jsp");
	rd.forward(request, response); */
	response.sendRedirect("deptListCheckBox.jsp"); // 별도의 전달 값을 저장하지 않고 deptListCheckBox.jsp로 이동.
%>

</body>
</html>