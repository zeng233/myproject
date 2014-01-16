package com.jse.util;

import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.FastDateFormat;

/**
 * @description: TODO
 *
 * @createTime: 2014年1月9日 下午10:44:34
 *
 * @author zenghua
 *
 * @version 1.0
 */
public class TestDate {
	public static void main(String[] args) {
		String date = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date());
		
		String date1 = DateFormatUtils.format(new Date(), "yyyy-MM-dd");
		System.out.println(date);
		System.out.println(date1);
	}
}
