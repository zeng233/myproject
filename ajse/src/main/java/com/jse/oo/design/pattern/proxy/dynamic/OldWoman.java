package com.jse.oo.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类
 * @author Administrator
 *
 */
public class OldWoman implements InvocationHandler
{
	//真实对象
    public YoungWoman youngWoman;
    
    public OldWoman(YoungWoman youngWoman) {
    	this.youngWoman = youngWoman;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
    	System.out.println("this is invoke method");
//        return method.invoke(this, args);
        return null;
    }

}
