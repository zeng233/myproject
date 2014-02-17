package com.jse;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @description: TODO
 *
 * @createtime: 2013-10-16 下午2:03:59
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class Test {
	private static final Log log = LogFactory.getLog(Test.class);
	private int size;
	
	public static void main(String[] args) {
		Test t = new Test();
		List<String> list = null;
		CollectionUtils.isNotEmpty(list);
		
		t.test1(t);
		System.out.println(t.getSize());
		log.info("testddddddddddddddddd");
	}
	
	public void test1(Test t) {
		t.test(size++);
	}
	
	public void test(int size) {
	}
	
	public int getSize() {
		return size;
	}
}
