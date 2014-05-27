package com.apattern.singleton;

import java.io.Serializable;

/**
 * @description: TODO
 * 
 * 参考：http://howtodoinjava.com/2012/10/22/singleton-design-pattern-in-java/
 * http://www.cs.umd.edu/~pugh/java/memoryModel/DoubleCheckedLocking.html
 * 
 * @createTime: 2014年5月27日 下午7:44:06
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class FinalSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7502751940834970771L;

	private FinalSingleton() {
	}

	private static class FinalSingletonHolder {
		private static FinalSingleton INSTANCE = new FinalSingleton();
	}

	public FinalSingleton getInstance() {
		return FinalSingletonHolder.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}
}
