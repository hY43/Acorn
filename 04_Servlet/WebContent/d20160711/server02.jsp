<%@page import="dao.MakeConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	/* txt 파라미터 값으로 db에 가서 이미지 경로를 가져온 후, 화면에 출력 */
	String name = request.getParameter("txt");
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	if (name == null || name.equals("")) {
		out.println("ERROR");
	} else {
		conn = MakeConnection.getInstance().getConnection();

		StringBuffer sb = new StringBuffer();

		sb.append("SELECT * FROM photosearch ");
		sb.append("WHERE name like ? ");
		pstmt = conn.prepareStatement(sb.toString());

		pstmt.setString(1, name + "%");
		rs = pstmt.executeQuery();

		if (rs.next()) {
			String path = rs.getString("imgpath");
			out.println(path);
		} else {
			out.println("ERROR2");
		}

		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		//if(conn!=null) conn.close();
	}
%>