package com.jse.collection.list;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * @description: TODO
 * 
 * @createTime: 2014年4月24日 下午11:45:00
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class TestVector {
	public static void main(String[] args) {
		TestVector t = new TestVector();
		t.testLoop();
	}

	/**
	 * Enumeration方式来迭代，Iterator是其升级版
	 */
	public void testLoop() {
		Vector<String> list = new Vector<String>();
		Collections.addAll(list, "a", "b", "c");
		
		for (Enumeration<String> en = list.elements(); en.hasMoreElements();) {
			System.out.println("enumeration's element is " + en.nextElement() );
		}
		
		for (Iterator<String> ite = list.iterator(); ite.hasNext();) {
			System.out.println("iterator's element is " + ite.next());
		}
	}
}
