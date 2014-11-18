package com.myspring.integration.schedule.quartz;

import org.quartz.SchedulerException;

import com.myspring.commons.BaseIoc;

public class TestClusterJob2 extends BaseIoc {
	public static void main(String[] args) throws Exception
	{
		TestClusterJob t = new TestClusterJob();
		t.init();
	}
	
	public void init() {
		System.out.println(context);
	}
}
