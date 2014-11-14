package com.myspring.integration;

import com.myspring.commons.BaseIoc;

/**
 * 测试spring自带的定时任务
 */

public class TestSpringScheduling extends BaseIoc
{
	public static void main(String[] args) throws Exception
	{
		TestSpringScheduling t = new TestSpringScheduling();
		t.testBean();
	}
	
	
	public void testBean() {
		MyTaskJob job = context.getBean("myTaskJob", MyTaskJob.class);
		System.out.println(job);
	}
}
