package com.springmvc.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * description: TODO
 *
 * createtime: 2012-8-27 下午04:32:40
 *
 * @author zenghua
 * @version 1.0
 */

public class User {
	@Size(min = 5, max = 20, message="用户名必须在1到20字符之间")
	private String username;
	@NotNull(message="密码不能为null")
	@Size(min = 1, max = 20, message="密码长度为1到20之间")
	private String password;
	
	private int age;
	
	@DateTimeFormat(iso=ISO.DATE)
	private Date createTime;

	private Role role;
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
