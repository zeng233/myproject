package com.myspring.integration.schedule.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class SpringJobBean extends QuartzJobBean
{

	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException
	{
		System.out.println("SpringJobBean is excuted!");
	}

}
