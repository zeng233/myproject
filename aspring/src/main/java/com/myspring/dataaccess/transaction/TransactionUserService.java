package com.myspring.dataaccess.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.model.Room;
import com.myspring.model.Student;
import com.myspring.model.User;

/**
 * @description: JDBC操作User
 *
 * @createtime: 2014-5-27 上午10:52:44
 *
 * @author zenghua
 *
 * @version 1.0
 */
@Service
@Transactional
public class TransactionUserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private TransactionStudentService studentService;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void saveUser(User user) {
		//jdbc操作
		jdbcTemplate.update("INSERT INTO t_user(id, username, password) VALUES(NULL,?,?)", 
				user.getUserName(), user.getPassword());
		
		//hibernate操作
		Student student = new Student();
		student.setName("Student1");
		studentService.save(student);
//		throw new RuntimeException();
	}
	
	/**
	 * 在类的表头加上@Transaction，测试其他方法是否会开启事务
	 */
	public void isTransaction() {
		jdbcTemplate.update("INSERT INTO room(roomid, roomname) VALUES(NULL, ?)", "ROOMA");
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 多线程测试
	 */
	public void multiTread() {
		Student student = new Student();
		student.setName("multiTread-Student");
		studentService.save(student);
		
		MyThread mt = new MyThread(studentService);
		mt.start();
	}
	
	class MyThread extends Thread {
		private TransactionStudentService service;
		MyThread(TransactionStudentService service) {
			this.service = service;
		}
		
		@Override
		public void run() {
			Room room = new Room();
			room.setRoomname("RoomTread");
			service.saveRoom(room);//另外开启一个线程，TransactionStudentService中的sessionFactory.getCurrentSession就不能获取Session了TODO
			
//			jdbcTemplate.update("INSERT INTO room(roomid, roomname) VALUES(NULL, 'RoomThreadA')");
//			throw new RuntimeException();//此线程为一个新开启的事务，抛出异常不会回滚
		}
	}
}
