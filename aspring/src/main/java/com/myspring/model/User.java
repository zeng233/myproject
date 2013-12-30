package com.myspring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description: TODO
 * 
 * @createTime: 2013年12月11日 下午11:02:08
 * 
 * @author zenghua
 * 
 * @version 1.0
 */
@Entity
@Table(name="t_user")
public class User extends AbstractEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2217883782925757847L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
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
