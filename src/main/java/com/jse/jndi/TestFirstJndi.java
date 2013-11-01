package com.jse.jndi;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * @description: TODO
 *
 * @createtime: 2013-6-20 下午4:41:40
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestFirstJndi {
	public static void main(String[] args) throws NamingException {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
	}
}
