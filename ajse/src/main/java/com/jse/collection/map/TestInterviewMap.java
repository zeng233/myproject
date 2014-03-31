package com.jse.collection.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.Assert;

/**
 * @description: TODO
 *
 * @createTime: 2014年3月24日 下午10:53:42
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestInterviewMap {
	public static void main(String[] args) {
		TestInterviewMap t = new TestInterviewMap();
		t.testHashMap();
		
//		t.testHashMapVsHashTable();
	}
	
	/**
	 * HashMap是如何工作的
	 */
	public void testHashMap() {
		Map<Object,Object> map = new HashMap<>();
		map.put(null, "a");
		map.put(null, "b");
		map.put("1", "1");
		map.put("1", "a");//key相同覆盖前面的内容
		
		for (Entry<Object,Object> entry : map.entrySet()) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println("key: " + key + ", " + "value:" + value);
		}
		
		Map<Person,String> map1 = new HashMap<>();
		Person p = new Person();
		p.setId(1);
		p.setName("person");
		map1.put(p, p.getName());
		
		Assert.assertEquals(p.getName(), "person");
		p.setName("pp");
		for (Person person : map1.keySet()) {
//			Assert.assertEquals(person.equals(p), true);
//			Assert.assertEquals(person.hashCode(), p.hashCode());
			System.out.println(person.equals(p));
			System.out.println(person.hashCode()==p.hashCode());
		}
		System.out.println(map1.get(p).equals("pp"));//map的可以不可变
		
		//hashmap与hashtable的区别（参考hashmap中文api）
		Map<String, Object> table = new Hashtable<>();
		//key如果为空，直接抛空指针异常
//		table.put(null, "1");
		table.put("s", "s");
		
		for (Entry<String, Object> entry : table.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
	
}


class Person {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
