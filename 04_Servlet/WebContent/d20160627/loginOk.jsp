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
		/* jsp 파일이 서블릿으로 변환될때, scriptlet 안쪽에 코드는 _jspService() 안쪽으로 들어가게 된다.
		이때 _jspService()안에 미리 선언되어 있는 변수가 있는데 이러한 변수를 내장 객체라고 한다. */
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	%>
	
	<h2>입력하신 값은 <%=id %>: <%=pw %></h2>
	<!-- id가 aaa pw가 bbb 이면 로그인 처리 하려고한다. 만약 다른 값이 들어오면 login.jsp로 이동시킨다. -->
	<%
		if(id.equals("aaa") && pw.equals("bbb")){
			out.println("<h2>로그인 성공</h2");
		}else{
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>