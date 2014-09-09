package com.jse.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * @description: TODO
 *
 * @createTime: 2014年1月18日 下午10:33:52
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestArrayList {
	public static void main(String[] args) {
		TestArrayList t = new TestArrayList();
//		t.createListByGuava();
		
		List<String > list = null;
		t.initList(list);
//		list.add("123");//空指针异常
//		System.out.println(list.size());
		
		String[] array = new String[]{};
		for (String s : array) {
			System.out.println(s);
		}
	}
	
	/**
	 * 通过Guava创建List
	 */
	public void createListByGuava() {
		List<String> list = Lists.newArrayList(new String[]{"a","b","c"});
		for (String s : list) {
			System.out.println(s);
		}
	}
	
	/**
	 * 
	 */
	public void initList(List<String> list) {
		if (list == null) {
			list = new ArrayList<>();
		} else {
			list.clear();
		}
	}
}
