package com.jse.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @description: 测试HashMap
 *
 * @createtime: 2013-5-27 上午10:11:46
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestHashMap {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("1", null);
		map.put("1", "11111");
		map.put("1", "a");
		map.put("2", "b");
		map.put("3", "c");
		map.put("4", "d");
		map.put("5", "e");
		map.put("6", "f");
		
		TestHashMap tm = new TestHashMap();
		tm.loopMap(map);
	}
	
	/**
	 * 遍历map的三种形式
	 * @param map
	 */
	public void loopMap(Map<String, Object> map) {
		if (map != null) {
			//for循环遍历map
			System.out.println("=================Map.Enty========================");
			for (Entry<String, Object> entry : map.entrySet()) {
				System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
			}
			
			Set<String> set = map.keySet();
			System.out.println("=============通过KEY去拿值==============");
			for (String key : set) {
				System.out.println("key: " + key + ", value: " + map.get(key));
			}
			
			
			System.out.println("=================Iterator遍历===================");
			Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
			while (iterator.hasNext()) {
				Map.Entry<String, Object> entry = iterator.next();
				System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
			}
			
			
			System.out.println("===============直接遍历values=================");
			Collection<Object> collection = map.values();
			Iterator<Object> ite = collection.iterator();
			while(ite.hasNext()) {
				System.out.println("value: " + ite.next());
			}
			
			
		}
	}
}
