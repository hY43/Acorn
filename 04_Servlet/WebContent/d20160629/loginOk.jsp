<%@page import="vo.MemberVO"%>
<%@page import="dao.MemberDAO"%>
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
</style>
</head>
<body>
	<%
		/* jsp 파일이 서블릿으로 변환될때, scriptlet 안쪽에 코드는 _jspService() 안쪽으로 들어가게 된다.
		이때 _jspService()안에 미리 선언되어 있는 변수가 있는데 이러한 변수를 내장 객체라고 한다. */
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	%>
	
	<%
		MemberDAO dao = new MemberDAO();
		MemberVO vo = dao.selectOne(id,pw);
			
		if (vo != null) {
			// session id를 name 속성에 대입 후, 속성 값이 유지되는 동안은 로그인 상태 역시 유지 된다.
			session.setAttribute("id", vo.getId());
			session.setAttribute("name", vo.getName());
	%>
		<h2><%=vo.getName() %>님 환영합니다.</h2>
		<a href="login.jsp">메인화면 가기</a>
		<table>
			<tr>
				<th>ID</th>
				<th>PW</th>
				<th>NAME</th>
				<th>TEL</th>
				<th>EMAIL</th>
			</tr>
			<tr>
				<td><%=vo.getId() %></td>
				<td><%=vo.getPw() %></td>
				<td><%=vo.getName() %></td>
				<td><%=vo.getTel() %></td>
				<td><%=vo.getEmail() %></td>
			</tr>
		</table>
	<%
		} else {
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>