package com.jse.exception.commons;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO
 * 
 * @createtime: 2014-2-7 上午10:54:45
 * 
 * @author zenghua
 * 
 * @version 1.0
 */

public class NoClassDefFoundErrorDueToStaticInitFailure {
	public static void main(String args[]) {

		List<User> users = new ArrayList<User>(2);

		for (int i = 0; i < 2; i++) {
			try {
				users.add(new User(String.valueOf(i))); // will throw
														// NoClassDefFoundError
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}
	}

}
