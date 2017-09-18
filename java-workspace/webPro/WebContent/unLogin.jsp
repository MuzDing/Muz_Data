<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
<%
	session.removeAttribute("userLogin");
	int userCount = 0;
	Object object = application.getAttribute("userCount");
	if(object != null){
		userCount = Integer.valueOf(object.toString());
	}
	userCount--;
	application.setAttribute("userCount", userCount);
	
	response.sendRedirect("index.jsp");
%>
</body>
</html>