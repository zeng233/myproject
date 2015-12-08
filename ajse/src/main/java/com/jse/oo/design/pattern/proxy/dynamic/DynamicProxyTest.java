package com.jse.oo.design.pattern.proxy.dynamic;

import java.lang.reflect.Proxy;

public class DynamicProxyTest
{
    public static void main(String[] args)
    {
       Woman woman = (Woman) Proxy.newProxyInstance(Woman.class.getClassLoader(), new Class[] {Woman.class}, new OldWoman());
       
    }
}
