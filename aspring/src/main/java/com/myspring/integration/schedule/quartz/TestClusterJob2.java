package com.myspring.integration.schedule.quartz;

import com.myspring.commons.BaseIoc;

public class TestClusterJob2 extends BaseIoc {
	public static void main(String[] args) throws Exception
	{
		TestClusterJob t = new TestClusterJob();
		t.init();
	}
	
	public void init() {
		//打印出 org.quartz.impl.StdScheduler@5ca1f591 ？ TODO
		System.out.println(context);
	}
}
