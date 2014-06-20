package com.cobia.util;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeUtil {
	public static String toString(LocalDateTime localDateTime) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		return dateTimeFormatter.print(localDateTime);
	}
	public static LocalDateTime parse(String dateTimeString) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
		return dateTimeFormatter.parseLocalDateTime(dateTimeString);
	}
}

