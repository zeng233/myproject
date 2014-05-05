package com.test.exception;

/** 
 * <p>Title: MyException.java</p>
 * <p>Description: TODO</p>
 * <p>Copyright：Copyright(c)2011</p>
 * <p>Company: 成都四方信息技术有限公司</p>
 * <p>CreateTime：2011-12-26 上午09:02:31</p>
 * @author zenghua
 * @version 1.0
 */

public class MyException extends Exception {
	private String message;
	
	public MyException() {
		super();
	}
	
	public MyException(String message) {
		super(message);
	}
}
