<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
	<%
	request.setAttribute("userName", "张三");
	
	session.setAttribute("name", "李四");
	%>
	get:<%=request.getAttribute("userName") %>
	asass
	${requestScope.userName}
	${sessionScope.name}
</body>
</html>