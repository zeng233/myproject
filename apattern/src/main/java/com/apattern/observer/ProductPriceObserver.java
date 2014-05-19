package com.apattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @description: TODO
 *
 * @createtime: 2014-5-19 下午2:01:12
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class ProductPriceObserver implements Observer {
	private float price = 0;

	@Override
	public void update(Observable o, Object arg) {
		if (arg instanceof Float) {
			price = ((Float) arg).floatValue();
			System.out.println("ProductPriceObserver :price changed to " + price);
		}
	}

}
