package apache.commons;

import java.text.ParseException;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

/**
 * @description: TODO
 *
 * @createtime: 2013-9-6 上午10:32:10
 *
 * @author zenghua
 *
 * @version 1.0
 */

public class TestDate {
	public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
	
	public static void main(String[] args) throws ParseException {
		String sdate = "2013-09-06 10:32:10";
		
		Date date = DateUtils.parseDate(sdate, DATE_TIME_FORMAT);
		Date date1 = DateUtils.parseDateStrictly(sdate, DATE_TIME_FORMAT);
		Date date2 = DateUtils.addHours(new Date(), -2);
//		System.out.println(date);
		System.out.println(date2);
	}
}
