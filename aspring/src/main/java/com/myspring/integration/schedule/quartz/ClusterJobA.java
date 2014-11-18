package com.myspring.integration.schedule.quartz;

import java.util.UUID;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.myspring.dao.user.UserDao;
import com.myspring.model.User;

public class ClusterJobA implements Job
{
	@Autowired
	private UserDao userDao;
	
//	public void run() {
//		User user = new User();
//		user.setUserName("job-" + UUID.randomUUID().toString().substring(0, 4));
//		userDao.save(user);
//	}

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException
	{
		User user = new User();
		user.setUserName("job-" + UUID.randomUUID().toString().substring(0, 4));
		userDao.save(user);
	}
	
//	public static void main(String[] args)
//	{
//		System.out.println(UUID.randomUUID().toString().substring(0, 4));
//	}
}
