package com.myspring.core.aop;

import org.springframework.aop.framework.ProxyFactory;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月17日 下午10:20:08
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestAop {
	public static void main(String[] args) {
		TestAop t = new TestAop();
		t.testAop();
	}
	
	
	public void testAop() {
		IHelloWorld target = new IHelloWorldImpl();
		// create the proxy
		ProxyFactory pf = new ProxyFactory();
		HelloWorldDecorator hd = new HelloWorldDecorator();
		pf.addAdvice(hd);
		pf.setTarget(target);
		pf.removeAdvice(hd);
		
		IHelloWorld proxy = (IHelloWorld)pf.getProxy();
		System.out.println("=========target object=========");
		target.show();
		System.out.println("\n=========proxy object==========");
		proxy.show();
	}
}
