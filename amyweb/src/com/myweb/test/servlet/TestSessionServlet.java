package com.myweb.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @description: TODO
 *
 * @createtime: 2013-7-22 下午2:10:33
 *
 * @author zenghua
 *
 * @version 1.0
 */

// urlPatterns里面设置多个访问路径是为了用同一个servlet
@WebServlet(name="testSessionServlet",
urlPatterns={"/test/testSessionServlet", "/test/testSessionServlet?method=test"},
initParams={@WebInitParam(name = "param1", value="testparam1"), @WebInitParam(name = "param2", value="testparam2")})
public class TestSessionServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2173598510404141257L;
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		System.out.println(session);
		//获取jsessionid
		String jsessionid = session.getId();
		System.out.println(jsessionid);
		req.getServletContext().getRequestDispatcher("/pages/test/servlet/session.jsp").forward(req, resp);
		System.out.println("getUserPrincipal : " + req.getUserPrincipal());
//		System.out.println("" + req.login(username, password));
	}

}
