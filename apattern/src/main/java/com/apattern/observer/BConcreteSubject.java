package com.apattern.observer;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月19日 下午11:15:08
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class BConcreteSubject extends BSubject {
	private String state;
	
	public void change(String newState) {
		this.state = newState;
		//这里可以把当前的被观察对象，以及状态传递给观察者
		this.notifyObservers(state);
	}
}
