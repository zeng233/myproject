package com.apattern.proxy.astatic;

/**
 * @description: 代理对象
 *
 * @createTime: 2014年5月11日 上午1:28:54
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class ProxySubject implements Subject {
	private RealSubject realSubject;

	@Override
	public void request() {
		
		preRequest();
		
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
		
		suffixRequest();
	}

	public void preRequest() {
		System.out.println("proxySubject preRequest");
	}
	
	public void suffixRequest() {
		System.out.println("proxySubject suffixRequest");
	}
}
