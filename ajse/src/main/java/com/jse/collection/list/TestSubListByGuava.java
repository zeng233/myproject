package com.jse.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

/**
 * @description: 
 *
 * @createtime: 2014-2-26 下午4:32:49
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestSubListByGuava {
	public static void main(String[] args) {
		TestSubListByGuava t = new TestSubListByGuava();
		t.testSub();
	}
	
	public void testSub() {
		List<String> plist = new ArrayList<>();
		for (int i=0; i < 202; i++) {
			String s = i + "a";
			plist.add(s);
		}
		int batchSize = 50;
		List<List<String>> list = Lists.partition(plist, batchSize);
		for (List<String> l : list) {
			//批量操作
			System.out.println("拆分后的List size : " + l.size());
		}
	}
}
