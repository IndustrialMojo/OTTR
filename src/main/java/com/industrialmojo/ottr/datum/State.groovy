package com.industrialmojo.ottr.datum

import com.fasterxml.jackson.annotation.JsonFormat

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
enum State {

	AL('Alabama', 'AL'),
	AK('Alaska', 'AK'),
	AZ('Arizona', 'AZ'),
	AR('Arkansas', 'AR'),
	CA('California', 'CA'),
	CO('Colorado', 'CO'),
	CT('Connecticut', 'CT'),
	DE('Delaware', 'DE'),
	DC('District of Columbia', 'DC'),
	FL('Florida', 'FL'),
	GA('Georgia', 'GA'),
	HI('Hawaii', 'HI'),
	ID('Idaho', 'ID'),
	IL('Illinois', 'IL'),
	IN('Indiana', 'IN'),
	IA('Iowa', 'IA'),
	KS('Kansas', 'KS'),
	KY('Kentucky', 'KY'),
	LA('Louisiana', 'LA'),
	ME('Maine', 'ME'),
	MD('Maryland', 'MD'),
	MA('Massachusetts', 'MA'),
	MI('Michigan', 'MI'),
	MN('Minnesota', 'MN'),
	MS('Mississippi', 'MS'),
	MO('Missouri', 'MO'),
	MT('Montana', 'MT'),
	NE('Nebraska', 'NE'),
	NV('Nevada', 'NV'),
	NH('New Hampshire', 'NH'),
	NJ('New Jersey', 'NJ'),
	NM('New Mexico', 'NM'),
	NY('New York', 'NY'),
	NC('North Carolina', 'NC'),
	ND('North Dakota', 'ND'),
	OH('Ohio', 'OH'),
	OK('Oklahoma', 'OK'),
	OR('Oregon', 'OR'),
	PA('Pennsylvania', 'PA'),
	RI('Rhode Island', 'RI'),
	SC('South Carolina', 'SC'),
	SD('South Dakota', 'SD'),
	TN('Tennessee', 'TN'),
	TX('Texas', 'TX'),
	UT('Utah', 'UT'),
	VT('Vermont', 'VT'),
	VA('Virginia', 'VA'),
	WA('Washington', 'WA'),
	WV('West Virginia', 'WV'),
	WI('Wisconsin', 'WI'),
	WY('Wyoming', 'WY'),
	PR('Puerto Rico', 'PR')

	String unabbreviated
	String abbreviated

	State(String unabbreviated, String abbreviated) {
		this.unabbreviated = unabbreviated
		this.abbreviated = abbreviated
	}

	public String getUnabbreviated() {
		this.unabbreviated
	}

	public String getAbbreviated() {
		this.abbreviated
	}

	public static State parse(String input) {
		if (!input) {
			null
		}
		input = input.trim()
		for (State state : values()) {
			if (state.unabbreviated.equalsIgnoreCase(input) ||
			state.abbreviated.equalsIgnoreCase(input)) {
				state
			}
		}
		null
	}
}