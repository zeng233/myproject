package com.jse.collection.iterator;

import java.util.Iterator;

/**
 * @description: TODO
 *
 * @createTime: 2014年4月26日 下午8:34:12
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class MyIterator implements Iterator<String> {
	private int i;
	
	public MyIterator(int i) {
		this.i = i;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}
	
}
