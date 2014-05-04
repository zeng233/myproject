package com.myweb.test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;

/**
 * @description: 测试servlet
 *
 * @createtime: 2013-5-28 下午8:55:42
 *
 * @author zenghua
 *
 * @version 1.0
 */

//@WebServlet(name="testServlet", urlPatterns="/test/testServlet")
public class TestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1335141867863018707L;
	
	
	
	/**
	 * 由于ServletConfig有容器完成初始化，所以只重写init方法就可以了，参考GenericServlet的init(ServletConfig config)方法
	 * 
	 * init中调destroy方法，TODO，再访问这个servlet
	 */
	@Override
	public void init() throws ServletException {
		System.out.println("==============TestServlet init()");
		System.out.println("servletName: " + super.getServletConfig().getServletName());
		this.destroy();
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	
	/**
	 * 是HttpServlet的一个方法，
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("doGet");
	}
	
	/**
	 * 是HttpServlet的一个方法
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//request路径问题
		System.out.println("==========================request=======================");
		System.out.println("ContextPath: " + req.getContextPath());
		System.out.println("ServletPath: " + req.getServletPath());
		System.out.println("PathInfo: " + req.getPathInfo());//不在servlet上下文中
		System.out.println("realpath: " + req.getServletContext().getRealPath("/") + "pages\\test");//为什么是\\呢 TODO
		Enumeration<String> headers = req.getHeaderNames();
		while (headers.hasMoreElements()) {
			System.out.println("header: " + headers.nextElement());
		}
		//验证服务器的登录机制
		System.out.println("container login mechanism ： " + req.authenticate(resp));
		
		//ServletContext
		System.out.println("======================ServletContext======================");
		ServletContext context = req.getServletContext();
		System.out.println(context.getServletContextName());
		Enumeration<String> enums = req.getServletContext().getInitParameterNames();
		if (enums != null) {
			while (enums.hasMoreElements()) {
				System.out.println(enums.nextElement());
			}
		}
		URL url = context.getResource("/index.jsp");
		ByteArrayInputStream byteArrayInputStream = (ByteArrayInputStream) url.getContent();
		BufferedReader br = new BufferedReader(new InputStreamReader(byteArrayInputStream));
		while (StringUtils.isBlank(br.readLine())) {
			System.out.println(br.readLine());
		}
		
		//Response
		System.out.println("============================Response========================");
		PrintWriter pw = resp.getWriter();
		pw.write("this is a testcase about response ");
//		ServletOutputStream outputStream = resp.getOutputStream();
//		resp.setBufferSize(100); 设置在输出流之前，不然抛出IllegalStateException
		System.out.println("isCommitted: " + resp.isCommitted());
//		resp.setHeader("X-Powered-By", "Servlet/3.1");
		//增加相应头信息
		resp.addHeader("test", "this test response's header");
		//如果以前存在server头，那么set之后将覆盖以前的值
		resp.setHeader("Server", "tomcat");
//		resp.sendRedirect("http://www.baidu.com/");
//		resp.sendRedirect("../index.jsp");//可以使用相对路径，相对于servletContext的路径(/amyweb)
		//此方法应该放到getWriter之前
		resp.setContentType("text/html;charset=UTF-8");
		
		
		//Cookies
		System.out.println("==================Cookies====================");
		Cookie[] cookies = req.getCookies();
		for (Cookie c : cookies) {
			System.out.println("jsessionid: " + c.getName() + ", " + c.getValue());
			System.out.println(c.getVersion());
		}
		
		System.out.println("CharacterEncoding: " + req.getCharacterEncoding());
		
		
		//session
		System.out.println("===================Session====================");
		String sessionId = req.getParameter("jsessionid");
		System.out.println(sessionId);
		HttpSession session = req.getSession();
		System.out.println("sessionid: " + session.getId());
		session.setAttribute("sessionId", session.getId());
		
		
		
//		===============================两种跳转方式==============================
		PrintWriter out = resp.getWriter();
		out.print("this is include");
		// 请求转发
		RequestDispatcher rd = req.getRequestDispatcher("/pages/test/success.jsp?1");
		rd.forward(req, resp);
//		rd.include(req, resp);//forword和include的区别,include可以把PrintWriter中的内容打印到跳转后的页面上。forword请求转发则不能
		
		//重定向 TODO
//		resp.sendRedirect("../index.jsp");
		
		System.out.println("ServletInfo: " + this.getServletInfo());
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	
	public synchronized void test() {}
}
