package com.myweb.test.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * @description: TODO
 *
 * @createtime: 2013-7-22 下午2:14:40
 *
 * @author zenghua
 *
 * @version 1.0
 */
//@WebFilter(filterName="myFilter", urlPatterns="/*")
public class MyFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("myFilter pathinfo is : " + req.getPathInfo());
		System.out.println("context path : " + req.getServletContext().getContextPath());
		System.out.println("servlet path : " + req.getServletContext().getRealPath("/"));
		
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
