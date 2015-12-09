package com.jse.oo.design.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 动态代理：就是在运行时创建代理对象
 * 
 * @author Administrator
 *
 */
public class DynamicProxyTest {
	public static void main(String[] args) {
		YoungWoman youngWoman = new YoungWoman();
		OldWoman oldWoman = new OldWoman(youngWoman);
		Woman woman = (Woman) Proxy.newProxyInstance(Woman.class.getClassLoader(), new Class[] { Woman.class }, oldWoman);
		woman.doHappy();
	}
}
