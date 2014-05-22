package com.myspring.dao.user;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myspring.model.Room;
import com.myspring.model.Student;
import com.myspring.model.User;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月11日 下午11:26:10
 *
 * @author zenghua
 *
 * @version 1.0
 */
@Repository
public class UserDao {
//	private HibernateTemplate template;
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(User user) {
//		template.save(user);
		
		System.out.println(sessionFactory);
		
		Session session = sessionFactory.openSession();
		session.save(user);
	}
	
	/**
	 * 参考：http://stackoverflow.com/questions/8719329/spring-hibernatetemplate-autowiring,
	 * 参考文档:HibernateTemplate,HibernateDAOSupport都不推荐使用
	 * @param sessionFactory
	 */
//	@Autowired
//	public void setSessionFactory(SessionFactory sessionFactory) {
////		template = new HibernateTemplate(sessionFactory);
//	}
//
//	public SessionFactory getSessionFactory() {
//		return sessionFactory;
//	}
	
	
	public List<Room> query() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Room r where r.id=1");
		List<Room> list = (List<Room>)query.list();
		return list;
	}
	
	public void insertUserByJdbc() {
		jdbcTemplate.update("insert into t_user(id,username,password) values(null,'a','a')");
		
	}
}
