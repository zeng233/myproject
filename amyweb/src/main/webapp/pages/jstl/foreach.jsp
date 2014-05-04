<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include file="lib/taglib.jsp" %> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试foreach标签</title>
</head>

<body>
	<c:forEach items="${users }" var="user" varStatus="s">
		${s.step }
		索引${s.count }====${user.userName }：<fmt:formatDate value="${user.createTime }" pattern="yyyy-MM-dd HH:mm:ss"/><br/>
	</c:forEach>
	
</body>
</html>