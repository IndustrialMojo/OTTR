package com.industrialmojo.ottr

enum Units {

	A("YD", "Yards"),
	B("M", "Meters")

	private String abbreviated
	private String unabbreviated

	Units(String abbreviated, String unabbreviated) {
		this.abbreviated = abbreviated
		this.unabbreviated = unabbreviated
	}
}
