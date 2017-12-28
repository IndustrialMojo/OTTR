package com.industrialmojo.ottr.datum

enum AgeGroup {

	A(0, 8),
	B(9, 10),
	C(11, 12),
	D(13, 14),
	E(15, 99),
	Z(0, 0)

	int floor
	int ceiling

	AgeGroup(Integer floor, Integer ceiling) {
		this.floor = floor
		this.ceiling = ceiling
	}

	public static AgeGroup findByAge(int age) {
		if (!age) {
			return this.Z
		}
		for (AgeGroup ageGroup : values()) {
			if (age >= ageGroup.floor && age <= ageGroup.ceiling) {
				return ageGroup
			}
		}
		return this.Z
	}
}