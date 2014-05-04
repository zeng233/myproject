package com.myweb.test.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.EnumUtils;

/**
 * @description: 测试
 *
 * @createtime: 2013-7-22 下午2:09:27
 *
 * @author zenghua
 *
 * @version 1.0
 */
//urlPatterns里面设置多个访问路径是为了用同一个servlet
@WebServlet(name="testHttpServletRequestServlet",
urlPatterns={"/test/testHttpServletRequestServlet", "/test/testHttpServletRequestServlet?method=test"},
initParams={@WebInitParam(name = "param1", value="testparam1"), @WebInitParam(name = "param2", value="testparam2")})
public class TestHttpServletRequestServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1733598626312083827L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//获取单一初始化值
		String value1= req.getServletContext().getInitParameter("");
		Enumeration<String> enums =  req.getServletContext().getInitParameterNames();
		while( enums.hasMoreElements() ) {
			System.out.println(enums.nextElement());
		} 
		
		String value2 = this.getServletConfig().getInitParameter("");
		Enumeration<String> enums1 = this.getServletConfig().getInitParameterNames();
	}
}
