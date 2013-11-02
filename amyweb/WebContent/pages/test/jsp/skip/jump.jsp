<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>动态跳转</title>
</head>

<body>
	<h1>动态跳转</h1>
	<h2>页面之间的数据可以任意传递</h2>
	<%request.setAttribute("jump", "dynamic"); %><br>
	<%-- <jsp:forward page="dynamic.jsp"></jsp:forward> --%>
	
	jumpParam: <%=request.getParameter("jumpParam") %><br><!-- 获取主页面的参数值 -->
	<jsp:forward page=""></jsp:forward>
</body>
</html>