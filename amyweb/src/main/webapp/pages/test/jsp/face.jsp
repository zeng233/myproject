<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/pages/test/jsp/staticJump.jsp" %><!-- 可以带参数，可以使用绝对路径和相对路径 -->
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试JSP的基本功能</title>

</head>


<body>
	1、测试跳转
	<jsp:include page="jump.jsp">
		<jsp:param value="jumpTest" name="jumpParam"/>
	</jsp:include><!-- 只能使用相对路径 -->
	
	static request is <%request.getAttribute("test"); %><br>
	dynamic request is <%request.getAttribute("jump"); %>
</body>
</html>