package com.myspring.core.ioc;

import com.myspring.core.ioc.bean.InitBeanInXml;
import com.myspring.core.ioc.bean.MyInitBean;

/**
 * @description: 测试自定义的bean
 *
 * @createTime: 2014年1月17日 上午12:13:59
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestCustomerBean extends BaseIoc1 {
	public static void main(String[] args) {
		TestCustomerBean t = new TestCustomerBean();
		t.testInit();
	}
	
	public void testInit() {
		context.getBean("prototype");
		//容器初始化的时候把全部的bean都一起初始化
		MyInitBean myInitBean = context.getBean("myInitBean", MyInitBean.class);
		InitBeanInXml initBeanInXml = context.getBean("initBeanInXml", InitBeanInXml.class);
		//myInitBean为什么不能直接取到属性 TODO
		System.out.println(myInitBean==myInitBean.get());
	}
}
