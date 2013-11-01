package com.jse.oo.inner;

/**
 * @description: 测试内部类
 *
 * @createtime: 2013-5-22 上午10:02:16
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestInnerClass {
	private static final int OUTERCONSTANT = 1;
	
	public static void main(String[] args) {
		TestInnerClass t = new TestInnerClass();
		//直接创建内部类
		TestInnerClass.MyInnerClass i1 = t.new MyInnerClass();
//		MyInnerClass i2 = t.new MyInnerClass();
		
		//通过外部类的方法获取内部类对象
		TestInnerClass.MyInnerClass i3 = t.get();
		
		i3.innerDo();
		
		//创建静态InnerStaticClass对象，无需指向外部类的对象的句柄
		InnerStaticClass s = new InnerStaticClass();
	}
	
	public MyInnerClass get() {
		return new MyInnerClass();
	}
	private void outGet() {
		System.out.println("outer class's method outGet()");
	}
	
	
	//该类只能被TestInnerClass访问
	private class MyInnerClass {
		public void innerDo() {
			System.out.println("this is inner class's method innerDo! " + TestInnerClass.OUTERCONSTANT);
			//内部类可以访问外部类的所有属性和方法
			outGet();
		}
		
		public void accessInner() {
			MyInnerObject m = new MyInnerObject();
			m.print();
		}
	}
	
	//只能被TestInnerClass，它的内部类以及子类所访问
	protected class MyInnerObject {
		private int i;
		
		//内部类里面不能有构造函数
//		pulbic MyInnerObject() {}
		
		private void print() {
			System.out.println("protected class's method print()");
		}
	}
	
	static class InnerStaticClass {}
	
	public class T {}
	
	public void dest() {
		//内部方法类只能用final和abstract修饰
		abstract class InnerMethodClass {}
	}
}
