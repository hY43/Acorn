<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	
	DeptDAO dao = new DeptDAO();
	dao.deleteData(deptno);
	response.sendRedirect("showData.jsp");
%>