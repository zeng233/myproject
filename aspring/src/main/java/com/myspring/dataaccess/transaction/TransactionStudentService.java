package com.myspring.dataaccess.transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.model.Room;
import com.myspring.model.Student;

/**
 * @description: hibernate操作student
 *
 * @createtime: 2014-5-27 上午10:56:03
 *
 * @author zenghua
 *
 * @version 1.0
 */
@Service
public class TransactionStudentService {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Student student) {
		//如果sessionFactory使用openSession,spring渲染的事务就不会起作用，
		//因为是新开启的一个session，并且没有配置事务，将是非事务方式执行
		Session session = sessionFactory.getCurrentSession();
		session.save(student);
		
//		try {
//			Thread.sleep(300000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		throw new RuntimeException();
	}
	
	@Transactional
	public void saveRoom(Room room) {
		Session session = sessionFactory.getCurrentSession();
		session.save(room);
	}
}
