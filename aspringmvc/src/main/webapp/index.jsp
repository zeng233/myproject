<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hello index.jsp</title>
<%-- <script type="text/javascript" src="<c:url value="/resources/js/jQuery-v1.7.2.js" />"></script> --%>
<script type="text/javascript" src="static/js/jQuery/jQuery-v1.7.2.js"></script>
<script type="text/javascript" src="static/js/index.js"></script>

<style>
.error {
	color: #ff0000;
	font-weight: bold;
}
</style>
</head>

<body>
<hr>
	<form:form action="test/index" method="post" commandName="user">
		<%-- <form:errors path="username" cssClass="error" /><br>
		用户名：<input type="text" /><br>
		<form:errors path="password" cssClass="error" /><br>
		密码：<input type="password"/>
		<input type="submit" value="commit"><br><br> --%>
		<a href="test/index">验证页面</a>
		<a id="format" href="test/format">测试json格式化</a><br>
		<label id="result"></label>
	</form:form>
</body>
</html>