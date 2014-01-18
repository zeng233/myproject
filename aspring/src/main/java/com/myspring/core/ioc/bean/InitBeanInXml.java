package com.myspring.core.ioc.bean;

/**
 * @description: 直接在配置文件中初始化方法（推荐）
 *
 * @createTime: 2014年1月17日 上午12:21:46
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class InitBeanInXml {
	public void myInit() {
		System.out.println("InitBeanInXml通过配置文件执行初始化方法");
	}
}
