<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>value</title>
</head>
<body>
	<%
		pageContext.setAttribute("1","1");
		request.setAttribute("2", "2");
	%>
	pageContext:
	<%= pageContext.getAttribute("1") //当前页面
	%>
	request:
	<%=request.getAttribute("2") %>
	
	<% 
		//request.getRequestDispatcher("showValue.jsp").forward(request, response);//转发
		response.sendRedirect("http://www.baidu.com"); //重定向
		// <a href="jsp.jsp?参数名=参数值">XXX</a>
		// <form action=url method="post">
		// response.sendredirect("目标url")
	%>
	
</body>
</html>