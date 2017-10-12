package com.industrialmojo.ottr

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "NTT_PERSON")
class Person {
	
	@Id
	@Column(name = "ID")
	byte[] id
	
	@Column(name = "GENDER")
	String gender

	@Column(name = "BIRTH_DATE")
	Long birthDate

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "LOCATION_ID", nullable = true)
	Location location

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "NAME_ID", nullable = true)
	Name name
}