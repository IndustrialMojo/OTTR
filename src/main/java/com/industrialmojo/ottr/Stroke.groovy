package com.industrialmojo.ottr

enum Stroke {

	A("BK", "Backstroke"),
	B("BR", "Breaststroke"),
	C("FL", "Butterfly"),
	D("FR", "Freestyle"),
	E("IM", "Individual Medley"),
	F("MR", "Medley Relay"),
	G("RF", "Free Relay")

	private String abbreviated
	private String unabbreviated

	Stroke(String abbreviated, String unabbreviated) {
		this.abbreviated = abbreviated
		this.unabbreviated = unabbreviated
	}
}