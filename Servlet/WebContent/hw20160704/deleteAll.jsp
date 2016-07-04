<%@page import="dao.GuestBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] list = request.getParameterValues("check");
	GuestBookDAO dao = new GuestBookDAO();
	for(String gno : list){
		dao.deleteOne(Integer.parseInt(gno));
	}
	response.sendRedirect("list.jsp");
%>