package com.jse.oo.polymorphic;

/**
 * @description: 模拟对象
 *
 * @createtime: 2013-5-28 下午10:47:38
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class Model {

	protected void test() {
		System.out.println(" this is Model's method ===test()");
	}
	
	public synchronized  void   t() {}
	
	
	public Model me() {
		//this表示当前的Object，如果子类构造一个实例，就代表子类
		return this;
	}
}
