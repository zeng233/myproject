<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %><%-- 是否忽略EL表达式 --%>
<%@ page isErrorPage="false" %><%-- 是否忽略错误页面，在web.xml中配置的错误页面 --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> --><!-- 告诉浏览器发送类型为HTML文本，参考W3C <meta>标签 -->
<!-- <meta http-equiv="refresh" content="2">隔2秒刷新,参考w3cshcool <meta>标签 -->
<title>测试jsp规范</title>
</head>

<body>
	<form action="../../test/testServlet?add=1&&a.html" enctype="application/x-www-form-urlencoded">
		用户名username : <input type="text" name="userName"><br><br>
		password : <input type="password" name="password"/><br><br>
		<input type="submit"/>
		<%out.print("ddd"); %>
		<%out.print(request); %> 
	</form>
</body>
</html>