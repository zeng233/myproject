package com.jse.block.init;

/**
 * @description: TODO
 *
 * @createtime: 2014-1-3 下午4:47:00
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class SuperObject {
	private static String a="aaaaa";
	
	static {
		System.out.println("父类静态代码块");
	}
}
