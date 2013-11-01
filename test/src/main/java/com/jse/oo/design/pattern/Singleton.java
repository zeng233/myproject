package com.jse.oo.design.pattern;

/**
 * @description: 延时单例模式。懒汉式单例线程不安全，饿汉式又要一直创建对象，延时单例模式可以克服两者的缺点，
 * 参考http://dengminghua1016.iteye.com/blog/1938950
 * 
 * http://howtodoinjava.com/2012/10/22/singleton-design-pattern-in-java/
 *
 * @createtime: 2013-9-9 下午2:01:21
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class Singleton {
	
	private Singleton() {}
	
	public Singleton getInstance() {
		return SingletonHolder.singleton;
	}
	
	private static class SingletonHolder {
		private static Singleton singleton = new Singleton();
	}
}

