<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>
	<form METHOD=POST ACTION="user/login">
		用户名：<input TYPE="text" NAME="username" value="mvctest"><br>
		密 码：<input TYPE="text" NAME="password" value="ok">
		<br> 
		<input TYPE="submit">
	</form>
	<br>
	<a href="message/add" target="_blank">add</a>
	<br>
	<a href="message/哈哈哈" target="_blank">see：哈哈哈</a>
</body>
</html>