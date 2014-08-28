<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.myspring.model.User" %>
<%@ taglib uri="https://github.com/zeng233/mytag" prefix="cc"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>标签测试</title>
</head>

<body>
	<%
		User user = new User();
		user.setId(1);
		user.setUserName("hello");
		user.setPassword("11111");
		pageContext.setAttribute("user", user);
	%>
	<cc:showUserInfo user="${pageScope.user }"></cc:showUserInfo>
</body>
</html>