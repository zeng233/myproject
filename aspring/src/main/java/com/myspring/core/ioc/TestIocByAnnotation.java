package com.myspring.core.ioc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @description: TODO
 *
 * @createTime: 2014年1月18日 下午10:51:03
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestIocByAnnotation {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
	
	public static void main(String[] args) {
		TestIocByAnnotation t = new TestIocByAnnotation();
		t.getCxt();
		
	}
	
	public void getCxt() {
		Map<String, Object> map = context.getBeansWithAnnotation(Component.class);
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			System.out.println("key : " + entry.getKey() + ", value : " + entry.getValue());
		}
	}
}
