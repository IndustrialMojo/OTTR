package com.industrialmojo.ottr.datum

enum Distance {

	A('50'),
	B('100'),
	C('200'),
	D('400'),
	E('500'),
	F('1000'),
	G('1650')

	String distance

	Distance(String distance) {
		this.distance = distance
	}
}