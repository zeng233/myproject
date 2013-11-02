package com.myweb.dao;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.myweb.entity.User;

/**
 * description: TODO
 *
 * createtime: 2013-4-16 上午11:44:10
 *
 * @author zenghua
 * @version 1.0
 */

public class UserDAOTest {
	private static UserDAO userDAO;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userDAO = new UserDAO();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * Test method for {@link com.myweb.dao.UserDAO#save(com.myweb.entity.User)}.
	 */
	@Test
	public void testSave() {
		User user = new User();
		user.setUserName("t");
		user.setPassword("t");
		user.setCreateTime(new Date());
		userDAO.save(user);
	}

	
}
