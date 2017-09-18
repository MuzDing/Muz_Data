<!DOCTYPE HTML>
<html>
<head>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
	<%
		String [] strs = {"a","b","c"};
		pageContext.setAttribute("strs", strs);
	%> 
	
	<c:if test ="${1 == 2}">
		<h2>ceshibiaoti</h2>
	</c:if>
	
	<c:forEach items="${strs}" var ="str" begin="1" end="3">
		元素:${str} 	
	</c:forEach>
	
	<c:forEach items="${strs }" var ="str" varStatus="xx">
	   <p 
	       <c:if test="${xx.index %2 ==0 }"> 
	   		    style="color: red;" 
	   		</c:if>
	   	>元素：${str }</p>	
	   	<br>
	</c:forEach>
	
</body>
</html>