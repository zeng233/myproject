package com.jse.lang;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

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
		
//		t.testRex();
		t.testEquals();
		
		
		t.joinString();
	}
	
	/**
	 * 测试字符串连接
	 */
	public void joinString() {
		List<Integer> list =new ArrayList<>();
		Collections.addAll(list, 1,2,3,4);
		String s = StringUtils.join(list, ",");
		System.out.println("字符串连接：" + s);
		
		List<String> ss = new ArrayList<>();
//		Collections.addAll(ss, "a","b","c","d");
		String sql = "in('" + StringUtils.join(ss, "','") + "')";
		System.out.println("SQL:" + sql);
	}
	
	public void testEquals() {
		String s1="ab";
		String s2="c";
		String s3 = s1+s2;
		
		String s4="abc";
		
		final String ss1="ab";
		final String ss2="c";
		String ss = ss1+ss2;
		System.out.println(ss1+ss2);
		System.out.println(s3==s4);
		System.out.println((ss1+ss2)=="abc");
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
