package com.apattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月11日 下午7:08:33
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class ADynamicSubject implements InvocationHandler {
	//真实的对象
	private Object realObject;
	
	public ADynamicSubject(Object realObject) {
		this.realObject = realObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before calling " + method);
		System.out.println(args);//参考InvocationHandler，args表示 被调用方法的参数
		method.invoke(realObject, args);
		System.out.println("affter calling " + method);
		return null;
	}

}
