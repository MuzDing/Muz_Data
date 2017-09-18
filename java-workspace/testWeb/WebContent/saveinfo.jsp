<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
	<jsp:useBean id="book" class="testWeb.BookBean" scope="session"/> 
	<jsp:setProperty name="book" property="*"/>
	<a href="http://localhost:8080/testWeb/viewbook.jsp" >查看书籍信息</a>
</body>
</html>