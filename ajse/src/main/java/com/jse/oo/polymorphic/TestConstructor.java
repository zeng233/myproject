package com.jse.oo.polymorphic;

/**
 * @author Administrator
 *
 */
public class TestConstructor {
	public static void main(String[] args) {
		Meal m = new Lunch("dd");
		System.out.println(m);
	}
}

class Meal {
	public Meal() {
		System.out.println("Meal()");
	}
	
	public Meal(String s) {}
}

class Lunch extends Meal {
//	public Lunch() {
//		System.out.println("Lonch()");
//	}
	
	//如果父类没有无参的构造函数，就要用super关键字构造一个父类的构造函数，这样的作用是检查对象是否得到正确的构建
	public Lunch(String s) {
		super(s);
	}
}