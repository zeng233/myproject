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
	}
	
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
	}
}
