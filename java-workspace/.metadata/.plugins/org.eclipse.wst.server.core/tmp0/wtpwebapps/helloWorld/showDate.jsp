<!DOCTYPE HTML>
<%@page import="java.util.Date"%>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
	<%
		Date date = new Date();
		out.print("当前时间为："+date);
	%>
</body>
</html>