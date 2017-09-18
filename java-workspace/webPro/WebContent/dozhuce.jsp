<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
<%@ page import="webPro.*" %>
<%@ page import="com.dao.*" %>
<script src=""></script>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	UserDao ud = new UserDaoImpl();
	boolean u = ud.register(username, password);
	if(u){
	%>
	<script>
	alert("注册成功")
	</script>
	<%;} else{%>
	<script>
	alert("注册失败")
	</script>
	<% ;} %>

	
</body>
</html>