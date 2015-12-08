package com.jse.oo.design.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OldWoman implements InvocationHandler
{
    public YoungWoman yongWoman;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        return method.invoke(this, args);
    }

}
