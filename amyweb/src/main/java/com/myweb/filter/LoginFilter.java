package com.myweb.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * description: TODO
 *
 * createtime: 2013-1-23 上午10:28:29
 *
 * @author zenghua
 * @version 1.0
 */

//@WebFilter("/*")
public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("filter is destroyed");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter is executed");
		chain.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter is init");
	}

}
