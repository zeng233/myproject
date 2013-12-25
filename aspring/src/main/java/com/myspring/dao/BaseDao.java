package com.myspring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月17日 下午10:24:37
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class BaseDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public static void main(String[] args) {
		BaseDao dao = new BaseDao();
		dao.t();
	}
	
	public void t() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
		System.out.println(sessionFactory);
	}
}
