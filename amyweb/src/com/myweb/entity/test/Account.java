package com.myweb.entity.test;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 测试javabean
 *
 * @createtime: 2013-7-26 下午2:59:20
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1511044510412688201L;
	
	private int id;
	private String name;
	private String realname;
	private Date createTime;
	
	public Account() {
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
