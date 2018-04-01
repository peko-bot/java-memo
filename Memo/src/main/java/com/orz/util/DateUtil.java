package com.orz.util;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String formatDateTime(Date dateTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(dateTime);
	}

	public static String formatDate(Date dateTime, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(dateTime);
	}

	public static Date parseDateTime(String dateTime) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		ParsePosition pos = new ParsePosition(0);
		Date date = sdf.parse(dateTime, pos);
		return date;
	}

	public static Date parseDate(String dateTime, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		ParsePosition pos = new ParsePosition(0);
		Date date = sdf.parse(dateTime, pos);
		return date;
	}

}
