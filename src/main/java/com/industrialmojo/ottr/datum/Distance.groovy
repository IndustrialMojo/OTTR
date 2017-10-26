package com.industrialmojo.ottr.datum

enum Distance {

	A('50'),
	B('100'),
	C('200'),
	D('500')

	private String distance

	Distance(String distance) {
		this.distance = distance
	}
}