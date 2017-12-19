package com.industrialmojo.ottr.datum

enum Grade {

	KIN('K', 'Kindergarten'),
	FIR('1', 'First'),
	SEC('2', 'Second'),
	THI('3', 'Third'),
	FOU('4', 'Fourth'),
	FIF('5', 'Fifth'),
	SIX('6', 'Sixth'),
	SEV('7', 'Seventh'),
	EIG('8', 'Eighth'),
	NIN('9', 'Ninth'),
	TEN('10', 'Tenth'),
	ELE('11', 'Eleventh'),
	TWE('12', 'Twelth')

	String abbreviated
	String unabbreviated

	Grade(String abbreviated, String unabbreviated) {
		this.abbreviated = abbreviated
		this.unabbreviated = unabbreviated
	}
}