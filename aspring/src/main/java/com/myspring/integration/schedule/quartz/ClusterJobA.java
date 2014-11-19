package com.myspring.integration.schedule.quartz;

import java.util.UUID;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.myspring.dao.user.UserDao;
import com.myspring.model.User;

public class ClusterJobA extends QuartzJobBean
{
	private ApplicationContext ctx;

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException
	{
		UserDao userDao = ctx.getBean("userDao", UserDao.class);
		User user = new User();
		user.setUserName("job-" + UUID.randomUUID().toString().substring(0, 4));
		userDao.save(user);
	}

	public ApplicationContext getCtx()
	{
		return ctx;
	}

	public void setCtx(ApplicationContext ctx)
	{
		this.ctx = ctx;
	}

}
