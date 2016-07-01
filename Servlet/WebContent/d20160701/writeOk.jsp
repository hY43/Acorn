<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	// 1. 파라미터 값 가져오기
	String writer = request.getParameter("writer");
	String title = request.getParameter("title");
	String contents = request.getParameter("contents");

	// 2. db에 저장
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	vo.setWriter(writer);
	vo.setTitle(title);
	vo.setContents(contents);
	dao.insertOne(vo);
	// 3. 목록으로 되돌아가기(boardList.jsp)
	response.sendRedirect("boardList.jsp");

%>