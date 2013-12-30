package com.myspring.core.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月17日 下午10:20:32
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestIoc {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
		//实现了FactoryBean接口，实用getBean方法不能直接获取对象，参考5.8（Customizing instantiation logic with a FactoryBean）
		System.out.println(context.getBean("&sessionFactory", LocalSessionFactoryBean.class)); //不能直接获取LocalSessionFactoryBean（抛异常）
		
		HibernateTransactionManager t = context.getBean("transactionManager", HibernateTransactionManager.class);
		System.out.println(t.getSessionFactory());
		
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println(jdbcTemplate);
		
		System.out.println("================容器中注入的Beans=====================");
		String[] names = context.getBeanDefinitionNames();
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
	}
}
