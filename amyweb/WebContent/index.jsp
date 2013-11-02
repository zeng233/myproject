<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>

<body>
	<form action="userServlet?method=checkUser" method="post">
		<table>
			<tr>
				<td align="right">用户名：</td>
				<td><input type="text" name="userName"/></td>
			</tr>
			<tr>
				<td align="right">密码：</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					验证码<input type="text" name="validateCode" width="10" /><a href="">换一张</a>
				</td>
				
			</tr>
			<tr>
				<td align="right"><input type="submit" value="登录"/></td>
				<td><input type="reset" value="重置"/></td>
			</tr>
			<tr>
				<td colspan="2"><a href="userServlet?method=initRegist">注册</a></td>
			</tr>
		</table>
	</form>
</body>
</html>