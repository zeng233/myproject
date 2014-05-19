package com.apattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * 
 * @createTime: 2014年5月19日 下午10:34:10
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class AConcreteSubject implements ASubject {
	private List<AObserver> observers = new ArrayList<AObserver>();// 同步问题，使用Vector

	@Override
	public void add(AObserver observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	@Override
	public void remove(AObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		if (!observers.isEmpty()) {
			for (AObserver a : observers) {
				a.update();
			}
		}
	}

}
