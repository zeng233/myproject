package com.myspring.integration.schedule.spring;

import com.myspring.commons.BaseIoc;

/**
 * spring自带的定时器
 */

public class TestJob extends BaseIoc
{
	public static void main(String[] args)
	{
		TestJob t = new TestJob();
		t.testThreadPoolTaskExecutor();
	}
	
	/**
	 * ThreadPoolTaskExecutor里面包含了@java.util.concurrent.ThreadPoolExecutor,
	 * 在里面可以根据自己的业务需求配置不同的参数进行执行
	 */
	public void testThreadPoolTaskExecutor() {
		TaskExecutorJob job = context.getBean("springTaskJob", TaskExecutorJob.class);
		job.printMessages();
	}
	
	
}
