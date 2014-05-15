package com.jse.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @description: TODO
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
		t.getMethod();
	}

	public void getMethod() {
		AHuman ah = new AHuman();
		try {
			Method m = ah.getClass().getMethod("getAge");
			Integer age = (Integer) m.invoke(ah, new Object[0]);
			System.out.println(age);
		} catch (NoSuchMethodException | SecurityException
				| IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
