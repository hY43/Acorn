
<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDAO dao = new BoardDAO();
	BoardVO vo = new BoardVO();
	// 전달 받은 파라미터의 값들을 이용하여 updateOne Method 실행에 필요한 값들을 BoardVO 객체 대입.
	vo.setBno(Integer.parseInt(request.getParameter("bno")));
	vo.setTitle(request.getParameter("title"));
	vo.setWriter(request.getParameter("writer"));
	vo.setContents(request.getParameter("ir1"));
	
	// 생성한 BoardVO 객체를 이용하여 updateOne Method 호출 
	dao.updateOne(vo);
	// 호출 완료 후, boardList.jsp로 이동.
	response.sendRedirect("boardList.jsp");
%>