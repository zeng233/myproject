package com.apattern.singleton;

/**
 * @description: 饿汉式
 *
 * @createTime: 2014年5月27日 下午7:11:57
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class EagerSingleton {
	private static EagerSingleton es = new EagerSingleton();
	
	private EagerSingleton() {}
	
	public EagerSingleton getInstance() {
		return es;
	}
}
