package com.jse.math;

import java.math.BigDecimal;

/**
 * @description: TODO
 *
 * @createtime: 2013-9-5 下午5:24:34
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestBigDecimal {
	public static void main(String[] args) {
		TestBigDecimal test = new TestBigDecimal();
		test.testConstruct();
		
	}
	
	
	/**
	 * 构造bigdecimal函数的时候，最好用String已避免精度丢失
	 */
	public void testConstruct() {
		//直接double类型，造成精度丢失
		BigDecimal price = new BigDecimal(39.90);
		String sp = String.format("%s", price.movePointRight(2));
		System.out.println("构造函数用double：" + sp);
		
		//是否有精度丢失？？？？
		long p = (long)(price.doubleValue() * 100);
		System.out.println(p);
		
		
		BigDecimal bd = new BigDecimal("39.90");
		String s = String.format("%s", bd.movePointRight(2));
		System.out.println("构造函数用String：" + s);
	}
}
