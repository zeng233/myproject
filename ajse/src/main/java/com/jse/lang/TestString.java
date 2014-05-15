package com.jse.lang;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
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
	
	private static String as ="a";
	private static String bs ="b";
	
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
		
//		t.testContains();
//		t.joinString();
	}
	
	public void testContains() {
		String s = "A-";
		if (s.contains("A")) {
			System.out.println(true);
		}
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
		Collections.addAll(ss, "a","b","c","d");
		String sql = "in('" + StringUtils.join(ss, "','") + "')";
		System.out.println("SQL:" + sql);
	}
	
	/**
	 * 字符串创建对象
	 * 
	 * final解惑，参考http://stackoverflow.com/questions/19418427/comparing-strings-with-which-are-declared-final-in-java/19418517#19418517
	 */
	public void testEquals() {
		String s1="ab";
		String s2="c";
		//变量创建对象在运时候创建，参考jsl 3.10.5 String Literals
		String s3 = s1+s2;
		
		String s4="abc";
		
		//final类型的字符串常量是不可变的，在编译时就赋值了
		final String ss1="ab";
		final String ss2="cd";
		String ss = ss1+ss2;
		System.out.println(ss1+ss2);//abc
		System.out.println(s3==s4);//false
		System.out.println(s3.intern()==s4.intern());//当s3.equals(s4)为true时，此表达式才返回true
		System.out.println((ss1+ss2)=="abcd");//true，参考4.12.4. final Variables，
		System.out.println(ss=="abcd");
		System.out.println((as+bs)==s1);
		
		
		int i = 1;
		int j = 1;
		String sum = "s" + 1+1;
		System.out.println(sum);
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
	
	/**
	 * 注意Sting有几个方法，传参用的正则表达式，如：replaceAll
	 */
	public void testRex() {
		String s = "20100102377892";
		System.out.println(s.replaceAll("\\s", "','"));
		
		String orders = "2013 2014";
		String[] array = orders.split("\\s");
		List<String> list = Arrays.asList(array);
		System.out.println(list.size());
		
		String slash = "sajfl\\sdf";
		//TODO未替换成功(搞明白\转义，参考Pattern api文档，以及规范)
		System.out.println(slash.replaceAll("\\\\", "\\\\"));
	}
	
	public void tString(String s) {
		name = s;
	}
	
	public void tInt(int j) {
		this.i = j;
	}
}
