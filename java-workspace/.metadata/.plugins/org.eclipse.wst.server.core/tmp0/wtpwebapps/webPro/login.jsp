<!DOCTYPE html>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<html>
<head>
<style type="text/css">
		body{
			text-align: center;
			margin-top: 200px;
		}
	</style>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
	<%
	String type = request.getParameter("type");
	
	Cookie[] cks = request.getCookies();
	Map<String,String> map = new HashMap<String,String>();
	
	map.put("usernamecookie","");
	map.put("passwordcookie","");
	for(int i = 0 ;i<cks.length;i++)
	{
		Cookie c=cks[i];
		map.put(c.getName(),c.getValue());
	}
	%>
</head>
<body>
	<%
		if(type !=null)
		{
			if("-1".equals(type))
			{
				%> 用户名密码错误<%
			}
		}
	%>
	<form action="user.do"  method="post" >
	<input type="hidden" name="action" value="login" />
		用户名：<input type="text" name = "username" value="<%=map.get("usernamecookie")%>"><br>
		密码：<input type="password" name = "password" value="<%=map.get("passwordcookie")%>"><br>
		<input type = "submit" value="提交">
	</form>
	<form action="user.do" method="post" >
		<input type = "submit" value="注册">
	</form>
	

	
	
</body>
</html> 