<%@page import="kr.co.kitcoop.dao.EmpDAO"%>
<%@page import="kr.co.kitcoop.vo.EmpVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String ename = request.getParameter("ename");
	String job = request.getParameter("job");
	int mgr = Integer.parseInt(request.getParameter("mgr"));
	int sal = Integer.parseInt(request.getParameter("sal"));
	int comm = Integer.parseInt(request.getParameter("comm"));
	int deptno = Integer.parseInt(request.getParameter("deptno"));
	
	EmpDAO dao = new EmpDAO();
	dao.insertData(ename, job, mgr, sal, comm, deptno);
%>