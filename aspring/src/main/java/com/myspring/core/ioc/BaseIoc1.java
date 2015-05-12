package com.myspring.core.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseIoc1 {
	// 不加public关键字，不能获得context属性，参考public，default，project，private的作用域
	public static ApplicationContext context = new ClassPathXmlApplicationContext("com/myspring/core/ioc/ioc.xml");
	
	public static void main(String[] args) {
		System.out.println(context);
	}
}
