package com.myspring.integration.schedule.quartz;

import java.io.Serializable;
import java.util.List;

import org.springframework.context.ApplicationContext;

import com.myspring.dao.user.UserDao;
import com.myspring.model.User;

public class MethodClusterJob implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1224471182326271481L;
//	private ApplicationContext ctx;
	
	public void query() {
//		UserDao userDao = ctx.getBean("userDao", UserDao.class);
//		List<User> list = userDao.getUserList();
		System.out.println("user list is : " + 1);
	}
}
