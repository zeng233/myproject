package com.myspring.core.ioc.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

/**
 * @description: TODO
 *
 * @createTime: 2014年1月17日 上午12:18:03
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class MyInitBean implements InitializingBean {
	@Autowired
	ApplicationContext cxt;
	
	private MyInitBean myInitBean;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("执行MyInitBean初始化方法afterPropertiesSet（）");
		myInitBean = cxt.getBean("myInitBean", MyInitBean.class);
		System.out.println("MyInitBean的afterPropertiesSet方法初始化的myInitBean:" + myInitBean);
	}

	public MyInitBean get() {
		return myInitBean;
	}
}
