<%@page import="java.io.File"%>
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
		String path = request.getRealPath("/upload");
		File f = new File(path);
		if(f.isDirectory()){
			String[] fList = f.list();
			for(String x : fList){
				%>
				<img src="../upload/<%=x %>" alt="<%=x %>" />
				<%				
				out.println("<h3>" + x + "</h3>");
			}
		}
	%>
</body>
</html>