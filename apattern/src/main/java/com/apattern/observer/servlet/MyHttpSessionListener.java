package com.apattern.observer.servlet;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @description: 监听器
 *
 * @createtime: 2014-5-20 下午2:33:46
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class MyHttpSessionListener implements HttpSessionListener {

	/**
	 * HttpSessionEvent事件由容器去生成，
	 * 如果是tomcat，参考：StandardSession第407行，新建session的时候，就会触发HttpSessionListener
	 */
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		HttpSession session = arg0.getSession();
		System.out.println("当前session id is " + session.getId());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
