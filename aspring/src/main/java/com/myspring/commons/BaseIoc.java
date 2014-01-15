package com.myspring.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO
 *
 * @createTime: 2014年1月15日 下午11:12:01
 *
 * @author zenghua
 *
 * @version 1.0
 */
public abstract class BaseIoc {
	//不加public关键字，不能获得context属性，参考public，default，project，private的作用域
	public ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
}
