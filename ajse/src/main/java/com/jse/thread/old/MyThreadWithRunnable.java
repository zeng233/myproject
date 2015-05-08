package com.jse.thread.old;

/**
 * @description: TODO
 * 
 * @createTime: 2014年5月7日 下午11:23:34
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class MyThreadWithRunnable implements Runnable {
	private String name;

	public MyThreadWithRunnable() {
	};

	public MyThreadWithRunnable(String name) {
		this.name = name;
	};

	@Override
	public void run() {
		System.out.println(name + " implemented by Runbable");
	}
}
