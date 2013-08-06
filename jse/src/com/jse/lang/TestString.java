package com.jse.lang;

/**
 * @description: 值传递、引用传递
 *
 * @createtime: 2013-6-12 下午10:33:00
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestString {
	private String name ="first";
	private int i = 1;
	
	public static void main(String[] args) {
		TestString t = new TestString();
		int temp = 2;
		t.tInt(temp);
//		System.out.println(t.i);
		
		
		String m = "s 2\n4";
		String s = m.replaceAll("\\s", ",");
		System.out.println(s);
	}
	
	public void tString(String s) {
		name = s;
	}
	
	public void tInt(int j) {
		this.i = j;
	}
}
