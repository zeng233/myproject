package com.jse.collection.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.Bag;
import org.apache.commons.collections.bag.HashBag;
import org.apache.commons.lang3.ArrayUtils;

/**
 * @description: TODO
 * 
 * @createTime: 2014年4月27日 下午11:58:23
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class TestCommonsUtil {
	public static void main(String[] args) {
		TestCommonsUtil t = new TestCommonsUtil();
		t.letter();
	}

	/**
	 * 统计字母出现次数
	 */
	public void letter() {
		String s = "ajuoauoignlakjklsfjklsf";
		char[] chars = s.toCharArray();

		Character[] array = ArrayUtils.toObject(chars);
		List<Character> list = Arrays.asList(array);
		Bag bag = new HashBag(list);
		Map<String, Integer> map = new HashMap<>();

		for (char i = 0; i < 26; i++) {
			char x = (char)(65+i);
			char y = (char)(97+i);
			
			String lower = String.valueOf(x);
			String upper = String.valueOf(y);
			System.out.println(lower + " : " + upper);
			int m = bag.getCount(lower);
			System.out.println(m);
			int n =bag.getCount(upper);
			
			if (m != 0) {
				map.put(lower, m);
			}
			
			if (n !=0) {
				map.put(upper, n);
			}
		}
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			int max = 0;
			System.out.println(entry.getKey());
			if (entry.getValue() > max) {
				max = entry.getValue();
				String key = entry.getKey();
				System.out.println(key + " : " + max);
			}
		}
	}
}
