package com.myweb.test;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * @description: 测试filter
 *
 * @createtime: 2013-6-14 下午3:13:00
 *
 * @author zenghua
 *
 * @version 1.0
 */

//@WebFilter(displayName="@WebFilter", filterName="test@WebFilter", urlPatterns="/*", dispatcherTypes=DispatcherType.INCLUDE)
public class TestFilter implements Filter {

	/**
	 * filterConfig与ServletContext发生关系，获取context中的内容
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		ServletContext context = filterConfig.getServletContext();
		System.out.println(context.getContextPath());
		System.out.println("过滤器名称：" + filterConfig.getFilterName());
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String sessionId = request.getParameter("jsessionid");
		System.out.println(sessionId);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
