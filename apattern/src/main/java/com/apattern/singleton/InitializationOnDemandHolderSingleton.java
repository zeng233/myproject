package com.apattern.singleton;

/**
 * @description: 
 * 
 * 参考：http://ifeve.com/initialization-on-demand-holder-idiom/
 * http://en.wikipedia.org/wiki/Initialization_on_demand_holder_idiom
 * 
 * @createTime: 2014年5月27日 下午10:27:45
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class InitializationOnDemandHolderSingleton {
	private InitializationOnDemandHolderSingleton() {
	};
	
	private static class InitializationOnDemandHolderSingletonHolder {
		static final InitializationOnDemandHolderSingleton SINGLETON = new InitializationOnDemandHolderSingleton();
	}
	
	public InitializationOnDemandHolderSingleton getInstance() {
		return InitializationOnDemandHolderSingletonHolder.SINGLETON;
	}
}
