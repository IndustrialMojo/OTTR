package com.industrialmojo.ottr.util

import java.time.Instant
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class TimeUtils {

	public static LocalDate epochToLocalDate(long epoch){
		Instant.ofEpochMilli(epoch).atZone(ZoneId.of('UTC')).toLocalDate()
	}

	public static LocalDateTime epochToLocalDateTime(long epoch){
		Instant.ofEpochMilli(epoch).atZone(ZoneId.of('UTC')).toLocalDateTime()
	}

	public static String epochToDateString(long epoch){
		LocalDate localDate = epochToLocalDate(epoch)
		StringBuilder sb = new StringBuilder()
		sb.append(String.format("%02d", localDate.monthValue))
		sb.append('/')
		sb.append(String.format("%02d", localDate.dayOfMonth))
		sb.append('/')
		sb.append(localDate.getYear().toString())
		sb.toString()
	}

	public static String epochToYearString(long epoch){
		LocalDate localDate = epochToLocalDate(epoch)
		localDate.getYear().toString()
	}

	public static String centisecondsToTimeString(long epoch){
		LocalDateTime localDateTime = epochToLocalDateTime(epoch)
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern('mm:ss.SS')
		String formatDateTime = localDateTime.format(dateTimeFormatter)
	}

	public static String centisecondsToTimeString(Float value){
		String mm = BigDecimal.valueOf(Double.valueOf(Math.floor(value / 60))).setScale(0, BigDecimal.ROUND_HALF_UP).toString()
		BigDecimal bd = BigDecimal.valueOf(Double.valueOf(value) % 60).setScale(2, BigDecimal.ROUND_HALF_UP)
		String ss = (bd.compareTo(new BigDecimal(10)) < 0) ? '0' + bd.toString() : bd.toString()
		mm + ':' + ss
	}
}