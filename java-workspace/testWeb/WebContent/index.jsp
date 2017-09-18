<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>

	<FORM METHOD=POST ACTION="saveinfo.jsp">
	<table border="1">
	<tr><td> 书号 </td><td><INPUT TYPE="text" NAME="bid"></td></tr>
	<tr><td> 书名 </td><td><INPUT TYPE="text" NAME="bname"></td></tr>
	<tr><td> 数量 </td><td><INPUT TYPE="text" NAME="number"></td></tr>
	<tr><td> 作者 </td><td><INPUT TYPE="text" NAME="wr"></td></tr>
	</table>
	<INPUT TYPE="submit" value=" 保存 ">
	</FORM>
</body>
</html>