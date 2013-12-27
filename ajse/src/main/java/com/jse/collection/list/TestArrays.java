package com.jse.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

/**
 * @description: TODO
 *
 * @createtime: 2013-11-7 上午10:10:44
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestArrays {
	public static void main(String[] args) {
		TestArrays t = new TestArrays();
//		t.testAsList();
		
		
		
		List<String> list = new ArrayList<>();
		System.out.println(CollectionUtils.isNotEmpty(list));
	}
	
	/**
	 * Arrays.asList返回的List是它的一个内部类，没有对add,remove进行重写，
	 * 所以增加删除操作都用的AbstractList没有实现的add和remove方法
	 */
	public void testAsList() {
		Integer[] arr = {1,4,5,2,34};
		List<Integer> arrays= Arrays.asList(arr);
//		Arrays.asList(arr).remove(0);
		
		//如果要转换为可增加删除的List,要进行转换
		List<Integer> list=new ArrayList<>(arrays);
		
	}
}
