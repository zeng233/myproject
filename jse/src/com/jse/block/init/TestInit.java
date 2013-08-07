package com.jse.block.init;

/**
 * @description: 测试类的初始化过程
 *
 * @createtime: 2013-5-28 下午10:07:59
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestInit { 
	private String s = "一般常量";
	
	private static String CONSANT = "静态常量";
	
	{
		System.out.println("一般的代码块");
	}
	
	static {
		System.out.println("静态代码块");
	}
	
	public TestInit() {
		System.out.println("初始化函数");
	}
	
	public static void main(String[] args) {
		TestInit t = new TestInit();
	}
}
