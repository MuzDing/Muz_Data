<!DOCTYPE HTML >
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="webPro.*" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>
</head>
<body>
	
	 <c:if test="${userList==null }">
	 	<c:redirect url="user.do?action=queryUserList&pageIndex=1"></c:redirect>
	 </c:if>
	 <%
	 	request.setAttribute("userCount", CountNumber.userCount);
	 %>
	<c:if test="${userLogin!=null }">
 		欢迎你:${userLogin.usrName},
 	</c:if>
 		当前在线人数位:${userCount}
	 <%
	// Object obj = session.getAttribute("userLogin");
//	 User u = null;
	// if(obj!=null)
	// {
//		 u=(User)obj;
//	 }	 
	 %>

	 <%
	/*int userCount = 0;
 	Object object = application.getAttribute("userCount");
 	if(object != null){
 		userCount = Integer.valueOf(object.toString());
 	}*/
 	
 	request.setAttribute("userCount", CountNumber.userCount);
 	int pageIndex = Integer.valueOf(request.getAttribute("pageIndex").toString());

    	%>
	  <a href ="user.do?action=unlogin">注销</a>
	  
	  <form action="user.do" style="text-align:center;">
	  	<input type>
	  	用户名：<input>
	  	角色:<input>
	  	<input>
	  </form>
	  
	<table border="1px" width="97%" style="line-height: 30px;margin: 20px;text-align: center;">
    		<tr style="background-color: rosybrown;">
			<td>编号</td>
			<td>名称</td>
		</tr>
		<tr>
			<td>${u.usrNickname }</td>
			<td>${u.usrPassword }</td>
		</tr>
	</table>
	<a href = "user.do?action=queryUserList&pageIndex=1">首页</a>
	<c:if test="${pageIndex <=1 }">
		上一页
	</c:if>
	<c:if test="$pageIndex >1">
		<a href = "user.do?action=queryUserList&pageIndex=<%=pageIndex-1%>">上一页</a>
	</c:if>
	
	(${pageIndex}/${pageTotal})
	<c:if test="${pageIndex >=pageTotal}">
		下一页
	</c:if>
	<c:if test="${pageIndex <pageTotal}">
		<a href = "user.do?action=queryUserList&pageIndex=<%=pageIndex+1%>">下一页</a>
	</c:if>
	
	<a href = "user.do?action=queryUserList&pageIndex=${pageIndex}">尾页</a>
	
	<span>
		<label>跳转</label>
		<input type = "text" name="inputPage" id = "inputPage">页
		<button type="button" onclick="jump_to">GO</button>
	</span>
	<script type="text/javascript">
		function jump_to() {
			var pageno = document.getElementById("inputPage").value;
			var rep = /^[1-9]\d*$/;
			if(!rep.test(pageno)){
				alert("请输入正确的数字");
			}else if(pageno > ${pageTotal}){
				alert("跳转的页，不能大于尾页");
			}else{
				window.location.href="user.do?action=queryUserList$pageIndex="+pageno;
			}
		}
	</script>
</body>
</html>