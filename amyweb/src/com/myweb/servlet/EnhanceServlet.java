package com.myweb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * description: 测试servlet新特性
 *
 * createtime: 2013-4-27 上午11:14:29
 *
 * @author zenghua
 * @version 1.0
 */

@WebServlet(urlPatterns={"/enhanceServlet"})
public class EnhanceServlet extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("==================this is enhanceServlet init");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -34851803427603033L;
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("enhanceServlet");
	}
}
