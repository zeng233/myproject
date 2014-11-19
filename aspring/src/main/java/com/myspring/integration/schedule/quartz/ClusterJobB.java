package com.myspring.integration.schedule.quartz;

import java.util.List;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.util.CollectionUtils;

import com.myspring.dao.user.UserDao;
import com.myspring.model.User;

public class ClusterJobB extends QuartzJobBean
{
	private ApplicationContext ctx;
	
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException
	{
		UserDao userDao = ctx.getBean("userDao", UserDao.class);
		List<User> list = userDao.getUserList();
		System.out.println("user list is : " + list);
		if (!CollectionUtils.isEmpty(list)) {
			System.out.println("user's size : " + list.size());
		}
	}

	public void setCtx(ApplicationContext ctx)
	{
		this.ctx = ctx;
	}
}
