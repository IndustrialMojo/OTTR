package com.industrialmojo.ottr

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity
@Table(name = "NTT_LOCATION")
public class Location {

	@Id
	@Column(name = "ID")
	byte[] id

	@Column(name = "DESCRIPTION")
	String description

	@Column(name = "ADDRESS_1")
	String address1

	@Column(name = "ADDRESS_2")
	String address2

	@OneToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "CITY_STATE_ID", nullable = true)
	CityState cityState
}