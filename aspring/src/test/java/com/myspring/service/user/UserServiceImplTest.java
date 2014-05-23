package com.myspring.service.user;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myspring.model.User;

/**
 * @description: 测试事务，也可以继承AbstractTransactionalJUnit4SpringContextTests
 *
 * @createtime: 2014-5-23 下午2:56:59
 *
 * @author zenghua
 *
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value={"classpath:spring/application-config.xml"})
public class UserServiceImplTest {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private UserService userService;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		System.out.println(sessionFactory);
	}

	/**
	 * 判断是否启用事务
	 */
	@Test
	public void testGetUser() {
		List<User> list = userService.getUser();
		
		assertEquals(1, list.size());
	}
}
