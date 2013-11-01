package com.jse.lang.primitive;

/**
 * @description: 测试原始数据类型
 *
 * @createtime: 2013-6-14 上午10:37:51
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestPrimitive {
	public static void main(String[] args) {
		TestPrimitive t = new TestPrimitive();
		byte num = 8;
		t.testPrecision(num);
		
//		t.convertToInteger("0000000081");
	}
	
	/**
	 * 原始数据类型扩容、精度问题，参考 java解惑，类似于 Puzzle 3: Long Division
	 * @param num
	 */
	public void testPrecision(byte num) {
		//10默认是int类型，强转成short类型，short的范围比byte大，最后 的乘积就是short类型，
		//除以1.5的结果本是double类型的，但最后转成以f结尾的浮点数
		float result = (short)10*num/1.5f;
		double d = (short)10*num/1.5;
		System.out.println(result);
		System.out.println(d);
	}
	
	/**
	 * 字符转换成整数
	 * @param s
	 */
	public void convertToInteger(String s) {
		System.out.println("parseInt: " + Integer.parseInt(s));
		System.out.println("valueOf: " + Integer.valueOf(s));
	}
	
	
	public void test(String... arguments) {
		if (arguments != null) {
			for (String s : arguments) {
				System.out.println(s);
			}
		}
	}
}
