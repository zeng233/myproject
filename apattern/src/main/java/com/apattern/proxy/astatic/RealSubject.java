package com.apattern.proxy.astatic;

/**
 * @description: 真实的对象
 *
 * @createTime: 2014年5月11日 上午1:27:32
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("RealSubject request");
	}

}
