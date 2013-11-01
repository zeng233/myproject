package com.jse.collection.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @description: TODO
 *
 * @createtime: 2013-9-4 下午4:50:09
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestSet {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("b");
		//list转换为set
		Set<String> set = new HashSet<>(list);
		
		for (String s : set) {
//			System.out.println(s);
		}
		
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
		
		Object[] objs = {"zeng", "华", "a", "订单"};
		System.out.println("原始：" + objs);
		for(int i=0; i<objs.length; i++) {
			System.out.print(objs[i] + " ");
		}
		System.out.println();
		Arrays.sort(objs);
		for(int i=0; i<objs.length; i++) {
			System.out.print(objs[i] + " ");
		}
	}
}
