<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
<%@ page import="com.entity.*" %>
</head>
<body>
	<% String str = request.getParameter("username"); %>
	<%	String str1= request.getParameter("username"); %>
	<%	
		if("admin".equals(str) && "000000".equals(str1))
		{
			User user = new User();
			
			session.setAttribute("userlogin", user);
			response.sendRedirect("index.jsp");			
		}
	%>
</body>
</html>