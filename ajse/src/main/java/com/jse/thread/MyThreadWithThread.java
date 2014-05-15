package com.jse.thread;

/**
 * @description: TODO
 * 
 * @createTime: 2014年5月7日 下午11:22:47
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class MyThreadWithThread extends Thread {
	private String name;

	public MyThreadWithThread() {
	};

	public MyThreadWithThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		System.out.println(name + " implemented by Thread");
	}
}
