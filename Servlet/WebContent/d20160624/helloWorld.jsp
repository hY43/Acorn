<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- HTML 주석: Browser에서 확인 가능 --> 
	<%-- JSP 주석: Browser에서 확인 불가능 --%>
	
	<hr>
	<% 
	// C:\eclipse\webWorkspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\webBasic\org\apache\jsp\d20160624
	// 파일을 저장하면 scriptlet내의 코드는 위의 경로에 servlet으로 변환되어 java/class 파일로 생성된다 
		int c = a + b;
		// servlet로 변환되면서 out은 _jspService Method에 선언되기 때문에 따로 선언 없이 사용할 수 있는 것이다.
		// 자동으로 선언되는 out, session과 같은 변수를 JSP 내장 객체라고 한다.
		out.println("합계: " + c);
	%>
		<h3>합계는 <%=c %></h3>
	<%!
		// 컴파일하면서 전역 변수로 선언된다.
		int a = 20;
		int b = 10;
	%>
</body>
</html>