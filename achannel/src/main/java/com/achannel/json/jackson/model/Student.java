package com.achannel.json.jackson.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @description: TODO
 *
 * @createtime: 2014-3-12 上午9:31:09
 *
 * @author zenghua
 *
 * @version 1.0
 */

@JsonIgnoreProperties({ "description" })//忽略属性
public class Student {
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
