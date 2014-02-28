package com.jse.lang.primitive;

/**
 * @description: 值传递还是引用传递，参考：http://stackoverflow.com/questions/40480/is-java-pass-by-reference
 *
 * @createtime: 2014-2-28 上午9:49:33
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestSwap {
	public static void growup(int age) {
		age += 1;
		System.out.println(age);
	}

	public static void main(String[] args) {
		String name = "Tom";
		int age = 13;
		growup(age);
		System.out.println(name + " grew up. He is " + age + " years old now.");
	}
}
