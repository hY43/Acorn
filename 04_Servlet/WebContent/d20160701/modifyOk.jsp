
<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	vo.setBno(Integer.parseInt(request.getParameter("bno")));
	vo.setTitle(request.getParameter("title"));
	vo.setWriter(request.getParameter("writer"));
	vo.setContents(request.getParameter("contents"));
	dao.updateOne(vo);
	response.sendRedirect("boardList.jsp");
%>