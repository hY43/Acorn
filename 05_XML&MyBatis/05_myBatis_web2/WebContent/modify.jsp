<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
	String e = request.getParameter("empno");

	if(e!=null){
		int empno = Integer.parseInt(e);
	
%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="modifyOk.jsp">
		<input type="hidden" name="empno" value=<%=empno %> />
		<input type="text" name="ename" placeholder="변경할 이름" />
		<input type="text" name="sal" placeholder="수정할 급여" />
		<input type="text" name="job" placeholder="변경할 직책" />
		<input type="submit" value="수정하기" />
	</form>
<%
	}
%>
</body>
</html>