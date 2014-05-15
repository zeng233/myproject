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
		int i = 00_5_2;
		System.out.println(i);
		
		TestInteger t = new TestInteger();
		t.testEquals();
		
		int x=1;
		char y='a';
		int sum = x+y;
//		x+=y;
		long z = 2;
//		x+z;
		System.out.println(sum);
	}
	
	/**
	 * Interger里面有缓存,参考java解惑
	 */
	public void testEquals() {
		Integer i = 1;
		Integer j = 1;
		Short m = 1;
		Long la = 1L;
		
		Integer a = 128;
		Integer b = 128;
		
		Integer c = 127;
		Integer d = 127;
		
		
		Integer m1 = new Integer(1);
		Integer m2 = new Integer(1);
		System.out.println("m1==m2 : " + (m1==m2));
		
		System.out.println(i == j);
		System.out.println(a.equals(b));
		System.out.println("a==b: " + (a==b));
		System.out.println("c==d: " + (c==d));
//		System.out.println(i==m);//编译不会通过，参考JSL15.21.1
//		System.out.println(i==la);
		System.out.println(m.equals(i));
		
		String k = "12354";
		System.out.println(Integer.getInteger(k));
		
		Short st1 = 127;
		Short st2 = 127;
		System.out.println("st1==st2:" +(st1==st2));
		
		
		int sum = i+m;
		System.out.println(sum);
	}
	
}
