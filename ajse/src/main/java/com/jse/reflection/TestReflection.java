package com.jse.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description: 反射基本概念
 * 
 * @createTime: 2014年5月10日 下午11:08:58
 * 
 * @author zenghua
 * 
 * @version 1.0
 */

public class TestReflection {

	public static void main(String[] args) {
		TestReflection t = new TestReflection();
//		t.getMethod();
		t.getField();
	}

	/**
	 * 
	 */
	public void getMethod() {
		AHuman ah = new AHuman();
		Class<?> clazz = ah.getClass();
		try {
			Method m = clazz.getMethod("getAge");
			Integer age = (Integer) m.invoke(ah, new Object[0]);
			System.out.println("age is " + age);
			
			//getMethod与getDeclaredMethod的区别
			Method setColor = clazz.getMethod("setColor", String.class);
			setColor.invoke(ah, "blue");
			
			Method getColor = clazz.getMethod("getColor");
			System.out.println("color is " + getColor.invoke(ah, new Object[0]));
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	public void getField() {
		AHuman ah = new AHuman();
		Class<?> clazz = ah.getClass();
		try {
			Field ageField = clazz.getDeclaredField("age");
			ageField.setAccessible(true);
			ageField.set(ah, 222);
			System.out.println(ageField.getInt(ah));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
