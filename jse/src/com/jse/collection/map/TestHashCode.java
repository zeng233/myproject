package com.jse.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 测试HashCode
 *
 * @createtime: 2013-6-5 上午9:55:01
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestHashCode {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("1", "a");
		System.out.println(map.get("0"));
	}
}
