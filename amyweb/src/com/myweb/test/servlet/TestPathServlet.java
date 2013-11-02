package com.myweb.test.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: TODO
 *
 * @createtime: 2013-7-24 上午10:39:59
 *
 * @author zenghua
 *
 * @version 1.0
 */

@WebServlet(name="testPathServlet", urlPatterns="/test/testPathServlet")
public class TestPathServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3796731954444853221L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String contextPath = req.getServletContext().getContextPath();
	}

}
