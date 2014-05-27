package com.apattern.singleton;

/**
 * @description: 延时加载式
 *
 * @createTime: 2014年5月27日 下午7:40:00
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class DelaySingleton {
	
	private DelaySingleton() {}
	
	private static class DelaySingletonHolder {
		private static DelaySingleton INSTANCE = new DelaySingleton();
	}
	
	public DelaySingleton getInstance() {
		return DelaySingletonHolder.INSTANCE;
	}
}
