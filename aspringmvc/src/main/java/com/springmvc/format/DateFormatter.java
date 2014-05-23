package com.springmvc.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

/**
 * @description TODO
 *
 * @author zenghua
 *
 * @createtime 2012-12-13 下午09:57:28
 */

public class DateFormatter implements Formatter<Date> {
	@DateTimeFormat(iso=ISO.DATE)
	private Date date;
	
	private String pattern;

	public DateFormatter(String pattern) {
		this.pattern = pattern;
	}

	public String print(Date date, Locale locale) {
		if (date == null) {
			return "";
		}
		return getDateFormat(locale).format(date);
	}

	public Date parse(String formatted, Locale locale) throws ParseException {
		if (formatted.length() == 0) {
			return null;
		}
		return getDateFormat(locale).parse(formatted);
	}

	protected DateFormat getDateFormat(Locale locale) {
		DateFormat dateFormat = new SimpleDateFormat(this.pattern, locale);
		dateFormat.setLenient(false);
		return dateFormat;
	}
	
	public static void main(String[] args) {
		DateFormatter df = new DateFormatter("yyyy-MM-dd");
		System.out.println(df.print(new Date(), Locale.CHINA));
	}
}
