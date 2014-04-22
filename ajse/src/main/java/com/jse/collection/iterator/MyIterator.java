package com.jse.collection.iterator;

import java.util.Iterator;

/**
 * @description: TODO
 *
 * @createTime: 2014年4月16日 上午12:03:24
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class MyIterator implements Iterable<Integer> {
	private int count;
	
	public MyIterator(int i) {
		this.count = i;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			private int i = 0;
			public boolean hasNext() { return i < count; }
			public Integer next() { i++; return i; }
			public void remove(){ throw new UnsupportedOperationException(); }
		};
	}

}
