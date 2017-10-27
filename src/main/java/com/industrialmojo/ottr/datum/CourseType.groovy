package com.industrialmojo.ottr.datum

enum CourseType {

	SCY('Short Course Yards'),
	LCY('Long Course Yards'),
	SCM('Short Course Meters'),
	LCM('Long Course Meters')

	private String unabbreviated

	CourseType(String unabbreviated) {
		this.unabbreviated = unabbreviated
	}
}