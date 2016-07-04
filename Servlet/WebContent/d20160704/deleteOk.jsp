<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//전 페이지에서 입력 받은 name이 bno인 값을 int type으로 변형하여 변수 bno에 대입.
	// bno를 입력 받는 이유는 deleteOne의 인자로 bno가 필요하기 때문.
	int bno = Integer.parseInt(request.getParameter("bno"));
	
	// bno가 입력되지 않거나 공백이 입력된다면 boardList.jsp로 이동.
	if(request.getParameter("bno")==null || request.getParameter("bno").equals("")){
		response.sendRedirect("boardList.jsp");
	}
	/* deleteOne 사용을 위해 BoardDAO 객체 생성 */ 
	BoardDAO dao = new BoardDAO();
	
	// 매개변수 bno를 사용하여 deleteOne 호출
	dao.deleteOne(bno);
	// boardList.jsp 로 이동.
	response.sendRedirect("boardList.jsp");
%>