package com.jse.oo.design.pattern.proxy.static1;

public class ProxySubject implements Subject
{
    private RealSubject realSubject;
    
    public ProxySubject() {
        this.realSubject = new RealSubject();
    }
    
    /**
     * 装饰器模式通过构造函数来传递对象，代理模式是代理类里面自己新建真实的对象
     * @param realSubject
     */
//    public ProxySubject(RealSubject realSubject) {
//        this.realSubject = realSubject;
//    }

    public void beforeRequest() {
        
    }
    
    @Override
    public void request()
    {
        this.beforeRequest();
        realSubject.request();
        this.afterRequest();
    }

    public void afterRequest() {
        
    }
}
