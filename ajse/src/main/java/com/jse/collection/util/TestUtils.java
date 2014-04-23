package com.jse.collection.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		t.testCollectionsAddAll();
	}

	/**
	 * Collections批量增加元素
	 */
	public void testCollectionsAddAll() {
		String[] ss = { "a", "b", "c", "d", "1", "2", "5", "6", "7", "8", "9",
				"99", "88", "77", "66", "55", "44", "33", "22", "dd", "gg",
				"hh" };
		List<String> list = new ArrayList<>();
		Collections.addAll(list, ss);
		System.out.println(list.size());
	}

	/**
	 * 获取同步的集合
	 */
	public void testConcurrentCollection() {
		Map<String, Object> map = new HashMap<>();
		// 此Map与 ConcurrentHashMap的区别，
		// ConcurrentHashMap的key和value不可以为null，而HashMap可以
		Map<String, Object> synMap = Collections.synchronizedMap(map);
		
		List<String> list = Collections.synchronizedList(new ArrayList<String>());
	}
}
