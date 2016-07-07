<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	/* DB에 가서 해당 아이디가 존재하는지 여부를 판단해서 Flag로 출력 */
	String name = request.getParameter("name");
	boolean flag = false;
	if(name==null || name.equals("")){
		out.println("id를 입력하세요");
	}else{
		MemberDAO dao = new MemberDAO();
		flag = dao.isExist(name);
		out.println(flag);
	}
%>