package com.apattern.observer;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月19日 下午10:40:25
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class AConcreteObserver implements AObserver  {

	@Override
	public void update() {
		System.out.println("AConcreteObserver is update!");
	}

}
