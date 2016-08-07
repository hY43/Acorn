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
		// request.getParameter의 반환 값은 String type
		String name = request.getParameter("name"); // Client로부터 전달 받은 name이 "name"인 Parameter의 값을 받아 name으로 대입.
		String loc = request.getParameter("loc"); // Client로부터 전달 받은 name이 "loc"인 Parameter의 값을 받아 name으로 대입.
		if(name==null || loc == null){
			// 아직 값을 받지 않은 경우.
	%>
	<h2>부서 정보 입력</h2>
	<form action="">
	<table>
		<tr>
			<th>부서명</th>
			<td>
				<input type="text" name="name" id="" />
			</td>
		</tr>
		<tr>
			<th>부서 위치</th>
			<td>
				<input type="text" name="loc" id="" />
			</td>
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
			// 값을 입력하여 submit한 경우.
			DeptDAO dao = new DeptDAO(); // insertOne Method 사용을 위한 DeptDAO 객체 생성.
			DeptVO vo = new DeptVO(); // insertOne Method의 매개 변수로 사용할 DeptVO 객체 생성.
			
			vo.setDname(name); // insert 하고자 하는 dname을 DeptVO 객체에 대입
			vo.setLoc(loc); // insert 하고자 하는 loc를 DeptVO 객체에 대입
			dao.insertOne(vo); // 값이 입력된 객체를 이용하여 insertOne Method 호출.
		}
	%>
</body>
</html>