package com.apattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
	// 真实的对象
	private Object realObject;

	public ADynamicSubject(Object realObject) {
		this.realObject = realObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before calling " + method);

		if (args != null) {
			// 参考InvocationHandler，args表示 被调用方法的参数
			String[] ss = (String[]) args[0];// 可以强制转换成Object[]，参考JSL5
			System.out.println("第一个参数值：" + ss[0] + ss[1]);
			System.out.println("第二个参数值：" + args[1]);
		}
		// 调用该方法原始的返回结果
		Object obj = method.invoke(realObject, args);
		System.out.println("ADynamicSubject invoke's result : " + obj);
		System.out.println("affter calling " + method);
		return null;
	}

	/**
	 * 获取代理对象
	 */
	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread()
				.getContextClassLoader(),
				realObject.getClass().getInterfaces(), this);
	}
}
