package com.industrialmojo.ottr.datum

enum Stroke {

	BK('Backstroke'),
	BR('Breaststroke'),
	FL('Butterfly'),
	FR('Freestyle'),
	IM('Individual Medley'),
	MR('Medley Relay'),
	RF('Free Relay')

	private String unabbreviated

	Stroke(String abbreviated, String unabbreviated) {
		this.unabbreviated = unabbreviated
	}
}