package com.apattern.proxy.dynamic;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月11日 下午7:07:51
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class ARealSubject implements ASubject {

	@Override
	public void request() {
		System.out.println("this is realsubject's method ----- request() ");
	}

}
