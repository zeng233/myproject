package com.apattern.observer;

/**
 * @description: 
 * 
 * @createtime: 2014-5-19 上午11:09:37
 * 
 * @author zenghua
 * 
 * @version 1.0
 */

public class TestObserver {
	public static void main(String args[]) {
		TestObserver t = new TestObserver();
		t.testProduct();
//		t.testASubject();
//		t.testBSubject();
	}
	
	/**
	 * JDK自带的观察者模式
	 */
	public void testProduct() {
		Product product = new Product();
		ProductNameObserver nameobs = new ProductNameObserver();
		ProductPriceObserver priceObs = new ProductPriceObserver();
		// 加入观察者
		product.addObserver(nameobs);
		product.addObserver(priceObs);
		product.setName("橘子红了");
		product.setName("橘子红了");
		product.setPrice(9.22f);
		product.setPrice(100.0f);
	}
	
	/**
	 * 被观察者的操作由具体类去实现
	 */
	public void testASubject() {
		ASubject subject = new AConcreteSubject();
		AObserver observer = new AConcreteObserver();
		subject.add(observer);
		subject.notifyObservers();
	}
	
	/**
	 * 被观察者的具体实现有抽象类去实现
	 */
	public void testBSubject() {
		BConcreteSubject subject = new BConcreteSubject();
		BObserver observer = new BConcreteObserver();
		subject.add(observer);
		subject.change("newstate");
	}
}
