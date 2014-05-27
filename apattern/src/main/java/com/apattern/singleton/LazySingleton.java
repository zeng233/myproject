package com.apattern.singleton;

/**
 * @description: 懒汉式
 * 
 * 参考：http://www.javaworld.com/article/2077568/learn-java/java-tip-67--lazy-instantiation.html
 *
 * @createTime: 2014年5月27日 下午7:14:41
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class LazySingleton {
	private LazySingleton ls;
	
	private LazySingleton() {}
	
	public LazySingleton getInstance() {
		if (ls == null) {
			synchronized (LazySingleton.class) {
				if (ls == null) {
					ls = new LazySingleton();//
				}
			}
		}
		return ls;
	}
}
