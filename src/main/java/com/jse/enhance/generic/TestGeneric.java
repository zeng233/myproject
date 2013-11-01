package com.jse.enhance.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 *
 * @createtime: 2013-8-6 上午10:16:51
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestGeneric {
	public static void main(String[] args) {
		//JSE7泛型新特性
		List list = new ArrayList<>();
		
		
		MyClass<Integer> myObject = new MyClass<>("");
	}
}
