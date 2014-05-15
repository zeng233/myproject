package com.jse.block;

/**
 * @description: TODO
 *
 * @createTime: 2014年5月7日 下午10:36:55
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestTryCatch {
	public static void main(String[] args) {
		TestTryCatch t = new TestTryCatch();
		String s = t.TryCatchWithReturn();
		System.out.println(s);
	}
	
	/**
	 * try\catch\finally带return语句执行情况
	 * 
	 * finally{}语句在try{}里面return语句执行之前执行
	 * @return
	 */
	public String TryCatchWithReturn() {
		try {
			
			return "this is return";
		} catch (Exception e) {
			
		} finally {
			System.out.println("this is finally{}");
//			return "this is fianl";//finally也有return语句，先执行哪个？？
		}
		return null;
	}
}
