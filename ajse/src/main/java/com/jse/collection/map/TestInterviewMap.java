package com.jse.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @description: TODO
 *
 * @createTime: 2014年3月24日 下午10:53:42
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestInterviewMap {
	public static void main(String[] args) {
		TestInterviewMap t = new TestInterviewMap();
		t.testHashMap();
		
//		t.testHashMapVsHashTable();
	}
	
	/**
	 * HashMap是如何工作的
	 */
	public void testHashMap() {
		Map<String,Object> map = new HashMap<>();
		map.put(null, "a");
//		map.put(null, "b");
//		map.put("1", "1");
//		map.put("1", "a");
		
		for (Entry<String,Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("key: " + key + ", " + "value:" + value);
		}
	}
	
	/**
	 * hashmap与hashtable的区别（参考hashmap中文api）
	 */
	public void testHashMapVsHashTable() {
		Map<String, Object> table = new Hashtable<>();
		//key如果为空，直接抛空指针异常
		table.put(null, "1");
		
		for (Entry<String, Object> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
