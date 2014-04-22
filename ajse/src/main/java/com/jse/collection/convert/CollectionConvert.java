package com.jse.collection.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @description: 数组与List、Set、Map之间的转换
 * 
 * @createTime: 2014年3月18日 上午12:03:29
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class CollectionConvert {
	public static void main(String[] args) {
		CollectionConvert c = new CollectionConvert();
		c.convert();
	}

	/**
	 * 数组与List、Set、Map之间的转换
	 */
	public void convert() {
		List<Integer> ilist = new ArrayList<>();
		ilist.add(1);
		ilist.add(2);
		// List转换成数据
		Integer[] nums = ilist.toArray(new Integer[0]);
		// 对象类型的数组，转换为基本类型数据
		int[] inums = ArrayUtils.toPrimitive(nums);

		int[] nn = new int[] { 1, 2, 3, 4 };
		List<Integer> iilist = Arrays.asList(ArrayUtils.toObject(nn));
		
		String[] array = new String[] { "a", "b", "c" };
		// 数组转化成List
		List<String> list = Arrays.asList(array);
		// list.add("aslist");返回的是Arrays中的list没有重写add方法，用AbstractList的add方法抛异常
		System.out.println("list size : " + list.size());
		// list转换成Set
		Set<String> set = new HashSet<>(list);
		System.out.println("set size : " + set.size());

		// set转换成list
		set.add("set转换成list");
		List<String> mylist = new ArrayList<>(set);
		for (String s : mylist) {
			System.out.println("mylist : " + s);
		}
		// Map转化成List、Set
		assert 6 == 7;
	}
}
