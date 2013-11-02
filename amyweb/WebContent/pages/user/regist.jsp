<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登记</title>

</head>

<body>
	<form action="../../registServlet" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<td>头像：</td>
				<td>显示默认头像<input type="file" name="image" value="images/集成测试.png"/></td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="userName"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="注册"/></td>
				<td><input type="reset" value="重置"/></td>
			</tr>
		</table>
	</form>
</body>
</html>