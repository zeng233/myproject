<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>EL测试</title>
<script type="text/javascript" src="js/query-1.6.2.js"></script>
<script type="text/javascript">
	
</script>
</head>

<body>
	<h1>嵌套：${student["name"]}</h1>
	<h1>字面值：${true}</h1>
	<h1>\${message}</h1><br />
	<h1>${'${'}student.name}</h1><br />
	<h1>点号取值：${student.name }</h1>
	<h1>中括号取值：${student["name"]}</h1>
	<h1>${header["host"] }</h1>
	<h1>${header["accept"]}</h1>
	<h1>${header["user-agent"]}</h1>
	<h1>${param["student.name"] }</h1>
	<h1>${header["cookie"]} }</h1>
	<h1>${param.student.name }</h1>
	<h1>操作符：${null/null }</h1>
	<h1>减号：${"-5" + "2" }</h1>
	<h1>等号：${student.number eq(1) }</h1>
	<h1>逻辑运算符：${true or false }---${empty student.name }</h1>
	<h1>三元表达式：${1==2 ? true : false}</h1>调用静态方法------------
	<h1>${sessionScope.hello }</h1>----------领域取值<br>
	
	<%-- <c:if test="${fn:contains(student.name, 'test')}">
		hello
	</c:if>
	<h1>学生名:${fn:toUpperCase(student.name)}</h1> --%>
	<h1>学生域：${sessionScope.s.name }</h1>
	
	<%-- <c:out value="#{student.number }" />号码
	<c:if test="#{student.number}">学生号码</c:if>
	--%>
	<h1>循环：<c:forEach items="students" var="s">
				学僧名字：<c:out value="${s.name }"></c:out>  
			</c:forEach></h1> 
</body>
</html>