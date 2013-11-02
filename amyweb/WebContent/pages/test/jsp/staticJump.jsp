<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>静态跳转</title>
</head>

<body>
	<h1>静态跳转</h1>
	<h2>只能在页面显示，不能有动作数据的传输</h2>
	<%request.setAttribute("test", "static"); %>
	<%-- <jsp:forward page="success.jsp"></jsp:forward> --%>
</body>
</html>