<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
<form action="deal.jsp?id=123" method="post">
<input type="text" name="txtUserId"><br>
<input type="text" name="txtUserPwd">
<input type = "submit" name="btnLogin" vaule = "登录">
</form>
<a href = " index.jsp">超级连接</a>
<% //response.sendRedirect("index.jsp?id=1"); %>


</body>
</html>