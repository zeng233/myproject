package com.myspring.core.ioc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.myspring.model.Prototype;
import com.myspring.model.Singleton;

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
	public static final Log log = LogFactory.getLog(TestIoc.class);
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-config.xml");
	
	public static void main(String[] args) {
		TestIoc t = new TestIoc();
		
		t.testCommonBean();
		
	}
	
	/**
	 * 测试bean的作用域，判断Ioc注入bean是否一样，
	 */
	public void testBeanScope() {
		Singleton s1 = context.getBean("singleton", Singleton.class);
		Singleton s2 = context.getBean("singleton", Singleton.class);
		//返回true
		System.out.println("单例两个对象s1==s2: " + (s1==s2));
		Prototype p1=context.getBean("prototype", Prototype.class);
		Prototype p2=context.getBean("prototype", Prototype.class);
		//返回false
		System.out.println("原始模式两个对象p1==p2: " +(p1==p2));
	}
	
	/**
	 * bean的继承关系
	 */
	public void testInheritance() {
		log.info(context.getBean("child"));
		log.info(context.getBean("c"));
	}
	
	/**
	 * 获取一般的bean
	 */
	public void testCommonBean() {
		//实现了FactoryBean接口，实用getBean方法不能直接获取对象，参考5.8（Customizing instantiation logic with a FactoryBean）
		System.out.println(context.getBean("&sessionFactory", LocalSessionFactoryBean.class)); 
		//LocalSessionFactoryBean实现的FactoryBean接口，返回的对象为getObject()获取的对象
		System.out.println(context.getBean("sessionFactory", SessionFactory.class)); 
		
//		HibernateTransactionManager t = context.getBean("hibernateTxManager", HibernateTransactionManager.class);
//		System.out.println(t.getSessionFactory());
		
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println(jdbcTemplate);
		
		System.out.println("================容器中注入的Beans=====================");
		String[] names = context.getBeanDefinitionNames();
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
}
