<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%
	String path = request.getContextPath() + "/static/images/regist";
 	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%> 


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success</title>
</head>

<body>
	<h1>success</h1>
	<img src="<%=basePath %>/${imageUrl}" />
	<h1><%=application.getRealPath("/") %></h1><br>
	<a href="user/downloadServlet?imageUrl=${imageUrl}">下载</a>
</body>
</html>