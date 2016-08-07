<%@page import="vo.PhotoBoardVO"%>
<%@page import="dao.PhotoBoardDAO"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// upload Directory의 실제 경로.
		String savDir = request.getRealPath("/upload");
		out.println(savDir);
		// 첨부 파일의 최대 크기
		int maxFileSize = 1024*1024*10; // 10MB
		// MultipartRequest(요청 객체, 저장 디렉토리, 최대 파일 크기, 인코딩 타입, 동일한 파일 명 처리 규정 객체)
		MultipartRequest mr = new MultipartRequest(request, savDir, maxFileSize, "UTF-8", new DefaultFileRenamePolicy());
		
 		String title = mr.getParameter("title");
		String writer = mr.getParameter("writer");
		String contents = mr.getParameter("contents");
		String filename = mr.getOriginalFileName("filename");
		
		PhotoBoardDAO dao = new PhotoBoardDAO();
		PhotoBoardVO vo = new PhotoBoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContents(contents);
		vo.setFilename("../upload/" + filename);
		dao.insertOne(vo);
	%>
	
	제목: <%=title %>
	작성자: <%=writer %>
	내용: <%=contents %>
	파일명: <%=filename %>
	
	<!-- DB에거 가져온 파일들의 목록 -->
	<a href="view.jsp">목록보기</a>
	<a href="dirView.jsp">파일 저장 디렉토리</a>
</body>
</html>