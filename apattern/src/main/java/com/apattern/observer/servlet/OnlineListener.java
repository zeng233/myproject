package com.apattern.observer.servlet;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @description: TODO
 *
 * @createtime: 2014-5-20 下午3:39:24
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class OnlineListener implements HttpSessionListener, HttpSessionAttributeListener {

	// 参数  
    ServletContext sc;  
  
    ArrayList<String> list = new ArrayList<String>();  
  
    // 新建一个session时触发此操作 
    @Override
    public void sessionCreated(HttpSessionEvent se) {  
        sc = se.getSession().getServletContext();  
        System.out.println("新建一个session");  
    }  
  
    // 销毁一个session时触发此操作  
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {  
        System.out.println("销毁一个session");  
        if (!list.isEmpty()) {  
            list.remove((String) se.getSession().getAttribute("userName"));  
            sc.setAttribute("list", list);  
        }  
    }  
  
    // 在session中添加对象时触发此操作，在list中添加一个对象  
    @Override
    public void attributeAdded(HttpSessionBindingEvent sbe) {  
        list.add((String) sbe.getValue());  
        System.out.println(sbe.getValue());  
        sc.setAttribute("list", list);  
    }  
  
    // 修改、删除session中添加对象时触发此操作  
    @Override
    public void attributeRemoved(HttpSessionBindingEvent arg0) {  
          
        System.out.println("5555555");  
    }  
  
    @Override
    public void attributeReplaced(HttpSessionBindingEvent arg0) {  
        System.out.println("77777777");  
    }  

}
