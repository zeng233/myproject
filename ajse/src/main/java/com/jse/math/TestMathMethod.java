package com.jse.math;

/**
 * @description: TODO
 *
 * @createtime: 2014-3-17 上午11:02:32
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestMathMethod {
	public static void main(String[] args) {
		TestMathMethod t = new TestMathMethod();
		t.testFloor();
	}
	
	public void testFloor() {
		int i = (int)Math.floor(5.1);
		System.out.println(i);
	}
}
