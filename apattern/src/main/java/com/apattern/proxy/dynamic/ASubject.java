package com.apattern.proxy.dynamic;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月11日 下午7:07:24
 *
 * @author zenghua
 *
 * @version 1.0
 */
public interface ASubject {
	void request();
	
	String requestByParam(String[] s, int i);
}
