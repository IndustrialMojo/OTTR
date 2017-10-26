package com.industrialmojo.ottr.datum

enum CourseType {

	A("SCY", "Short Course Yards"),
	B("LCY", "Long Course Yards"),
	C("SCM", "Short Course Meters"),
	D("LCM", "Long Course Meters")

	private String abbreviated
	private String unabbreviated

	CourseType(String abbreviated, String unabbreviated) {
		this.abbreviated = abbreviated
		this.unabbreviated = unabbreviated
	}
}