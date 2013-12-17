package com.myspring.model;

/**
 * @description: TODO
 * 
 * @createTime: 2013年12月11日 下午11:02:08
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
public class User {
	private Integer id;
	private String userName;
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
