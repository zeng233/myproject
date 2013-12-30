package com.myspring.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月30日 下午11:17:15
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
