package com.apattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: 观察者
 * 
 * @createtime: 2014-5-19 上午11:06:50
 * 
 * @author zenghua
 * 
 * @version 1.0
 */

public class ProductNameObserver implements Observer {

	private String name = null;

	@Override
	public void update(Observable obj, Object arg) {
		if (arg instanceof String) {
			name = (String) arg;
			// 产品名称改变值在name中
			System.out.println("ProductNameObserver :name changed to " + name);
		}
	}
}
