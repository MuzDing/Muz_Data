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
		if(application.getAttribute("count")==null)
		{
			application.setAttribute("count", new Integer(0));
		}
		Integer count=(Integer)application.getAttribute("count");
		application.setAttribute("count", new Integer(count.intValue()+1));
		count=(Integer)application.getAttribute("count");
		out.print("当前访问量为："+count);
	%>
</body>
</html>