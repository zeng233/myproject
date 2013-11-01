package com.jse.block.loop;

/**
 * @description: 测试dowhile，java官方教程
 *
 * @createtime: 2013-5-22 下午3:20:56
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestDoWhile {
	public static void main(String[] args) {
		int count = 1;
		//
		do {
			try {
				System.out.println(count);
				count ++;
			} finally {}
		} while (count < 1);
	}
}
