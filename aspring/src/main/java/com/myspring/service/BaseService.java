package com.myspring.service;

import com.myspring.model.User;

/**
 * @description: TODO
 * 
 * @createTime: 2013年12月17日 下午10:25:03
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class BaseService {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
