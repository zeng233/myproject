<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn"  uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>成功</title>
</head>
<body>
	------------------------------------取值表达式--------------------------------------
	<h1>使用.取值：${student.name }</h1><!-- \转义 字符-->
	<h1>使用[]取值：${student["name"]}</h1>
	<h1>${username }</h1>
	<%-- <h1>${requestScope.username }</h1> --%>
	<h1>字面值(常量值)：${true }, ${"${"}exprA}</h1>
	--------------------------------------集合类型取值----------------------------------
	<h2>Map类型单个取值：${map[0]} ${map[1] }，key为整型时：${map1[0] }</h2><!-- map键用数字时用[]不用. -->
	<h2>Map中装两个List类型的情况，遍历Map类型:
		<c:forEach items="${roles }" var="role">
			${role.value }
		</c:forEach>
	</h2>
	<%-- <h2>遍历List类型：${requestScope.students[2].name }</h2> --%>
	<h2>
		遍历List：<c:forEach items="${requestScope.students }" var="s" varStatus="status">
			${s.name}-----
			索引值：index:${status.index }&nbsp;&nbsp;&nbsp;&nbsp;
		</c:forEach>
	</h2>
	<%-- 遍历数组：${sessionScope.words[2] } --%>
	<h2>
		<!-- 在page,request,session,application范围内查找 -->
		遍历数组：<c:forEach items="${words }" var="s">
			<%-- <c:out value="${s }"></c:out> --%>
			<span style="color: red;">${s }</span>
		</c:forEach>
	</h2>
	
	<br>
	--------------------------------------内置对象----------------------------------------
	<h4>EL表达式11个内置对象：pageContext，param，paramValues，header，headerValues，cookie，initParam，pageScope，requestScope，sessionScope，applicationScope</h4>
	<h1>${param.username }</h1><%-- ${param.username }相当于request.getParamertor("username") --%>
	<h1>${paramValues.sex[0] }</h1><!-- ${paramValues.sex}相当于request.getParameterValues("sex") -->
	<h1>requestScope范围内访问：${requestScope.students[2].name }</h1>
	<h1>sessionScope范围内访问：${sessionScope.students[2].name }</h1>
	--------------------------------------操作符----------------------------------------
	<h1>算术运算符：+,-,*,/,div,%,mod,-</h1>
	<h2>1+1=${1+1 }</h2>
	<h2>5-1=${5-1 }</h2>
	<h2>10*10=${10*10 }</h2>
	<h2>1/2=${1/2 } 或者 9 div 3=${9 div 3}</h2><!-- 强转成Double再进行计算 -->
	<h2>10 % 3=${10%3 } 或者 10 mod 3 =${10 mod 3 }</h2>
	<!-- 如果操作数是BigDecimal, Float, Double, or String，EL会转换成Double类型在进行计算-->
	<h2>null + null = ${null + null }</h2>
	<h2>如果操作数是BigDecimal, Float, Double, or String，EL会转换成Double类型在进行计算：“1” + “1” = ${"1" + "1" }或者float型"1.0f" + "1.0f"=${"1.0f" + "1.0f" }或者double类型"1.0D" + "1.0D"=${"1.0D" + "1.0D" }</h2>
	<h2>"-"求反：-"-1" = ${-"-1" }</h2>
	--------------------------------------------------------------------------------------
	<h1>关系运算符：<,>,<=,>=,lt,gt,le,ge,==,!=,eq,ne</h1>
	<h2>"a" < "b" = ${"a"<"b"  }</h2>
	<h2>3 >= 2:${3 >= 2 } 或者 3 ge 2:${3>=2 }</h2>
	--------------------------------------------------------------------------------------
	<h1>逻辑运算符：&&,and,||,or,!,not</h1>
	<h2>true && true：${true && true}或者true and true：${true and true }</h2>
	---------------------------------------------------------------------------------------
	<h1>空运算符：empty null：${empty null }</h1>
	<h1>三元式：1 > 2 ? true : false结果为${1 > 2 ? true : false }</h1>
	---------------------------------------------------------------------------------------
	<h1>EL调用标签库Functions静态方法：<c:if test="${fn:contains(student.name, 'test')}">
						true
					</c:if>
	</h1>
	<h1>枚举类型${"${username}" }</h1>
</body>
</html>