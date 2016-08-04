<%@page import="kr.co.kitcoop.dao.EmpDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String e = request.getParameter("empno");

	if(e!=null){
		int empno=0;
		String job = null;
		int sal = 0;
		String ename = null;
		
		String n = request.getParameter("ename");
		String s = request.getParameter("sal");
		String j = request.getParameter("job");

		if(n != null && !n.equals("")){
			ename = n;
		}
		if(e != null && !e.equals("")){
			empno = Integer.parseInt(e);
		}
		if(j != null && !j.equals("")){
			job = j;
		}
		if(s != null && !s.equals("")){
			sal=Integer.parseInt(s);
		}
		EmpDAO dao = new EmpDAO();
		dao.modify(empno, ename, sal, job);
		response.sendRedirect("empList.jsp");	
	}

%>