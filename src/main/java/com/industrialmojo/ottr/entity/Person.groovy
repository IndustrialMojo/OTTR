package com.industrialmojo.ottr.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

import com.industrialmojo.ottr.datum.Gender
import com.industrialmojo.ottr.util.TimeUtils

@Entity
@Table(name = "NTT_PERSON")
class Person {

	@Id
	@Column(name = "ID")
	byte[] id

	@Enumerated(EnumType.STRING)
	@Column(name = "GENDER")
	Gender gender

	@Column(name = "BIRTH_DATE")
	private Long birthDate

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "LOCATION_ID", nullable = true)
	Location location

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "NAME_ID", nullable = true)
	Name name

	String getBirthDate() {
		TimeUtils.epochToDateString(birthDate)
	}
}