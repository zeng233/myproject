package com.jse.thread.old.thread;

import com.jse.thread.old.ThreadLocalTest;

public class FooThread extends Thread {
    
    
    private String name;
    
    public FooThread() {}
    
    public FooThread(String name) {
        this.name = name;
    }
    
	@Override
	public void run() {
	    ThreadLocalTest t = new ThreadLocalTest();
	    String threadName = name + "当前ID为：";
//		System.out.println(name + "当前ID为：" + ThreadLocalTest.uniqueId.get());
	    
	    t.setValue();
	    try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	    System.out.println(threadName + t.getValue());
	}
}
