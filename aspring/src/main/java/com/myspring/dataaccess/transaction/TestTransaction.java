package com.myspring.dataaccess.transaction;

import com.myspring.commons.BaseIoc;
import com.myspring.model.User;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月17日 下午10:21:08
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestTransaction extends BaseIoc {
	public static void main(String[] args) {
		TestTransaction t = new TestTransaction();
//		t.mixTransaction();
		
		t.multiThread();
	}
	
	/**
	 * hibernate与JDBC混用，事务管理
	 */
	public void mixTransaction() {
		TransactionUserService userService = context.getBean("transactionUserService", TransactionUserService.class);
		TransactionStudentService studentService = context.getBean("transactionStudentService", TransactionStudentService.class);
		
		User user = new User();
		user.setUserName("lisi");
		user.setPassword("2222");
//		userService.saveUser(user);
		
		userService.isTransaction();
	}
	
	/**
	 * 多事务并发
	 */
	public void multiThread() {
		TransactionUserService userService = context.getBean("transactionUserService", TransactionUserService.class);
		userService.multiTread();
	}
}
