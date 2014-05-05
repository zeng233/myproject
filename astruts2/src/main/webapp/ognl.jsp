<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ognl</title>
</head>

<body>
	<s:property value="message"/>
	<h1>遍历map:</h1>
	
	map中的list:
	<s:iterator value="map1" id="listMap">
		<s:iterator value="#listMap.value">
			<s:property value="name"/>
		</s:iterator>
	</s:iterator>
</body>
</html>