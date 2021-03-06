package com.myspring.integration.schedule.quartz;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;

import com.myspring.commons.BaseIoc;

public class TestClusterJob extends BaseIoc
{
	public static void main(String[] args) throws Exception
	{
		TestClusterJob t = new TestClusterJob();
		t.init();
	}
	
	public void init() throws SchedulerException {
		Scheduler sch = context.getBean("schedulerFactory", StdScheduler.class);
		System.out.println(sch);
	}
}
