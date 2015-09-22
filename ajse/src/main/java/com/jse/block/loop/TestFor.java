package com.jse.block.loop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @description: TODO
 *
 * @createtime: 2013-5-23 上午9:59:18
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestFor {
	public static void main(String[] args) {
		int count = 0;
		//
		for (;;) {
			System.out.println(1);
			count++;
			if (count > 10) break;
		}
		
		//第一个表达式初始化，第二个终止条件，第三个自动更新条件
		for (int i = 0; i < 20; i++) {
			
		}
		
		//增强for循环针对集合和数组
		int[] nums = {1,2,3,6};
		for (int num : nums) {
//			System.out.println(num);
		}
		for (int num : nums) {}
		
		List<String> names = new ArrayList<>();
//		names.add("a");
//		names.add("b");
		for (Iterator<String> s=names.iterator(); s.hasNext();) {
			System.out.println(s.next());
		}
		
		
		
		
		
		TestFor t = new TestFor();
		t.testForEach();
	}
	
	public void testForEach() {
	    List<Integer> list = new ArrayList<Integer>();
	    Collections.addAll(list, 1, 2, 3);
	    for (Integer i : list) {
	        System.out.println("===============" + i);
	    }
	}
}
