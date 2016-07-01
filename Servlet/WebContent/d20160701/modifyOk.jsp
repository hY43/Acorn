<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String b = request.getParameter("bno");
	if(b==null || b.equals("")){
		response.sendRedirect("boardList.jsp");		
	}else{
		int bno = Integer.parseInt(b);
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		vo.setWriter(writer);
		vo.setTitle(title);
		vo.setContents(contents);
		dao.updateOne(vo);
		response.sendRedirect("boardList.jsp");
	}
%>