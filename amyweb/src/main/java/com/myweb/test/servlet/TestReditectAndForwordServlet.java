package com.myweb.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: 重定向和请求转发的区别
 *
 * @createtime: 2013-7-22 下午2:11:35
 *
 * @author zenghua
 *
 * @version 1.0
 */
@WebServlet(name="TestReditectAndForwordServlet", urlPatterns="/test/testReditectAndForwordServlet")
public class TestReditectAndForwordServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8594717438831929688L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//重定向可以把请求转到不同的服务器上，本地服务器绑定该请求发送到浏览器，
		//然后通过浏览器地址进行访问（在浏览器中地址是可以见的）
		// resp.sendRedirect("../pages/test/servlet/testJump.jsp");testSessionServlet
//		resp.sendRedirect("http://www.apache.org/");
//		resp.sendRedirect("testSessionServlet");

		//请求转发则是在同一个服务器上面发送请求,路径是相对于root而言的
//		req.getServletContext().getRequestDispatcher("/pages/test/servlet/testJump.jsp")
//			.forward(req, resp);
		req.getServletContext().getRequestDispatcher("/test/testSessionServlet")
		.forward(req, resp);
	}
}
