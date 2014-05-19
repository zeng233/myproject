package com.apattern.observer;

import java.util.Observable;

/**
 * @description: 目标对象，被观察者
 * 
 * @createtime: 2014-5-19 上午10:46:21
 * 
 * @author zenghua
 * 
 * @version 1.0
 */

public class Product extends Observable {

	private String name;
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		setChanged();
		// 设置变化点，name的值发生变化了，状态才改变
//		if (!name.equals(this.name)) {
//			setChanged();
//		}
		notifyObservers(name);
		
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
		// 设置变化点
		setChanged();
		notifyObservers(new Float(price));
	}
}
