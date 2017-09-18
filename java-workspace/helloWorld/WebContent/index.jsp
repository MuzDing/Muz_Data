<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
	<%=a %>
	<%
		String str="hello world";
		out.print(str);
		//out.print("<br>");
		
	%>
	<%=str %>     
	<%!
		int a=10;  //全局变量
	%>
	
	</form>
	this is a jsp
</body>
</html>