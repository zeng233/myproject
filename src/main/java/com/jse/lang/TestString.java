package com.jse.lang;

import java.math.BigDecimal;
import java.util.Collections;

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
//		t.tInt(temp);
//		System.out.println(t.i);
		
		
		String m = "s 2\n4";
		String s = m.replaceAll("\\s", ",");
//		System.out.println(s);
		
		String type="邮政特快";
//		System.out.println(type.contains("特快"));
		if (type.contains("特快")) {
//			System.out.println();
		}
		
//		t.testFormat();
		
		t.testRex();
	}
	
	
	public void testSort(String s) {
//		Collections.sort(list);
	}
	
	//
	public void testFormat() {
		BigDecimal bd = new BigDecimal("39.90");
//		System.out.println(bd.movePointRight(2));
		String s = String.format("%s", bd.movePointRight(2));
		System.out.println(s);
//		
//		
//		String sp = String.format("%s", bd.movePointRight(2));
//		System.out.println(sp);
		
		
		BigDecimal price = new BigDecimal("39.90");
		System.out.println(price.toString());
		String sp = String.format("%s", price.movePointRight(2));
		System.out.println(sp);
		
		System.out.println("tostring:" + price.movePointRight(2).toString());
	}
	
	
	public void testRex() {
		String s = "20100102377892";
		System.out.println(s.replaceAll("\\s", "','"));
	}
	
	public void tString(String s) {
		name = s;
	}
	
	public void tInt(int j) {
		this.i = j;
	}
}
