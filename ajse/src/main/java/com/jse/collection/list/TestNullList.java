package com.jse.collection.list;

import java.util.List;

/**
 * @description: TODO
 *
 * @createtime: 2014-2-18 下午4:10:36
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestNullList {
	public static void main(String[] args) {
		List<String> list = null;
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
