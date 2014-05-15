package com.jse.operation;

/**
 * @description: 运算符操作
 *
 * @createTime: 2014年3月24日 下午11:34:36
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestOperation {
	public static void main(String[] args) {
		TestOperation t = new TestOperation();
		System.out.println(((1 << 30) *0.75));
		t.bitOperate();
	}
	
	/**
	 * +=复合操作符
	 */
	public void testAdd() {
		int i = 1;
		long j = 7;
//		i = i+j;不能编译
		i+=j;//编译通过，参考http://docs.oracle.com/javase/specs/jls/se8/html/jls-15.html#jls-15.26.2
		System.out.println(i);
	}
	
	/**
	 * 位操作符（用于二进制计算）
	 */
	public void bitOperate() {
		int i = 1;
		int j = 2;
		System.out.println(i | j);
		System.out.println(i & j);
		System.out.println(i ^ j);//异或运算，同数字取0，否则取1
		System.out.println(~j);//运算公式为(-j)-1
//		System.out.println(i++);
	}
}
