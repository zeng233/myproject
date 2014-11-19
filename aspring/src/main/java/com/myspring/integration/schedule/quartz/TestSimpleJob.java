package com.myspring.integration.schedule.quartz;

import org.quartz.Scheduler;
import org.quartz.impl.StdScheduler;

import com.myspring.commons.BaseIoc;

/**
 * spring集成quartz两种方式：1、继承QuartzJobBean（或者实现job）；
 * 2、使用MethodInvokingJobDetailFactoryBean，指定调用某个方法
 */

public class TestSimpleJob extends BaseIoc
{
	public static void main(String[] args) throws Exception
	{
		TestSimpleJob t = new TestSimpleJob();
		t.run();
	}
	
	public void run() {
		Scheduler sch = context.getBean("schedulerFactory", StdScheduler.class);
		System.out.println(sch);
	}
}
