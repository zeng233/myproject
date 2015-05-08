package com.jse.thread.old;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月7日 下午11:05:22
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class ThreadTest {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
//		t.oldMethod();
		t.enhanceMehod();
		System.out.println("this is main");
	}
	
	/**
	 * 原始方法运行Thread
	 */
	public void oldMethod() {
		MyThreadWithThread mythread = new MyThreadWithThread("ThreadA");
		Thread trunnable = new Thread(new MyThreadWithRunnable("rRunnableA"));
		mythread.start();
		trunnable.start();
	}
	
	/**
	 * JDK5之后的方法
	 */
	public void enhanceMehod() {
		MyThreadWithThread mythread = new MyThreadWithThread("new ThreadA");
		Thread trunnable = new Thread(new MyThreadWithRunnable("new rRunnableA"));
		
		ExecutorService exetutor = Executors.newFixedThreadPool(2);
		exetutor.execute(mythread);
		exetutor.execute(trunnable);
		ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
	}
}
