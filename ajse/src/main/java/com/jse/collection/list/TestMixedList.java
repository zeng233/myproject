package com.jse.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.ListUtils;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月2日 下午9:23:54
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestMixedList {
	public static void main(String[] args) {
		TestMixedList t = new TestMixedList();
		t.testListUtils();
	}
	
	/**
	 * ListUtils方法测试
	 */
	public void testListUtils() {
		List<String> list1 = new ArrayList<>();
		Collections.addAll(list1, "a", "b", "c");
		List<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "c", "a", "y");
		//提取两个集合相同的元素
		List<String> listAll = ListUtils.intersection(list1, list2);
		if (CollectionUtils.isNotEmpty(listAll)) {
			for (String s : listAll) {
				System.out.println(s);
			}
		}
		
		//第一个list1减去第二个list2在list1中包含的元素，返回一个新的List
		List<String> list = ListUtils.subtract(list1, list2);
//		System.out.println(list.size());
		for (String s : list) {
			System.out.println(s);
		}
		
		boolean r = false;
		r |= true;
//		System.out.println(r);
	}
}
