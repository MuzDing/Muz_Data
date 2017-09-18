<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="webPro.*" %>
<%@ page import="com.dao.*" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
	<%
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	int type=0;
	
	session.setMaxInactiveInterval(10);
	UserDao ud = new UserDaoImpl();
	SysUser u = ud.login(username, password);
	if(u!=null){
		type=1;
		User user = new User();
		user.setUser(username);
		user.setPassword(password);
		session.setAttribute("userlogin", user);
		
		int userCount = 0;
    	Object object = application.getAttribute("userCount");
    	if(object != null){
    		userCount = Integer.valueOf(object.toString());
    	}
    	userCount++;
    	application.setAttribute("userCount", userCount);
  		Cookie ck = new Cookie("usernamecookie",username);
  		ck.setMaxAge(5);
  		Cookie ck2 = new Cookie("passwordcookie",password);
  		ck2.setMaxAge(5);
    	response.addCookie(ck);
    	response.addCookie(ck2);
		response.sendRedirect("index.jsp");	
	}
	else
	{
		type = -1;
		response.sendRedirect("login.jsp?type="+type);
	}
	

	%>
</body>
</html>