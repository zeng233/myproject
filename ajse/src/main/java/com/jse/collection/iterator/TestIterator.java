package com.jse.collection.iterator;

/**
 * @description: Iterator与Iterable的区别：Iterator是为了遍历当前节点的元素，Iterable表示获取一个Iterator对象（是有状态的，返回的Iterator不一样）
 *
 * @createtime: 2013-5-24 上午11:23:09
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestIterator {
	public static void main(String[] args) {
		TestIterator t = new TestIterator();
		t.testMyIterator();
	}
	
	public void testMyIterator() {
		for (int i : new MyIterator(3)) {
			System.out.println(i);
		}
	}
}
