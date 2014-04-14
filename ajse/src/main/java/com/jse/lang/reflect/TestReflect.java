package com.jse.lang.reflect;

import java.lang.reflect.Method;

import com.jse.oo.interface1.MyAbstractClass;

/**
 * @description: TODO
 * 
 * @createTime: 2014年4月14日 下午11:40:08
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class TestReflect {

	void t() {
	};

	public static void main(String[] args) {
		int a = 0x0001;
		System.out.println(a);

		Class<MyAbstractClass> clazz = MyAbstractClass.class;
		Method[] methods = clazz.getDeclaredMethods();

		for (int i = 0; i < methods.length; i++) {
			Method m = methods[i];
			// 参考Modifier,返回类型,参考JVM4.6
			int flag = m.getModifiers();
			System.out.println(m.getName() + " : " + flag);
		}
	}

}
