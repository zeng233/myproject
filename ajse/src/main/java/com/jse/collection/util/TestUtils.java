package com.jse.collection.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @description: 集合之间相互转化
 *
 * @createTime: 2013年12月2日 下午10:17:07
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestUtils {
	public static void main(String[] args) {
		TestUtils t = new TestUtils();
		t.testCollections();
	}
	
	
	/**
	 * 
	 */
	public void testCollections() {
		String[] ss = {"a","b","c","d","1","2","5","6","7","8","9","99","88","77","66","55","44","33","22","dd","gg","hh"};
		List<String> list = new ArrayList<>();
		Collections.addAll(list,ss);
		System.out.println(list.size());
	}
}
