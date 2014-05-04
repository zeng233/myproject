package com.myweb.test.servlet.listener;

import java.util.Date;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.apache.commons.lang3.time.DateFormatUtils;

/**
 * @description: 测试session监听器
 *
 * @createtime: 2013-7-24 下午1:38:09
 *
 * @author zenghua
 *
 * @version 1.0
 */

@WebListener
public class TestHttpSessionListener implements HttpSessionListener {

	/**
	 * session创建的时候调用
	 */
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println(" sessionid : " + se.getSession().getId());
		System.out.println("TestHttpSessionListener create session : "
				+ se.getSession().getId()
				+ DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
	}

	/**
	 * session过期调用此方法
	 */
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		HttpSession session = (HttpSession) se.getSource();
		System.out.println("TestHttpSessionListener Destroyed session : " + session.getId() + " === 时间 ：" 
				+ DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
		
		session.invalidate();
	}

}
