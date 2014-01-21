package com.myspring.core.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * @description: TODO
 *
 * @createTime: 2014年1月18日 下午10:51:03
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestIocByAnnotation {
	@Autowired
	private ApplicationContext cxt;
	
	public static void main(String[] args) {
		TestIocByAnnotation t = new TestIocByAnnotation();
		t.getCxt();
	}
	
	public void getCxt() {
		System.out.println(cxt);
	}
}
