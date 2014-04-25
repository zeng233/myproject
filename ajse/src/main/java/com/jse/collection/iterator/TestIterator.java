package com.jse.collection.iterator;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

/**
 * @description: Iterator与Iterable的区别：Iterator实现该接口表示一个单独的对象，Iterable集合继承该类，
 * 				Iterable.iterator（返回的Iterator是有状态的，返回的Iterator不一样）
 *
 * @createtime: 2013-5-24 上午11:23:09
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestIterator {
	public static void main(String[] args) {
		TestIterator t = new TestIterator();
		t.testMyIterator();
		t.testIteratorRemove();
	}
	
	public void testMyIterator() {
		for (int i : new MyIterator(3)) {
//			System.out.println(i);
		}
	}
	
	/**
	 * iterator没有用remove方法就会抛异常
	 * @param set
	 */
	public void testIteratorRemove() {
		Set<String> set = new HashSet<>();
		Collections.addAll(set, "a","b","c");
		
		for (Iterator<String> ite = set.iterator(); ite.hasNext();) {
			String s = ite.next();
//			ite.remove();//防止ConcurrentModificationException，该元素为Iterator逻辑上的元素，如果去掉该方法则抛异常
			System.out.println(s);
			
		}
		//再次遍历
		loop(set);
	}
	
	public void loop(Set<String> set) {
		for (String ss :set) {
			set.remove(ss);
		}
	}
	
	/**
	 * Iterator与Enumeration之间的区别
	 */
	public void testIteratorVsEnumeration() {
		Vector<String> vector = new Vector<>();
		Collections.addAll(vector, "a","b","c");
		
		//EnumerationJDK1.0出现
		for(Enumeration<String> en = vector.elements(); en.hasMoreElements();) {
			String s = en.nextElement();
		}
		
		//Iterator是JDK1.2之后出现，增加了remove方法
		for (Iterator<String> ite = vector.iterator(); ite.hasNext();) {
			String s = ite.next();
		}
		
	}
}
