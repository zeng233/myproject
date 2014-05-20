package com.apattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月19日 下午11:08:53
 *
 * @author zenghua
 *
 * @version 1.0
 */
public abstract class BSubject {
	private List<BObserver> observers = new ArrayList<BObserver>();
	
	public void add(BObserver observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}
	
	public void remove(BObserver observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers(String state) {
		if (!observers.isEmpty()) {
			for (BObserver b : observers) {
				b.update();
			}
		}
	}
}
