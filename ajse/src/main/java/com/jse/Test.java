package com.jse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.alibaba.fastjson.JSON;

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
		
		String s = "1";
//		System.out.println(s+ 1L);
//		List<String> list = null;
//		CollectionUtils.isNotEmpty(list);
//		
//		t.test1(t);
//		System.out.println(t.getSize());
//		log.info("testddddddddddddddddd");
		
//		t.convert();
//		t.jsonMap();
		
		System.out.println(Long.valueOf(null));
	}
	
	public void test1(Test t) 
	{
		t.test(size++);
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(map);
	}
	
	public void test(int size) {
	}
	
	public int getSize() {
		return size;
	}
	
	public void convert() {
		List<Long> list = new ArrayList<Long>();
//		list.add(1L);
		System.out.println(list.toArray(new Long[0]).length);
	}
	
	public void jsonMap() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("sessionId", "123456");
		map.put("entry", new Test());
		System.out.println(JSON.toJSONString(map));
	}
}
