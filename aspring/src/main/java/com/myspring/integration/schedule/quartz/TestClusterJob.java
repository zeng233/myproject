package com.myspring.integration.schedule.quartz;

import com.myspring.commons.BaseIoc;

public class TestClusterJob extends BaseIoc
{
	public static void main(String[] args)
	{
		TestClusterJob t = new TestClusterJob();
		t.init();
	}
	
	public void init() {
		System.out.println(context);
	}
}
