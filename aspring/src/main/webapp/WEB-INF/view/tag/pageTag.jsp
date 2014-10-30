<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="https://github.com/zeng233/page" prefix="page"%>
<%-- <%@ taglib uri="http://www.winxuan.com/tag/page" prefix="pagination"%> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分页标签</title>

<link rel="stylesheet" type="text/css" href="../scripts/bootstrap/css/bootstrap.css" />
<script type="text/javascript" src="../scripts/bootstrap/js/bootstrap.js"></script>
</head>

<body>
	<h1>分页标签</h1><br>
	
	<table>
		<tr>
			<td>id</td>
			<td>用户名</td>
			<td>密码</td>
		</tr>
		<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.userName }</td>
				<td>${user.password }</td>
			</tr>
		</c:forEach>
	</table>
	
	<page:pagination page="${page }"/> 
	<%-- <pagination:page pagination="${pagination }"></pagination:page> --%>
</body>
</html>