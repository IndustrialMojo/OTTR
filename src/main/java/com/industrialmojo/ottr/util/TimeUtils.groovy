package com.industrialmojo.ottr.util

import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId

class TimeUtils {

	public static LocalDate epochToLocalDate(long epoch){
		Instant.ofEpochMilli(epoch).atZone(ZoneId.of('UTC')).toLocalDate()
	}

	public static String epochToDateString(long epoch){
		LocalDate localDate = epochToLocalDate(epoch)
		String month = localDate.getMonth().toString()
		String day = localDate.getDayOfMonth().toString()
		String year = localDate.getYear().toString()
		month + '/' + day + '/' + year
	}
}