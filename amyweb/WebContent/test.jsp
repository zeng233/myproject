<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%><%-- 配置错误页面 --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="index.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试servlet新特性</title>
</head>


<body>
	<form action="enhanceServlet">
		<input type="text" name="testName"/><br><br>
		<input type="submit" value="提交"/>
	</form>
</body>
</html>