package com.jse.collection.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
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
//		t.testMyIterator();
//		t.testIteratorRemove();
		t.testIteratorVsListIterator();
	}
	
	/**
	 * 分别遍历MyIterables，MyIterator
	 */
	public void testMyIterator() {
		for (int i : new MyIterable(3)) {
//			System.out.println(i);
		}
		
		//增强for循环中，最有一个遍历必须是数组或者集合（实现Iterable接口），次循环编译不通过
//		for (String s : new MyIterator(4)) {
//			
//		}
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
//			System.out.println(s);
			
		}
		//再次遍历
//		loop(set);
		
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "a", "b", "c");
		
		Iterator<String> ite = list.iterator();
		while(ite.hasNext()) {
			String element = ite.next();
			
//			list.iterator();
//			list.isEmpty();
//			list.get(1);
			//如果用Iterator迭代集合，没有使用iterator的remove方法，只要是对集合进行增加或者删除操作都会抛出ConcurrentModificationException
			//这就是 传说中的 fail fast（参考Java Generics and Collections的11.5.2. JDK 1.2: Synchronized Collections and Fail-Fast Iterators） 
//			list.add("d");
//			list.removeAll(list);
//			list.remove(element);
		}
		
		//增强for循环内部也是用iterator来遍历的,如果没用使用Iterator的remove方法，同样会抛出ConcurrentModificationException
		for (String s : list) {
//			list.remove(s);
		}
		
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
	
	/**
	 * Iterator与ListIterator的区别
	 */
	public void testIteratorVsListIterator() {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "a", "b", "c");
		list.add("d");
		//ListIterator迭代有顺序，可以指定从哪个索引开始遍历，只适用于List(可参考ListIterator API),正向迭代
		for (ListIterator<String> ite = list.listIterator(1); ite.hasNext(); ) {
			String s = ite.next();
			//返回对next后续调用所返回元素的索引
			int i = ite.nextIndex();
			System.out.println("正向遍历 " + i +" ：" + s);
		}
		//反向迭代
		for(ListIterator<String> ite = list.listIterator(list.size()); ite.hasPrevious();) {
			String s = ite.previous();
			System.out.println("反向遍历：" + s);
		}
	}
}
