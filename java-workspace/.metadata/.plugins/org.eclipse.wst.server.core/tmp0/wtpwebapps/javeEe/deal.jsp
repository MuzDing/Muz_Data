<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page language="java" import="com.czu.UserBean" %>
<%@ page language="java" import="com.czu.UserManagerBean" %>
<%@ page language="java" import="com.czu.StudentBean" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
<jsp:useBean id="userManager" class="com.czu.UserManagerBean"></jsp:useBean>
<jsp:useBean id="studentManager" class="com.czu.StudentManagerBean"></jsp:useBean>
<%
String id;
String pwd;
String name;
id=request.getParameter("txtUserId").toString();
pwd=request.getParameter("txtUserPwd").toString();
name = request.getParameter("id").toString();

UserBean ub = new UserBean();
ub.setUserId(id);
ub.setUserPWD(pwd);

boolean ret=userManager.Usercheck(ub);

if(ret)
{
	response.sendRedirect("index.jsp?id=s");
}
else{
	response.sendRedirect("NewFile.jsp");
}
%>
<%=id %>
<%=pwd %>
</body>
</html>