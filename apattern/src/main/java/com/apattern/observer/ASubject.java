package com.apattern.observer;

/**
 * @description: 被观察者
 *
 * @createTime: 2014年5月19日 下午9:56:35
 *
 * @author zenghua
 *
 * @version 1.0
 */
public interface ASubject {
	void add(AObserver observer);
	void remove(AObserver observer);
	void notifyObservers();
}
