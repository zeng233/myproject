package com.jse.exception.commons;

/**
 * @description: TODO
 * 
 * @createtime: 2014-2-7 上午10:54:10
 * 
 * @author zenghua
 * 
 * @version 1.0
 */

public class User {
	private static String USER_ID = getUserId();

	public User(String id) {
		this.USER_ID = id;
	}

	private static String getUserId() {
		throw new RuntimeException("UserId Not found");
	}

}
