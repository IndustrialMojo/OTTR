package com.industrialmojo.ottr.datum

enum Gender {

	F('Female'),
	M('Male')

	String unabbreviated

	Gender(String unabbreviated) {
		this.unabbreviated = unabbreviated
	}
}