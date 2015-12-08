package com.jse.oo.design.pattern.proxy.static1;

public class RealSubject implements Subject
{

    @Override
    public void request()
    {
        System.out.println("this is RealSubject's request");
    }

}
