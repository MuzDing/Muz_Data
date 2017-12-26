<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Date" %>
<%@ page language="java" import="com.czu.StudentBean" %>
<jsp:useBean id="studentManager" class="com.czu.StudentManagerBean"></jsp:useBean>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
<script type="text/javascript" src="JS/jquery-3.2.1.js"></script>
<script type="text/javascript">
$(function () {
	$("#btnStudentInfo").click(function(){
		var id;
		id = $("#StudentId").val();
		alert(id);
	})	
})
</script>
</head>
<body>
<%
	String strId;
	strId="001";
	String strName;
	String name;
	if("001".equals(strId))
	{
		strName = "xiaowang";
	}
	else{
		strName ="xiaolii";
	}
	name = request.getParameter("id").toString();
%>
欢迎你<%=name %>
<%=strId %>
<br>
<%=strName %><br>
<input type="text" id = "StudentId" >
<input type = "button" id="btnStudentInfo" value ="查询"><br>
<%
	StudentBean sb=studentManager.getStudentInfoById("14030413");
%>

<input type="text" id="StudentName" >
</body>
</html>