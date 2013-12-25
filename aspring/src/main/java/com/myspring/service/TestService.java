package com.myspring.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月25日 下午10:37:13
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestService implements InitializingBean {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private ApplicationContext cxt;
	
	private TestService testService;

	@Override
	public void afterPropertiesSet() throws Exception {
		testService = cxt.getBean("testService", TestService.class);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
