package com.jse.exception.checked;

/**
 * @description: 执行异常后，后面的代码不会执行了
 *
 * @createtime: 2013-5-28 下午10:06:58
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestCheckedExcepton {
	public static void main(String[] args) throws Exception {
		String s = null;
		
		if (s == null) {
			throw new Exception("1111");
		}
		
		System.out.println(2222);
	}
}
