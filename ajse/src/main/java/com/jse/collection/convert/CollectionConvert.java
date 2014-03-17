package com.jse.collection.convert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	public void convert() {
		String[] array = new String[]{"a", "b", "c"};
		//转化成List
		List<String> list = Arrays.asList(array);
		System.out.println("list size : " + list.size());
		//转换成Set
		Set<String> set = new HashSet<>(list);
		System.out.println("set size : " + set.size());
		//Map转化成List、Set
	}
}
