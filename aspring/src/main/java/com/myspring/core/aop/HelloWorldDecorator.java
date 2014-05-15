package com.myspring.core.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @description: Implementing Around Advice
 * 
 * this is Advisors class
 *
 * @createTime: 2014年5月6日 下午11:58:00
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class HelloWorldDecorator implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.print("Hello ");
		Object retVal = invocation.proceed();
		System.out.print("!");
		return retVal;
	}

}
