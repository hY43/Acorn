<%@page import="dao.DeptDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String dname = request.getParameter("dname");
	if(dname == null || dname.equals("")){
		response.sendRedirect("insertDataForm.jsp");
	}else{
	String loc = request.getParameter("loc");
	DeptDAO dao = new DeptDAO();
	dao.insertData(dname, loc);
	response.sendRedirect("showData.jsp");
	}
	
%>