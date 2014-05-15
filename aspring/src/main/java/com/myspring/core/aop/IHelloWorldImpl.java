package com.myspring.core.aop;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月11日 下午8:20:26
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class IHelloWorldImpl implements IHelloWorld {

	@Override
	public void show() {
		System.out.print("show \"AOP Hello World\" ");
	}

}
