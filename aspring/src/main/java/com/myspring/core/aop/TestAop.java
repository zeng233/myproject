package com.myspring.core.aop;

import org.springframework.aop.framework.ProxyFactory;

import com.myspring.commons.BaseIoc;
import com.myspring.model.User;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月17日 下午10:20:08
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestAop extends BaseIoc {
	public static void main(String[] args) {
		TestAop t = new TestAop();
//		t.testStaticAop();
//		t.testAspectJByAnnotation();
		t.aspectjByXml();
	}
	
	
	public void testStaticAop() {
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
	
	
	public void testAspectJByAnnotation() {
		BankService bankService = context.getBean("bankService", BankService.class);
		bankService.accout();
	}
	
	public void aspectjByXml() {
		BankService bankService = context.getBean("bankService", BankService.class);
		User user = new User();
		bankService.updateAccount(user);
		bankService.add();
	}
	
	/**
	 * aspectj和事务管理集成
	 */
	public void aspectjWithTx() {
		
	}
}
