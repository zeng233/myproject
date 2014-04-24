package com.jse.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @description: TODO
 *
 * @createtime: 2013-9-4 下午4:50:09
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestSet {
	public static void main(String[] args) {
		TestSet t = new TestSet();
		t.testLoop();
		t.testNull();
	}
	
	public void testLoop() {
		List<String> list = new ArrayList<>();
		list.add("d");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("Z");
		list.add("A");
		
		//list转换为set,排除重复元素
		Set<String> set = new HashSet<>(list);
//		Collections.addAll(set, "e","f","g","h");
		
		for (String s : set) {
//			System.out.println(s);
		}
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String s : list) {
//			System.out.println(s);
		}
	}
	
	/**
	 * Set最多可以有一个null值，list可以有多个null
	 * 
	 */
	public void testNull() {
		Set<String> set = new HashSet<>();
		Collections.addAll(set, null, "a", "b");
		for (Iterator<String> ite=set.iterator(); ite.hasNext(); ) {
			System.out.println("set's value is " + ite.next());
		}
		
		List<String> list = new ArrayList<>();
		Collections.addAll(list, null, null, null, "z");
		for (int i=0; i<list.size(); i++) {
			System.out.println("list " + i + " is " + list.get(i));
		}
		
	}
}
