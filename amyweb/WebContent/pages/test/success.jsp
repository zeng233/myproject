<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>success</title>
</head>

<body>
	<h1>success</h1>
	sessionId: ${sessionScope.sessionId }<br />
	<!-- 如果浏览器不支持session跟踪机制，encodeURL后，地址后面会加上sessionid=,如果http://.../pages/test/rewrite.jsp;SESSIONID=1234 -->
	<a href="<%=response.encodeURL("../pages/test/rewrite.jsp") %>">重写URL</a><br>
	ContextPath:<%=request.getContextPath() %>
	<%=request.getServletContext().getRealPath("/") %>
</body>
</html>