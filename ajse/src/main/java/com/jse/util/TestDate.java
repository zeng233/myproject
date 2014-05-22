package com.jse.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
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
	public static void main(String[] args) throws Exception {
		String date = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss").format(new Date());
		
		String date1 = DateFormatUtils.format(new Date(), "yyyy-MM-dd");
		System.out.println(date);
		System.out.println(date1);
		
		TestDate t = new TestDate();
		t.testCompareDate();
	}
	
	
	public void testCompareDate() throws Exception {
		DateFormat format = new SimpleDateFormat("yyyyMMdd");
		String s = "20130614";
//		System.out.println(s.substring(0, 8));
		Date date = format.parse(s);
//		System.out.println(date);
		Date date1 = new Date();
		System.out.println(date.compareTo(date1));
		System.out.println(DateUtils.addYears(date, -1000));
	}
}
