/**
 * 
 */
package com.jse.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Administrator
 *
 */
public class TestMap {
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("1", "a");
		Map<String, Object> mm = new HashMap<>(map);
		mm.put("2", "b");
		for (Map.Entry<String, Object> entry : mm.entrySet()) {
//			System.out.println("key: " + ",value: " + entry.getValue());
		}
		
		Iterator<String> iter = mm.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
