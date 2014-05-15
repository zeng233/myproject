package com.myspring.core.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月11日 下午9:51:16
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestSimpleBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("" + method.getName());
	}
	
	public static void main(String[] args) {
		IHelloWorldImpl target = new IHelloWorldImpl();
		// create the proxy
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new TestSimpleBeforeAdvice());
		pf.setTarget(target);
		
		IHelloWorld proxy = (IHelloWorld)pf.getProxy();
		proxy.show();
	}
}
