<%@page import="vo.GuestBookVO"%>
<%@page import="dao.GuestBookDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	GuestBookDAO dao = new GuestBookDAO();
	GuestBookVO vo = new GuestBookVO();
	
	vo.setGno(Integer.parseInt(request.getParameter("gno")));
	vo.setWriter(request.getParameter("writer"));
	vo.setContents(request.getParameter("contents"));
	
	dao.updateOne(vo);
	response.sendRedirect("list.jsp");
%>