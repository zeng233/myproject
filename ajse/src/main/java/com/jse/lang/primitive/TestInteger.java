package com.jse.lang.primitive;

/**
 * @description: TODO
 *
 * @createTime: 2014年2月12日 下午9:58:40
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestInteger {
	public static void main(String[] args) {
		int i = 5_2;
		System.out.println(i);
		
		TestInteger t = new TestInteger();
		t.testEquals();
	}
	
	/**
	 * Interger里面有缓存
	 */
	public void testEquals() {
		Integer i = 1;
		Integer j = 1;
		
		Integer a = 333;
		Integer b = 333;
		System.out.println(i == j);
		System.out.println(a.equals(b));
		
		String k = "12354";
		System.out.println(Integer.getInteger(k));
	}
}
