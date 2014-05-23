<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello index.jsp</title>

<style>  
.error {  
    color: #ff0000;  
    font-weight: bold;  
}  
</style>  
</head>

<body>
<hr>
	<!-- 验证要用Spring的form标签 -->
	<form:form action="index" method="post" modelAttribute="user">
		<form:errors path="username" cssClass="error" /><br>
		用户名：<form:input path="username"/><br>
		<form:errors path="password" cssClass="error" /><br>
		密码：<form:input path="password"/><br>
		
		用户角色：<form:input path="role.name"/>
		<input type="submit" value="commit"><br>
	</form:form>
</body>
</html>