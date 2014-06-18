<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h1>welcome</h1><br>
		<a href="test/show">showMessage</a><br>
		
		pageContext.request: ${pageContext.request }<br>
		pageContext.request.contextPath: ${pageContext.request.contextPath}
	</body>
</html>
