package com.jse.thread.old;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import com.jse.thread.old.thread.FooThread;


/**
 * http://www.ibm.com/developerworks/cn/java/j-threads/index3.html
 */
public class ThreadLocalTest {
    public static final AtomicInteger uniqueId = new AtomicInteger(0);

    //每个线程的初始值，如果调用了set方法，初始值就不会赋值了
//    public static final ThreadLocal <Integer> uniqueNum = new ThreadLocal <Integer> () {
//            @Override protected Integer initialValue() {
//                return uniqueId.getAndIncrement();
//        }
//    };
    
    public static final ThreadLocal<Integer> uniqueNum = new ThreadLocal<Integer>();
    
    public void setValue() {
        uniqueNum.set((int)(Math.random() * 100000D));
    }
    
    public int getValue() {
        return uniqueNum.get();
    }
	
	public static void main(String[] args) {
		ThreadLocalTest t = new ThreadLocalTest();
		t.mutiGet();
//		int i = (int)100.11d;
//		System.out.println(i);
		
	}
	
	public void mutiGet() {
	    System.out.println(this);
		List<FooThread> list = new ArrayList<FooThread>();
		for (int i = 0; i < 20; i++) {
		    FooThread mythread = new FooThread("线程" + i);
			list.add(mythread);
		}
		for (FooThread e : list) {
			e.start();
		}
	}
}
