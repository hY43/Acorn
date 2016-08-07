<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table, td{
		border:1px solid white;
		text-align:center;
		background-color: green;
		color:white;
	}
	table{
		width:300px;
	}
	#tr1{
		
	}
</style>
</head>
<body>
	<table>
		<tr id="tr1">
			<td colspan="1">당신이 선택한 걸그룹은?</td>
		</tr>
		<%
			/* Date date = new Date(); */
			Date date = new Date();
			/* import 방법. */
			// 1. java.util.Date date = new java.util.Date();
			// 2. Date 뒤에 커서 위치 시키고 ctrl+space 눌러서 관련 package 선택하면 코드의 상단부에 자동으로 import된다.
			
			request.setCharacterEncoding("UTF-8");
			String[] girl = request.getParameterValues("group");
			for(String x : girl){
		%>
		<tr>
			<td><%=x%></td>
		</tr>
		<%
			}
		%>
		
	</table>	
</body>
</html>