package com.myspring.core.ioc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO
 *
 * @createTime: 2014年2月18日 下午11:43:50
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestLifecycle {
	public AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
	
	public static void main(String[] args) {
		TestLifecycle t = new TestLifecycle();
		t.testShutdown();
		t.getBean();
	}
	
	public void testShutdown() {
		context.registerShutdownHook();
	}
	
	public void getBean() {
		System.out.println(context.getBean("myInitBean"));
	}
}
