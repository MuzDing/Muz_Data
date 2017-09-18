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
	<table border="1">

	<tr> <td> 书号 </td> <td><jsp:getProperty name="book" property="bid"/></td></tr> 
	<tr> <td> 书名 </td> <td><jsp:getProperty name="book" property="bname"/></td></tr>
	<tr> <td> 数量 </td> <td><jsp:getProperty name="book" property="number"/></td></tr> 
	<tr> <td> 作者 </td> <td><jsp:getProperty name="book" property="wr"/></td></tr> </table>

</body>
</html>