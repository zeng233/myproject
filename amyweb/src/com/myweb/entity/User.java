package com.myweb.entity;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * description: 用户
 *
 * createtime: 2013-1-23 上午10:21:43
 *
 * @author zenghua
 * @version 1.0
 */

public class User implements Comparable<User>, Serializable {
	/**
	 * 主要用于网路传输，辨别不同的对象
	 */
	private static final long serialVersionUID = 7740483662978204849L;
	
	private int id;
	
	private String userName;
	private String password;
	private Date createTime;
	
	private String imageUrl;
	
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	//可以看到对象里面所有的属性值
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	@Override
	public int compareTo(User o) {
		//按照时间排序，如果此对象还有其他业务需求进行排序，Collections.sort一个覆盖方法中传入实现Comparator接口的对象，重写compareTo即可
		return new CompareToBuilder().append(createTime, o.createTime).toComparison();
	}
}
