package com.jse.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 *
 * @createTime: 2014年2月10日 下午10:51:17
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestArrayListMethod {
	public static void main(String[] args) {
		TestArrayListMethod t = new TestArrayListMethod();
		t.testAddALL();
	}
	
	public void testAddALL() {
		List<String> list = new ArrayList<>();
		//add可以为空
		list.add(null);
		System.out.println("list's size : " + list.size());
		List<String> ss = null;
		//参考api参数说明不能为空或者自己，不然会有空指针异常
//		list.addAll(ss);
		System.out.println("after addAll list's size: " + list.size());
		
		for (String s : list) {
			System.out.println(s);
		}
 	}
}
