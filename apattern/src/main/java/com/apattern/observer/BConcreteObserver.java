package com.apattern.observer;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月19日 下午11:07:38
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class BConcreteObserver implements BObserver {

	@Override
	public void update() {
		System.out.println("BConcreteObserver is update!");
	}

}
