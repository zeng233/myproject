package com.jse.oo.design.pattern.proxy.static1;

/**
 * 代理模式与装饰器模式以及适配器模式的区别：
 * 代理模式：控制对象的访问，在代理类访问真正对象的方法，可以加一些判断控制
 * 装饰器模式：在一个对象上面动态的增加方法
 */
public class StaticProxyTest
{
    public static void main(String[] args)
    {
        Subject subject = new ProxySubject();
        subject.request();
    }
}
