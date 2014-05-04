package com.myweb.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @description: Note that a servlet instance placed into service by a servlet container may handle
				no requests during its lifetime.参考2.3.3
 *
 * @createtime: 2013-5-29 下午3:23:01
 *
 * @author zenghua
 *
 * @version 1.0
 */

//@WebServlet(name="ts", urlPatterns="/ts", loadOnStartup=1)
public class TestServletLoadOnStartUp extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7938516044211471933L;
	
	
	@Override
	public void init() throws ServletException {
		System.out.println("TestServletLoadOnStartUp初始化：" + "====init");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("=====================================");
		System.out.println(req.getContextPath());
		System.out.println(req.getServletPath());
		System.out.println(req.getPathInfo());
	}
	
	@Override
	public void destroy() {
		System.out.println("====destroy");
	}
}
