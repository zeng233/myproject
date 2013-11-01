package com.jse.enhance.generic;

/**
 * @description: TODO
 *
 * @createtime: 2013-8-6 上午10:29:08
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class MyClass<X> {
	private String s;
	
	public MyClass(int i) {}
	
	public <T> MyClass(T t) {
		this.setS(t);
	}
	
	
	public <T> void setS(T t) {
		this.s = s;
	}
	
	
}
