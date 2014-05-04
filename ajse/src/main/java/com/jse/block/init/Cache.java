package com.jse.block.init;

/**
 * @description: TODO
 * 
 * @createTime: 2014年5月3日 下午10:19:15
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class Cache {
	static {
		initializeIfNecessary();
	}

	private static int sum;

	public static int getSum() {
		initializeIfNecessary();
		return sum;
	}
	//静态初始化块执行时，取的是initialized变量的默认是false，执行完之后变成true，
	//静态变量块执行完，下面还要初始化静态变量（sum和initialized），最后initialized又重新赋值为false了
	private static boolean initialized = false;

	private static synchronized void initializeIfNecessary() {
		if (!initialized) {
			for (int i = 0; i < 100; i++)
				sum += i;
			initialized = true;
		}
	}
}
