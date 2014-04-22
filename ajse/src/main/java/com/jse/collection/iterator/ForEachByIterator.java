package com.jse.collection.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @description: TODO
 *
 * @createTime: 2014年4月21日 下午11:30:50
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class ForEachByIterator {
	public static void main(String[] args) {
		ForEachByIterator t = new ForEachByIterator();
		t.loopList();
	}
	
	public void loopList() {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "a", "b", "c");
		
		//JDK5之前，iterator迭代器，方便迭代
		for (Iterator<String> ite = list.iterator(); ite.hasNext();) {
			System.out.println(ite.next());
		}
		System.out.println("==============================");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
