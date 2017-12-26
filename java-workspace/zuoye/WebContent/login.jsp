<!DOCTYPE HTML>
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在此处插入标题</title>

<script type="text/javascript">
	function login() {
		var userid    =document.getElementById("txtUserId").value;
		var userpwd   =document.getElementById("txtUserPwd").value;
		if(userid=="1" && userpwd=="1")
			return true;
		else{
			alert("帐号密码错误");
			return false;
		}
	
	}
</script>

</head>
<body>
	<form action="index.jsp" method ="post" onsubmit="return login()">
		id:<input type="text" id="txtUserId"><br>
		pwd:<input type="password" id="txtUserPwd"><br>
		<input type="submit" name ="btn0k" value="提交">
	</form>
</body>
</html>