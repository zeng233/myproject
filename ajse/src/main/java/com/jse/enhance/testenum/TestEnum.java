package com.jse.enhance.testenum;

/**
 * description: 测试枚举类型基本使用,7中常见的用法
 *
 * createtime: 2012-7-20 上午10:12:53
 *
 * @author zenghua
 * @version 1.0
 */

public class TestEnum {
	public static void main(String[] args) {
		MyEnum myEnum = MyEnum.BLUE;
		System.out.println(myEnum);
//		System.out.println("getName : " + myEnum.getName());
		if (MyEnum.BLUE == myEnum) {
//			System.out.println("true");
		}
		for (MyEnum m : MyEnum.values()) {
			System.out.println(m + ", ordinal is " + m.ordinal());
		}
		
		System.out.println("===============");
		// TODO: 用法二：switch语句支持int、char和枚举类型可以在switch语句中使用
		switch (myEnum) {
		case BLUE:
			System.out.println("this is blue");
			break;
		case RED:
			System.out.println("this is red");
			break;
		default:
			break;
		}
		
		System.out.println("================");
		System.out.println(MyEnumWithMethod.getNames(1));
	}
}


enum MyEnum {
	// TODO: 用法一：public static final的常量可以用枚举来代替
	RED,BLUE,YELLOW;
	
	public String getName() {
		return this.getName();
	}
}

//所有的枚举类型都会继承Enum这个类，所以自定义的枚举不能再继承其他类了，只能实现接口
enum MyEnumWithMethod implements IFather {
	// TODO: 用法三：在枚举中使用方法，枚举类型必须放在最前面，最后一个枚举变量要加上分号";"
	ORANGE(0, "orange"), APPLE(1, "apple"), PEAR(2, "梨");
	private int index;
	private String name;
	
	
	
	//构造函数必须是private私有的
	private MyEnumWithMethod(int index, String name) {
		this.index = index;
		this.name = name;
	}

	public static String getNames(int index) {
		for (MyEnumWithMethod m : MyEnumWithMethod.values()) {
			if (m.ordinal() == index) {
				return m.name + "==";
			}
		}
		return null;
	}
	
	// TODO: 用法四：枚举可以实现接口
	@Override
	public void get() {
		System.out.println("enum override interface");
	}
	
	// TODO: 用法五：重写枚举Enum的方法
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.index + "_" + this.name;
	}
	
	//-----------------------------------------------
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

//interface IEnum {
//	void test();
//}