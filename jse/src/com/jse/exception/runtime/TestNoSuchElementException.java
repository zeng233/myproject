package com.jse.exception.runtime;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @description: 测试运行时异常
 *
 * @createtime: 2013-5-24 上午11:37:19
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestNoSuchElementException {
	public static void main(String[] args) {
		Hashtable<String, String> tables = new Hashtable<>();
		tables.put("a", "b");
		
		for (Enumeration<String> f = tables.elements();f.hasMoreElements();)
			System.out.println(f.nextElement() + "=====");
		//制造运行时异常，后面的代码会一直执行下去
		for (Enumeration<String> e = tables.elements();;) {
			System.out.println(e.nextElement());
//			System.out.println("this is runtime exception");
		}
			
		
	}
}
