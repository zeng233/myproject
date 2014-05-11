package com.apattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.apattern.proxy.astatic.ProxySubject;
import com.apattern.proxy.astatic.Subject;
import com.apattern.proxy.dynamic.ADynamicSubject;
import com.apattern.proxy.dynamic.ARealSubject;
import com.apattern.proxy.dynamic.ASubject;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月11日 上午1:06:15
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestProxy {
	public static void main(String[] args) {
		TestProxy t = new TestProxy();
//		t.staticProxy();
		t.dynamicProxy();
	}
	
	public void staticProxy() {
		Subject sub = new ProxySubject();
		sub.request();
	}
	
	/**
	 * 动态代理java3个类：Proxy、InvocationHandler、Method
	 * 
	 * 动态代理步骤：
	 * 1、真实的目标对象
	 * 2、实现InvocationHandler接口，与真实对象绑定
	 * 3、通过Proxy创建代理类
	 * 4、代理类执行目标方式
	 */
	public void dynamicProxy() {
		ARealSubject realObject = new ARealSubject();
		InvocationHandler ds = new ADynamicSubject(realObject);
		Class<?> cls = realObject.getClass();
		//使用Proxy新建出来的代理类，
		ASubject subject = (ASubject) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), ds);
		subject.request();
	}
}
