package com.myspring.dataaccess.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.myspring.commons.BaseIoc;
import com.myspring.dao.user.UserDao;
import com.myspring.model.Room;
import com.myspring.model.User;
import com.myspring.service.user.UserService;
import com.myspring.web.tag.pagination.Page;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月17日 下午10:17:57
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestHibernate extends BaseIoc {
	UserService userService = context.getBean("userService", UserService.class);
	UserDao userDao = context.getBean("userDao", UserDao.class);
	
	public static void main(String[] args) {
		TestHibernate t = new TestHibernate();
//		t.testQuery();
//		t.save();
		
//		for (int i = 29; i < 50; i++) {
//			User user = new User();
//			user.setUserName("a" + i);
//			user.setPassword("b" + i);
//			t.save(user);
//		}
		
//		t.insertUserByJdbc();
		
		t.testFindByPage();
	}
	
	public void testQuery() {
		SessionFactory factory = context.getBean("sessionFactory", SessionFactory.class);
		System.out.println(factory);
		Session session = factory.openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			Query query = session.createQuery("select r from Room r join r.students s where s.id=1");
			List<Room> list = (List<Room>)query.list();
			for (Room r : list) {
				System.out.println(r.getRoomid());
			}
			tx.commit();
		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
	
	
	public void save(User user) {
		userService.save(user);
		
//		List<Room> list = userService.query();
//		System.out.println(list);
	}
	
	public void insertUserByJdbc() {
		userService.insertUserByJdbc();
	}
	
	public void testFindByPage() {
		User user = new User();
		Page page = new Page();
		List<User> users = userDao.findUserByPage(user, page);
		System.out.println(users);
	}
}
