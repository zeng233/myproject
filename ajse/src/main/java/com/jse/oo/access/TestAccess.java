package com.jse.oo.access;

import com.jse.oo.polymorphic.Model;

/**
 * @description: 测试类的访问域
 *
 * @createtime: 2013-5-28 下午10:46:53
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestAccess {
	private TestAccess(){}
	
	
	public static void main(String[] args) {
		Model m = new ModelImpl();
		m.t();
//		System.out.println(Math.floor(11.9));
		
		TestAccess t = new TestAccess();
		t.show("aaaa");
	}
	
	public void show(Object obj) {
		System.out.println("this is Object : " + obj);
	}
	
	public void show(String s) {
		System.out.println("this is String : " + s);
	}
}
